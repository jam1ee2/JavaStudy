package com.itlcs.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

    @Test
    public void test1() throws Exception {
        //1.创建一个Person的反射
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getDeclaredConstructor(String.class,int.class);
        Person tom = constructor.newInstance("Tom", 20);
        System.out.println(tom.toString());
        //2.通过反射调用属性和方法
        //调用属性
        Field age = personClass.getDeclaredField("age");
        age.set(tom,10);
        System.out.println(tom.toString());
        //调用方法
        Method show = personClass.getDeclaredMethod("show");
        System.out.println(show);
        show.invoke(tom);

        System.out.println("-------------------------------");
        //通过构造器调用其私有结构
        Constructor constructor1 = personClass.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Person jerry = (Person) constructor1.newInstance("Jerry");
        System.out.println(jerry.toString());

        //调用私有属性
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(jerry,"李成硕");
        System.out.println(jerry.toString());

        //调用私有方法
        Method showNation = personClass.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String str = (String) showNation.invoke(jerry, "中国");
        System.out.println(str);
    }

    //获取Class的三种方法
    @Test
    public void test2() throws ClassNotFoundException {

        //1.从运行时类的属性.class获取
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        //2.通过运行时类的对象，调用.getClass()
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        System.out.println(aClass);

        //3.通过静态方法来获取
        Class<?> aClass1 = Class.forName("com.itlcs.java.Person");
        System.out.println(aClass1);
        System.out.println(personClass==aClass);
        System.out.println(aClass==aClass1);

        //4.通过ClassLoader来获取
        ClassLoader classLoader2 = ReflectionTest.class.getClassLoader();
        Class<?> aClass2 = classLoader2.loadClass("com.itlcs.java.Person");
        System.out.println(aClass2);
        System.out.println(aClass==aClass2);

        //引导类加载器
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println(classLoader);

        /*ClassLoader classLoader1 = ReflectionTest.class.getClassLoader();
        System.out.println(classLoader1);
        ClassLoader parent = classLoader1.getParent();
        System.out.println(parent);*/
    }
}
