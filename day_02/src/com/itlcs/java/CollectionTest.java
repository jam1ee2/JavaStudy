package com.itlcs.java;

import org.junit.Test;

import java.util.*;

/**
 * @author jssqlcs
 * @create 2021/8/25 23:01
 */
public class CollectionTest {

    @Test
    public void test(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new Person("lcs",22));
        collection.add(new String("Jerry"));

        System.out.println(collection.size());
        System.out.println(collection.contains(123));

        //true 因为String中重写的equal的方法
        System.out.println(collection.contains(new String("Jerry")));

        //false Person类中没有重写equal方法，重写后即为true
        System.out.println(collection.contains(new Person("lcs",22)));

        //collection.containsAll(Collection coll)判断形参coll的所有元素是否存在与集合中
        Collection collection1 = Arrays.asList(123,4567);
        System.out.println(collection.containsAll(collection1));

        System.out.println("-----------------------");
        Collection collection2 = new ArrayList();
        collection2.add(123);
        collection2.add(456);
        collection2.add(new Person("lcs",22));
        collection2.add(new String("Jerry"));

        //ArrayList为有序的集合，所以equals会判断添加元素的先后顺序。若使用HashSet即使元素顺序不一致也不会判断为false,因为HashSet是无序的。
        System.out.println(collection.equals(collection2));
    }

    @Test
    public void test2() throws IllegalAccessException, InstantiationException {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new Person("lcs",22));
        collection.add(new String("Jerry"));

        //获取集合的HashCode;
        System.out.println(collection.hashCode());

        //集合----->数组
        Object[] objects = collection.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

    }


}
