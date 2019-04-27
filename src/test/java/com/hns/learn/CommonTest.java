package com.hns.learn;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.baomidou.mybatisplus.annotation.TableField;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.hns.learn.entity.BizFile;
import com.hns.learn.entity.InfAccrual;
import com.hns.learn.entity.TestBigdecimal;
import com.hns.learn.util.ExcelUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CommonTest {

    @Test
    public void getAnnos() {

        Class clazz = InfAccrual.class;

        for(Field f : clazz.getDeclaredFields()){

            System.out.println(f.getAnnotation(TableField.class).value());

        }


    }

    @Test
    public void strs() {
        String [] trxcodeKeys = {"3731","3732","4080","4081","4082","4083","4084","4085","4087","4091","4278","4280","4285","4286","4287","4288","4292","60031","60037","60038","60039","60055","60060","60069",
                "60081","60085","61005","64093","68015","68019","68020","68027","68028","68031","74014","74015","74016"};
        String [] trxcodeVals = {"综合转账","部分转帐","贷款发放","贷款正常归还","贷款逾期归还","贷款系统内转按揭","贷款转呆坏帐","贷款呆坏帐核销","贷款表内表外红字欠息冲转","贷款利息减免",
                "转贷正常多比归还","转贷利息调整","转贷逐笔冲正","转贷下游逾期归还","转贷下游正常转逾期","转贷下游贷款减值核销","转贷贷款发放","冲减应收利息","核心正常扣款","核心逾期扣款",
                "贷款逾期结息","单位定期自动转存","单位通知存款自动转存","移行程序专用交易代码","核心贷款移行","贷款账户销户","查询客户电话和电邮地址","信贷还款预查询接口 ","核心贷款减值 ",
                "口行转贷批量正常还款","口行转贷批量逾期还款","口行转贷正常还款预处理","口行转贷减值","口行转贷下游逾期结息","信贷正常归还接口","信贷逾期归还接口","信贷零金额分款接口"};

        //明细性质LISTTYPE
        String [] listTypeKeys = {"001","002","003","004","005","006","007","008","009","010","011","012","013","014","100","104","105","106",
                "107","108","109","110","111","112","113","114","115","116","117","118","119","120","121","122","123","124","125",
                "126","127","128","129","130","131","132","133","134","135"};
        String [] listTypeVals ={"联机发放","批量发放","联机提前归还","联机逾期归还","联机当期归还","批量正常扣款","批量逾期扣款","冲减利息",
                "批量计息","批量转逾期","停息利息收取","贷款费用收取","贷款利息收取","联机转逾期","冲销","网内转移","转呆坏帐","呆坏帐核销","归还呆坏帐","转按揭结清",
                "网点卖出","跨地区网点撤并转出,","跨地区网点撤并转入,","批量提前还款","账户合并销户","账户合并入账","联机销户","批量销户","利息资本化",
                "重组发放","借新还旧","其他发放","重组归还","借新还旧","以资抵债","其他归还","产品修改","费用资本化","利息本金化","调整利息",
                "贷款账户拆分销户","贷款账户拆分入账","减值","开立保函","取消保函","贷款售卖","贷款赎回"};

        //简要注释NOTETYPE
        String [] noteTypeKeys = {"000","001","010","011","012","013","014","015","016","017","018","019","002","020","021","022","023","024","025",
                "026","027","028","029","003","030","032","033","034","035","036","037","038","039","004","040","041","042","043","044","005","006",
                "007","008","009","132","997","998","999"};
        /*String [] noteTypeVals = {"打折处理专用","新開戶","歸還貸款本金","歸還貸款利息","反交易","冲正","補賬","ATM轉賬存入/支出(+/-)","ATM現金存入/支出(+/-)",
                "銀聯咭終端機交易（含卡消费等）","匯款","網銀","現金存入/支出(+/-)","利息","收費(含卡年费、小额账户收费、不动户账户收费、透支收费、对账单收费、欠费追缴等）",
                "稅","他行票退票","貸款發放","常行指示（含余额调剂等）","凍結支付","保留支付","承前頁","合併項(+/-)","轉賬存入/支出(+/-)","當前結餘","自动转存明细",
                "本行交換票退票","本行交換票扣賬","贷款转逾期","贷款欠息转表外","贷款逾期本金核销","贷款表内欠息核销","贷款表外欠息核销","他行票存入","归还已核销贷款",
                "贷款欠息转表内","结息","付息","贷款归还","銷戶","薪金自動入賬","批量代收水費","批量代收電費","批量代收通訊費","存款批量","反交易","承前頁","存折或者对帐单打印代理业务协议表中的代理业务种类简称信息"};*/
        String [] noteTypeVals = {"打折处理专用","新开户","归还贷款本金","归还贷款利息","反交易","冲正","补账","ATM转账存入/支出(+/-)","ATM现金存入/支出(+/-)",
                "银联咭终端机交易（含卡消费等）","汇款","网银","现金存入/支出(+/-)","利息","收费(含卡年费、小额账户收费、不动户账户收费、透支收费、对账单收费、欠费追缴等）",
                "税","他行票退票","贷款发放","常行指示（含余额调剂等）","冻结支付","保留支付","承前页","合并项(+/-)","转账存入/支出(+/-)","当前结馀","自动转存明细",
                "本行交换票退票","本行交换票扣账","贷款转逾期","贷款欠息转表外","贷款逾期本金核销","贷款表内欠息核销","贷款表外欠息核销","他行票存入","归还已核销贷款",
                "贷款欠息转表内","结息","付息","贷款归还","销户","薪金自动入账","批量代收水费","批量代收电费","批量代收通讯费","存款批量","反交易","承前页","存折或者对帐单打印代理业务协议表中的代理业务种类简称信息"};

        for (int i = 0; i < noteTypeKeys.length; i++) {

            System.out.println(noteTypeKeys[i]+"-"+noteTypeVals[i]);

        }
        System.out.println(noteTypeKeys.length);
        System.out.println(noteTypeVals.length);

    }

    @Test
    public void BeanTest() {

        BizFile bf = new BizFile("1","a","A");
        try {
            BeanUtils.cloneBean(bf);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void charTest() {
        char a = '1';
        System.out.println(String.valueOf(a));

        String padEndResult = Strings.padStart("123", 4, '0');
        System.out.println(padEndResult);
    }

    @Test
    public void preconditionsTest() {
        String name="Jim";
        name = null;
        int age=19;
        String desc = "hello world, hello java";
        Preconditions.checkNotNull(name, "name may not be null");
        Preconditions.checkArgument(age >= 18 && age < 99, "age must in range (18,99)","aaaaaaaaa");
        Preconditions.checkArgument(desc !=null && desc.length() < 10, "desc too long, max length is ", 10);

    }

    @Test
    public void multimaps() {
        Multimap<String, String> myMultimap = ArrayListMultimap.create();

        // 添加键值对
        myMultimap.put("Fruits", "Bannana");
        //给Fruits元素添加另一个元素
        myMultimap.put("Fruits", "Apple");
        myMultimap.put("Fruits", "Pear");
        myMultimap.put("Vegetables", "Carrot");

        // 获得multimap的size
        int size = myMultimap.size();
        System.out.println(size);  // 4

        // 获得Fruits对应的所有的值
        Collection<String> fruits = myMultimap.get("Fruits");
        System.out.println(fruits); // [Bannana, Apple, Pear]

        Collection<String> vegetables = myMultimap.get("Vegetables");
        System.out.println(vegetables); // [Carrot]

        //遍历Mutlimap
        for(String value : myMultimap.values()) {
            System.out.println(value);
        }

        // Removing a single value
        myMultimap.remove("Fruits","Pear");
        System.out.println(myMultimap.get("Fruits")); // [Bannana, Pear]

        // Remove all values for a key
        myMultimap.removeAll("Fruits");
        System.out.println(myMultimap.get("Fruits")); // [] (Empty Collection!)

    }

    @Test
    public void dealWithStrs() {

        String [] noteTypeKeys = {"0","1","10","11","12","13","14","15","16","17","18","19","2","20","21","22","23","24","25","26","27",
                "28","29","3","30","32","33","34","35","36","37","38","39","4","40","41","42","43","44","5","6","7","8","9","997","998","999"};

        for(String str : noteTypeKeys){

            System.out.println(String.format("%03d", Integer.parseInt(str)));
        }


    }

    @Test
    public void temp() {
        System.out.println(String.format("%0123d",10));
    }

    @Test
    public void getNextDate(){

        SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date temp = dft.parse("2019-02-28");
            Calendar cld = Calendar.getInstance();
            cld.setTime(temp);
            cld.add(Calendar.DATE, 1);
            temp = cld.getTime();
            //获得下一天日期字符串
            String nextDay = dft.format(temp);
            System.out.println(nextDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPoi(){

        /*String[] titles = {"序号","债项方案编号"};
        String[][] centerVal = new String[2][2];
        centerVal[0][0] = "1";
        centerVal[0][1] = "no.1";
        centerVal[1][0] = "2";
        centerVal[1][1] = "no.2";
        ExcelUtils.exportExcel(false,titles,centerVal,null,"测试01");*/
        ExcelUtils.importExcel("G:/temp/test/test.xlsx");
    }

    @Test
    public void distinctStrs() {

        String[] strs = {"id_",
                "zoneno",
                "protseno",
                "subserno",
                "workdate",
                "listno",
                "prinflag",
                "cmprflag",
                "lglockno",
                "trxdate",
                "trxtime",
                "timestmp",
                "postndat",
                "postsdat",
                "posttime",
                "trxsqnb",
                "ptrxsqnb",
                "trxsqns",
                "trxcode",
                "valuedat",
                "currtype",
                "cashexf",
                "catrflag",
                "drcrf",
                "amount",
                "updbal",
                "notetype",
                "notes",
                "revtranf",
                "updtranf",
                "posttype",
                "listtype",
                "recipbkn",
                "recipbka",
                "recipact",
                "recipacs",
                "recipacn",
                "exchrat",
                "forecurr",
                "foreamt",
                "vouhtype",
                "vouhno",
                "mediumid",
                "mediumno",
                "medseno",
                "chnltype",
                "chnlno",
                "prodcode",
                "prodno",
                "prodgpno",
                "trxzno",
                "tphybrno",
                "phybrno",
                "tellerno",
                "authtlno",
                "authno",
                "termid",
                "trxplcs",
                "statcode",
                "create_time",
                "update_time",
                "create_by",
                "update_by",
                "enable_",
                "id_",
                "zoneno",
                "protseno",
                "subserno",
                "workdate",
                "listno",
                "lglockno",
                "currtype",
                "cashexf",
                "termnum",
                "intrate",
                "rlvrate",
                "ovrrate",
                "incirate",
                "ofcirate",
                "taxrate",
                "currint",
                "rlvint",
                "rlvibal",
                "ovramt",
                "ovrbal",
                "ovramtit",
                "inamt",
                "incurbal",
                "inamtit",
                "ofamt",
                "ofcurbal",
                "ofamtit",
                "taxsum",
                "taxamt",
                "taxbal",
                "ntaxamt",
                "ntaxbal",
                "drdoactn",
                "drdoacsn",
                "drdoacta",
                "payactn",
                "payacsn",
                "payacta",
                "create_time",
                "update_time",
                "create_by",
                "update_by",
                "enable_",
                "remark_"};
        Set<String> set = new LinkedHashSet<>();
        for(String str : strs){
                set.add(str);
        }
        List<String> list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    @Test
    public void TestBigdecimal() {

//        TestBigdecimal imal = new TestBigdecimal();

        String json = "{ \"amt\":2000,000 }";

        ValueFilter valueFilter = new ValueFilter() {
            @Override
            public Object process(Object o, String propertyName, Object propertyValue) {
                if(propertyName.equals("amt")){
                    String amtStr = propertyValue.toString();
                    amtStr.replace(",","");
                    return new BigDecimal(amtStr);
                }
                return propertyValue;
            }
        };
        ExtraProcessor processor = new ExtraProcessor() {
            public void processExtra(Object object, String key, Object value) {

                System.out.println("---------------object = " + object);
                System.out.println("---------------key = " + key);
                System.out.println("---------------value = " + value);
            }
        };
        FieldTypeResolver fieldResolver = new FieldTypeResolver() {
            public Type resolve(Object object, String fieldName) {
                System.out.println("---------------object = " + object);
                System.out.println("---------------key = " + fieldName);
                return null;
            }
        };

        TestBigdecimal imal = JSON.parseObject(json,TestBigdecimal.class,fieldResolver);
        System.out.println(imal);

    }
}
