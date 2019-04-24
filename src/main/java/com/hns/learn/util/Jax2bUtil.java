package com.hns.learn.util;

import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @author hannasong
 */
public class Jax2bUtil {


    public static String toXml(Object obj){
       return toXml(obj, "UTF-8");
    }

    public static String toXml(Object obj, String encoding){
        if(StringUtils.isBlank(encoding)){
            encoding = "UTF-8";
        }
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
            StringWriter writer = new StringWriter();
            marshaller.marshal(obj, writer);
            return writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Jax2b:convert toXml Error...");
    }

    public static <T> T toBean(String xml, Class<T> c) {
        if(StringUtils.isBlank(xml)){
            return null;
        }
        try {
            JAXBContext context = JAXBContext.newInstance(c);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (T) unmarshaller.unmarshal(new StringReader(xml));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Jax2b:convert toBean Error...");
    }
}
