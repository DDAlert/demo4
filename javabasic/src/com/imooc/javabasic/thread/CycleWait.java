package com.imooc.javabasic.thread;

import sun.awt.SunHints;

public class CycleWait implements Runnable {
    private String value;
    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value = "we have data now";
    }

    public static void main(String[] args) throws InterruptedException {
        CycleWait cycleWait = new CycleWait();
        Thread thread = new Thread(cycleWait);
        thread.start();
        thread.join();
        System.out.println("value : " + cycleWait.value);
//����
    }
}
