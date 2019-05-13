package com.hns.learn;

import com.hns.learn.mapper.BizCanvasMapper;
import com.hns.learn.util.ExcelUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class getTabls {

    @Autowired
    private BizCanvasMapper bizCanvasMapper;

    @Test
    public void getTable() {

        List<Map> tableList =  bizCanvasMapper.selTables("BIZ_DEBT_MAIN");
        String dateStr = DateFormatUtils.format(new Date(),"yyyyMMdd-HHmmSS-SSS");

        String[] titles = {"表名","列名","类型","长度","为空","索引","主键","描述"};
        String[][] centerVal = new String[tableList.size()][titles.length];

        for (int i = 0; i < tableList.size(); i++) {

            Map<String,Object> map = tableList.get(i);
            String tableName = (String) map.get("TABLE_NAME");
            /*if(!(tableName.startsWith("BIZ") || tableName.startsWith("INF"))){
                continue;
            }*/
            centerVal[i][0] = tableName;
            String columnName = (String) map.get("COLUMN_NAME");
            centerVal[i][1] = columnName;
            centerVal[i][2] = (String) map.get("DATA_TYPE");
            if("VARCHAR2".equals((String) map.get("DATA_TYPE"))){
                centerVal[i][3] = map.get("DATA_LENGTH").toString();
            }else{
                String nbrStr = map.get("DATA_PRECISION")==null?"":(map.get("DATA_SCALE")==null)?map.get("DATA_PRECISION").toString():map.get("DATA_PRECISION").toString()+","+map.get("DATA_SCALE").toString();
                if(nbrStr != null && nbrStr.endsWith(",0")){
                    nbrStr = nbrStr.substring(0,nbrStr.length()-2);
                }
                centerVal[i][3] = nbrStr;
            }
            centerVal[i][4] = "Y".equals(map.get("NULLABLE"))?"是":"否";
            centerVal[i][5] = (String) map.get("索引");
            if("ID_".equals(columnName)){
                centerVal[i][6] = "是";
            }else{
                centerVal[i][6] = "否";
            }
            String comments = (String) map.get("COMMENTS");
            switch(columnName){
                case "ID_" :
                    comments="主键";
                    break;
                case "ENABLE_" :
                    comments="是否有效(1是；0否）默认1";
                    break;
                case "REMARK_" :
                    comments="备注";
                    break;
                case "CREATE_BY" :
                    comments="创建人主键";
                    break;
                case "CREATE_TIME" :
                    comments="创建时间";
                    break;
                case "UPDATE_BY" :
                    comments="修改人主键";
                    break;
                case "UPDATE_TIME" :
                    comments="修改时间";
                    break;
            }
            centerVal[i][7] = comments;
        }

        ExcelUtils.exportExcel(false,titles,centerVal,null,dateStr);

    }
}
