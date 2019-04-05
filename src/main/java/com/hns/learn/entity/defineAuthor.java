package com.hns.learn.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:config/defineAuthor.properties"},ignoreResourceNotFound = false, encoding = "UTF-8", name = "defineAuthor.properties")
//相对@Value而言是一种松散模式的配置读取方式，通过前缀获取author.nickname
@ConfigurationProperties(prefix = "author")
public class defineAuthor {

    //配置文件中必须有author.name。
    @Value("${author.name}")
    private String authorName;
    @Value("${author.age}")
    private String authorAge;

    private String nickname;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorAge() {
        return authorAge;
    }

    public void setAuthorAge(String authorAge) {
        this.authorAge = authorAge;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "defineAuthor{" +
                "authorName='" + authorName + '\'' +
                ", authorAge='" + authorAge + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
