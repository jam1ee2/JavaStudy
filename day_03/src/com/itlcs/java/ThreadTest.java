package com.itlcs.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author jssqlcs
 * @create 2021/8/28 1:27
 */
//1.创建子类继承Thread类
class MyThread extends Thread{
        //2.重写run()方法
    @Override
    public void run() {
        List<Integer> list = new ArrayList();
        try {
            System.out.println("睡着了....");
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0){
                list.add(i);
                Collections.sort(list, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                });
            }
        }
        this.setName("MyThread线程");
        System.out.println(this.getName()+list);
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3.创建MyThread的对象
        MyThread myThread = new MyThread();
        //4.调用start()方法
        myThread.start();
    }
}
