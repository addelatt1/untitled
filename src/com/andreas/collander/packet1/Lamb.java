package com.andreas.collander.packet1;

/**
 * Created by Elev1 on 2016-06-03.
 */
public class Lamb {
    private static void runAssigment3(){

       Runnable r = new Runnable(){
            @Override
            public void run(){
                System.out.println("anonym meep");
            }
        };
        Thread t = new Thread(r);
        Thread runner = new Thread(r);
        runner.start();
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
