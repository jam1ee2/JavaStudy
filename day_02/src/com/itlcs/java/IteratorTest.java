package com.itlcs.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author jssqlcs
 * @create 2021/8/26 1:19
 */
public class IteratorTest {

    @Test
    public void test() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new Person("lcs", 22));
        collection.add("Jerry");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Jerry")) {
                iterator.remove();
            }
        }
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

