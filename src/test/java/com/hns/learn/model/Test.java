package com.hns.learn.model;

/**
 * @author : hannasong
 * @version :
 * @date : Created in 11:18 上午 2019/10/12
 * @description :
 */
public class Test {

    private String name;

    public static int orderNum = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String print(String str){

        System.out.println(str);

        return exec(str);
    }

    private String exec(String str){

        return "res : " + str;
    }

    public static void main(String[] args) {


        new Test().print("hello world!");

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
