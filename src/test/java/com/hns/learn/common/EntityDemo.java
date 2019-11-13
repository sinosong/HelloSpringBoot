package com.hns.learn.common;

/**
 * @author : hannasong
 * @version :
 * @date : Created in 4:26 下午 2019/10/22
 * @description : 测试哈希冲突;
 */
public class EntityDemo {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EntityDemo() {
    }

    public EntityDemo(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
