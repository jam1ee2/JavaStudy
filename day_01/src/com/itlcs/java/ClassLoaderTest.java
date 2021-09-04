package com.itlcs.java;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class ClassLoaderTest {

    @Test
    public void test() throws IOException {
        Properties properties = new Properties();
        //通过ClassLoader来获取配置文件
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc.properties");
        properties.load(resourceAsStream);
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println("user:"+user+",password:"+password);
    }

    @Test
    public void test2() throws IOException {
        Properties properties = new Properties();
        //通过FileInputStream来获取配置文件
        FileInputStream fileInputStream = new FileInputStream("database.properties");
        properties.load(fileInputStream);
        String name = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println("name:"+name+",password:"+password);
    }
}
