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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class getTabls {

    @Autowired
    private BizCanvasMapper bizCanvasMapper;

    @Test
    public void testTrn() {

        Map<String, Object> params = new HashMap<>();
        params.put("grantStatus",1);
        params.put("grantLoseState9",2L);
        params.put("grantLoseState11",3);
        params.put("grantLoseState12",4);
        params.put("schemeNum",4);
        params.put("deptCode",4);
        bizCanvasMapper.selectGrantInfo(params);

    }

    /**
     * 生成entity类
     */
    @Test
    public void getEntity() {

        List<Map> tableList =  bizCanvasMapper.selTables("BIZ_V_SETTLEMENT");
        String dateStr = DateFormatUtils.format(new Date(),"yyyyMMdd-HHmmSS-SSS");

        String[] titles = {"表中文名","表名","列名","类型","长度","为空","索引","主键","描述"};
        String[][] centerVal = new String[tableList.size()][titles.length];

        for (int i = 0; i < tableList.size(); i++) {

            String key = null;
            String col = null;
            String com = null;
            String typ = null;

            Map<String,Object> map = tableList.get(i);
            String tableName = (String) map.get("TABLE_NAME");
            /*if(!(tableName.startsWith("BIZ") || tableName.startsWith("INF"))){
                continue;
            }*/
            /*if(!"GMS_COL_VALUEINFO".equals(tableName)){
                continue;
            }*/
            centerVal[i][0] = (String) map.get("表说明");
            centerVal[i][1] = tableName;
            String columnName = (String) map.get("COLUMN_NAME");
            centerVal[i][2] = columnName;
            centerVal[i][3] = (String) map.get("DATA_TYPE");
            if("VARCHAR2".equals((String) map.get("DATA_TYPE"))){
                centerVal[i][4] = map.get("DATA_LENGTH").toString();
            }else{
                String nbrStr = map.get("DATA_PRECISION")==null?"":(map.get("DATA_SCALE")==null)?map.get("DATA_PRECISION").toString():map.get("DATA_PRECISION").toString()+","+map.get("DATA_SCALE").toString();
                if(nbrStr != null && nbrStr.endsWith(",0")){
                    nbrStr = nbrStr.substring(0,nbrStr.length()-2);
                }
                centerVal[i][4] = nbrStr;
            }
            centerVal[i][5] = "Y".equals(map.get("NULLABLE"))?"是":"否";
            centerVal[i][6] = (String) map.get("索引");
            if("ID_".equals(columnName)){
                centerVal[i][7] = "是";
            }else{
                centerVal[i][7] = "否";
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
            centerVal[i][8] = comments;

            String tmpStr = columnName.toLowerCase();
            boolean mark = false;
            StringBuffer b = new StringBuffer();
            for(char c : tmpStr.toCharArray()){
                if(c==95){
                    mark = true;
                    continue;
                }
                if(mark){
                    c-=32;
                    mark = false;
                }
                b.append(c);
            }
            key = b.toString();

            typ = centerVal[i][4];
            if(null!=typ && "VARCHAR2".equals(typ.toUpperCase())){
                typ = "String";
            }else if(null!=typ && "NUMBER".equals(typ.toUpperCase())){
                typ = "Integer";
            }else if(null!=typ && "DATE".equals(typ.toUpperCase())){
                typ = "Date";
            }else if(null!=typ && typ.contains(",")){
                typ = "BigDecimal";
            }else{
                typ = "String";
            }


//            String pri = "/** "+comments+" */\n" +
//                    "@TableField(\""+columnName+"\")\n" +
//                    "private "+typ+" "+key+";";
            String pri = "bizFields.add(new QueryBizField(\""+columnName+"\",\""+key+"\",QueryBizField.STRING_TYPE));";
            System.out.print(pri);
            System.out.println();

        }

    }

    @Test
    public void getTable() {

        List<Map> tableList =  bizCanvasMapper.selTables(null);
        String dateStr = DateFormatUtils.format(new Date(),"yyyyMMdd-HHmmSS-SSS");

        String[] titles = {"表中文名","表名","列名","类型","长度","为空","索引","主键","描述"};
        String[][] centerVal = new String[tableList.size()][titles.length];

        for (int i = 0; i < tableList.size(); i++) {

            Map<String,Object> map = tableList.get(i);
            String tableName = (String) map.get("TABLE_NAME");
            /*if(!(tableName.startsWith("BIZ") || tableName.startsWith("INF"))){
                continue;
            }*/
            if(!("GMS_COL_COLLBASEINFO".equals(tableName) || "GMS_COL_VALUEINFO".equals(tableName))){
                continue;
            }
            centerVal[i][0] = (String) map.get("表说明");
            centerVal[i][1] = tableName;
            String columnName = (String) map.get("COLUMN_NAME");
            centerVal[i][2] = columnName;
            centerVal[i][3] = (String) map.get("DATA_TYPE");
            if("VARCHAR2".equals((String) map.get("DATA_TYPE"))){
                centerVal[i][4] = map.get("DATA_LENGTH").toString();
            }else{
                String nbrStr = map.get("DATA_PRECISION")==null?"":(map.get("DATA_SCALE")==null)?map.get("DATA_PRECISION").toString():map.get("DATA_PRECISION").toString()+","+map.get("DATA_SCALE").toString();
                if(nbrStr != null && nbrStr.endsWith(",0")){
                    nbrStr = nbrStr.substring(0,nbrStr.length()-2);
                }
                centerVal[i][4] = nbrStr;
            }
            centerVal[i][5] = "Y".equals(map.get("NULLABLE"))?"是":"否";
            centerVal[i][6] = (String) map.get("索引");
            if("ID_".equals(columnName)){
                centerVal[i][7] = "是";
            }else{
                centerVal[i][7] = "否";
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
            centerVal[i][8] = comments;
        }

        ExcelUtils.exportExcel(false,titles,centerVal,null,dateStr);

    }
}
