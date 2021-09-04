package com.itlcs.java;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author jssqlcs
 * @create 2021/8/26 23:12
 */
public class ListTest {

    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add("123");
        list.add("456");
        list.add(new Person("李成硕",22));

        list.forEach(System.out::println);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
