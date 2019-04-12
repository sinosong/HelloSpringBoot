package com.hns.learn.entity.enums;

/**
 * 枚举项为导出全集；
 * @author hannasong 2019-4-13 07:26:01
 */
public enum AccrualEnum {

    RED("红色", 1 ,"red_"), GREEN("绿色", 2 ,"green_"), BLANK("白色", 3 ,"white_"), YELLO("黄色", 4 ,"yello_");

    private String name;
    private int index;
    private String key;

    AccrualEnum(String name, int index, String key) {
        this.name = name;
        this.index = index;
        this.key = key;
    }

    public static String getFetchKey(String name) {
        for (AccrualEnum c : AccrualEnum.values()) {
            if (c.getName().equals(name)) {
                return c.key;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
