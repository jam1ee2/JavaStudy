package com.itlcs.java;

import org.junit.Test;

import java.util.*;

/**
 * @author jssqlcs
 * @create 2021/8/27 22:58
 */
public class MapTest {

    //遍历hashMap key使用Set存储，value使用Collection来存储，Entry使用Set来存储
    @Test
    public void test2(){
        Map<String,Object> map = new HashMap();
        map.put("aa",123);
        map.put("bb",456);
        map.put("mm",new Person("李成硕",22));

        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collection<Object> values = map.values();
        for (Object value:values){
            System.out.println(value);
        }
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey()+"---->"+entry.getValue());
            System.out.println(entry);
        }
    }

    @Test
    public void test(){
        Map<String,Object> map = new HashMap();
        map.put("aa",123);
        map.put("bb",456);
        map.put("mm",new Person("李成硕",22));

        Map<String,Object> map1 =new HashMap();
        map1.put("aa",789);
        map1.put("bb",456);
        map1.put("mm",new Person("李成硕",22));
        //map1.putAll(map);
        System.out.println(map);
        System.out.println(map1);
    }
}
