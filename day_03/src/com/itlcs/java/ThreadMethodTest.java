package com.itlcs.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author jssqlcs
 * @create 2021/8/28 19:47
 */
public class ThreadMethodTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0){
                list.add(i);
                Collections.sort(list, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                });
            }
        }
        //高优先级的线程要抢占低优先级的线程的执行权，但是从概率上讲，高优先级的线程高概率会被执行。并不意味着高优先级执行完低优先级才执行。
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        Thread.currentThread().setName("main主线程");
        System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority() +list);
    }
}
