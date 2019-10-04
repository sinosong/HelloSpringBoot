package com.hns.learn.thread;

import java.sql.Connection;

/**
 * @author : hannasong
 * @version : 1.0
 * @date : Created in 7:09 下午 2019/10/3
 * @description : 测试多线程单例
 */
public class Myobject {
    public enum MyEnumSingleton{
        a,
        ConnectionFactory;
        private Connection connection;
        private MyEnumSingleton() {
            //connection=
        }
        public Connection getConnection(){
            System.out.println(111);
            return connection;
        }
    }

    public static Connection getConnection(){
        System.out.println(MyEnumSingleton.a.getConnection());
        return MyEnumSingleton.ConnectionFactory.getConnection();
    }

    public static void main(String[] args) {
        Myobject.getConnection();
    }

}
