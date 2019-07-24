package com.hns.learn.dbtool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hns.learn.App;
import com.hns.learn.mapper.BizCanvasMapper;
import com.hns.learn.util.ExcelUtils;
import com.hns.learn.util.RedisUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class compareTabls {

    @Autowired
    private BizCanvasMapper bizCanvasMapper;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Resource
    private RedisUtils redisUtils;


    @Test
    public void getTable() {

        List<Map> tableList =  bizCanvasMapper.selTables(null);
        String dateStr = DateFormatUtils.format(new Date(),"yyyyMMdd-HHmmSS-SSS");

        String[] titles = {"表中文名","表名","列名","类型","长度","为空","索引","主键","描述"};
        String[][] centerVal = new String[tableList.size()][titles.length];

        JSONObject tableJO = new JSONObject();
        Set<String> addTabs = new HashSet<>();

        String tfcmStr = (String) redisUtils.get("tfcm93");
        JSONObject tfcmJO = JSON.parseObject(tfcmStr);

        for (int i = 0; i < tableList.size(); i++) {

            Map<String,Object> map = tableList.get(i);
            String tableName = (String) map.get("TABLE_NAME");
            if(tableName.startsWith("WF_")){
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

            String endStr = "("+centerVal[i][4]+")";
            if("DATE".equals(centerVal[i][3])){
                endStr="";
            }

            /*
            JSONObject jo = tableJO.getJSONObject(tableName);
            if(null == jo){
                jo = new JSONObject();
            }
            jo.put(columnName,"alter table "+tableName+" add "+columnName+" "+centerVal[i][3]+endStr);
            tableJO.put(tableName,jo);
            */

            JSONObject jo = tfcmJO.getJSONObject(tableName);
            if(null == jo){
                addTabs.add(tableName);
            }else{
                String colSql = jo.getString(columnName);
                JSONObject joTab = tableJO.getJSONObject(tableName);
                if(null == joTab){
                    joTab = new JSONObject();
                }
                if(null == colSql){
                    joTab.put(columnName,"alter table "+tableName+" add "+columnName+" "+centerVal[i][3]+endStr+";");
                    //comment on column BIZ_GUARANTEE_CONTRACT.PLEDGE_TYPE is '担保方式类型';
                    joTab.put(columnName + "_Comments","comment on column "+tableName+"."+columnName+" is \'"+comments+"\';");
                    tableJO.put(tableName,joTab);
                }else{
                    String uSql = "alter table "+tableName+" add "+columnName+" "+centerVal[i][3]+endStr+";";
                    if(!uSql.equals(colSql)){
                        //需要变更字段类型
                        //alter table BIZ_DEBT_MAIN modify (PROJECT_NAME VARCHAR2(2000));
                        uSql = "alter table "+tableName+" modify ("+columnName+" "+centerVal[i][3]+endStr+");";
                        joTab.put(columnName,uSql);
                        tableJO.put(tableName,joTab);
                    }
                }
            }

        }
//        redisUtils.set("tfcm93",tableJO.toJSONString());
        System.out.println("add table....");
        System.out.println(addTabs);
        System.out.println(tableJO.toJSONString());
        System.out.println("end .............");

        System.out.println("pure sql .............");

        for(Map.Entry<String, Object> entry : tableJO.entrySet()){

            JSONObject colJO = (JSONObject)entry.getValue();
            for(Map.Entry<String, Object> entryJO : colJO.entrySet()){
                System.out.println(entryJO.getValue());
            }
        }
        System.out.println("pure sql .............");




//        ExcelUtils.exportExcel(false,titles,centerVal,null,dateStr);

    }
}
