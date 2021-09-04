package com.itlcs.java;

import org.junit.Test;

import java.util.Random;

/**
 * 通过NewInstance调用运行时类的对象
 * @author jssqlcs
 * @create 2021/8/24 23:08
 */
public class NewInstanceTest {

    @Test
    public void test() throws IllegalAccessException, InstantiationException {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        person.setAge(10);
        person.show();
        System.out.println(person);
    }

    @Test
    public void test2(){

        for (int k = 0;k<10;k++){
            int i = new Random().nextInt(3);
            String classPath = "";
            switch (i){
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "com.itlcs.java.Person";
                    break;
                case 2:
                    classPath = "java.lang.Object";
                    break;
            }
            try {
                Object instance = getInstance(classPath);
                System.out.println(instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Object getInstance(String classPath) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName(classPath);
        return aClass.newInstance();
    }
}
