package com.itlcs.java;

/**
 * 多窗口卖票，通过实现Runnable接口
 * @author jssqlcs
 * @create 2021/8/29 23:09
 */
class Window implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+ticket);
                ticket--;
            }
            else {
                break;
            }
        }
    }
}

public class WindowTicket {
    public static void main(String[] args) {
        Window window = new Window();
        Thread thread1 = new Thread(window);
        thread1.setName("窗口一");
        Thread thread2 = new Thread(window);
        thread2.setName("窗口二");
        Thread thread3 = new Thread(window);
        thread3.setName("窗口二");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
