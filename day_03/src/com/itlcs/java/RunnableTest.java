package com.itlcs.java;

/**
 * @author jssqlcs
 * @create 2021/8/29 1:32
 */
//1.类继承Runnable接口
class RunThread implements Runnable{

    //2.重写run()方法
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
public class RunnableTest {
    public static void main(String[] args) {
        //3.创建实现接口类的对象
        RunThread runThread = new RunThread();
        //4.调用Thread的构造器，将对象作为形参。（此处体现多态性）
        Thread thread = new Thread(runThread);
        //5.调用start()方法。此处是为thread的start()方法。
        thread.start();
    }
}
