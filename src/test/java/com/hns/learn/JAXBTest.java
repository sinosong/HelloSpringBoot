package com.hns.learn;

import com.hns.learn.jaxb.Item;
import com.hns.learn.jaxb.QuotaData;
import com.hns.learn.jaxb.ReqBody;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JAXBTest {

    @Test
    public void generateXML() {
        ReqBody rep = new ReqBody();
        Item itm0 = new Item();
        Item itm1 = new Item();
        QuotaData rel0 = new QuotaData("1","1","1","1","1");
        QuotaData rel1 = new QuotaData("2","2","2","2","2");
        QuotaData rel2 = new QuotaData("3","3","3","3","3");
        QuotaData rel3 = new QuotaData("4","4","4","4","4");
        List<QuotaData> r0 = new ArrayList<>();
        List<QuotaData> r1 = new ArrayList<>();
        List<Item> it0 = new ArrayList<>();
        r0.add(rel0);
        r0.add(rel1);
        r0.add(rel2);
        r0.add(rel3);
        itm0.setQuotaData(r0);
//        itm1.setQuotaData(r1);
        it0.add(itm0);
        it0.add(itm1);
        rep.setReqBodyList(r0);

        File file = new File("G:\\temp\\test\\0626\\ReqBody.xml");
        JAXBContext jc = null;
        try {
            //根据Person类生成上下文对象
            jc = JAXBContext.newInstance(ReqBody.class);
            //从上下文中获取Marshaller对象，用作将bean编组(转换)为xml
            Marshaller ma = jc.createMarshaller();
            //以下是为生成xml做的一些配置
            //格式化输出，即按标签自动换行，否则就是一行输出
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //设置编码（默认编码就是utf-8）
            ma.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            //是否省略xml头信息，默认不省略（false）
            ma.setProperty(Marshaller.JAXB_FRAGMENT, false);

            //编组
            ma.marshal(rep, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void generateBean() {
        File file = new File("G:\\temp\\test\\0626\\ReqBody.xml");
        JAXBContext jc = null;
        try {
            jc = JAXBContext.newInstance(ReqBody.class);
            Unmarshaller uma = jc.createUnmarshaller();
            ReqBody rep = (ReqBody) uma.unmarshal(file);
            System.out.println(rep);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
