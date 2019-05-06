package com.hns.learn.entity.enums;

import com.google.common.base.MoreObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hannasong
 * @version 根据余额获取发生额;
 */
public enum FetchOccurredEnum {

    RLVIBAL(1, "RLVINT", "RLVIBAL", "展期利息余额"),
    OVRBAL(2, "OVRAMT", "OVRBAL", "逾期本金余额"),
    INCURBAL(3, "INAMT", "INCURBAL", "表内欠息当前余额"),
    OFCURBAL(4, "OFAMT", "OFCURBAL", "表外欠息当前余额"),
    UPDBAL(5, "AMOUNT", "UPDBAL", "本金期末余额 (原币)");
//    TAXBAL(6, "TAXAMT", "TAXBAL", "非豁免印花税余额"),
//    NTAXBAL(7, "NTAXAMT", "NTAXBAL", "豁免印花税余额");

    private int index;
    private String occ;
    private String bal;
    private String doc;

    FetchOccurredEnum(int index, String occ, String bal, String doc) {
        this.index = index;
        this.occ = occ;
        this.bal = bal;
        this.doc = doc;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getOcc() {
        return occ;
    }

    public void setOcc(String occ) {
        this.occ = occ;
    }

    public String getBal() {
        return bal;
    }

    public void setBal(String bal) {
        this.bal = bal;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("index", index)
                .add("occ", occ)
                .add("bal", bal)
                .add("doc", doc)
                .toString();
    }

    public static String getOcc(String name) {
        for (FetchOccurredEnum c : FetchOccurredEnum.values()) {
            if (c.getBal().equals(name)) {
                return c.getOcc();
            }
        }
        return null;
    }

    public static boolean isBal(String name) {
        for (FetchOccurredEnum c : FetchOccurredEnum.values()) {
            if (c.getBal().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getNameList() {
        List<String> list = new ArrayList<String>();
        for (FetchOccurredEnum c : FetchOccurredEnum.values()) {
            list.add(c.getBal());
        }
        return list;
    }

}
