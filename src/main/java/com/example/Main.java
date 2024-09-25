package com.example;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        
        int l = 200; //cercando di passare parametro - fai il costruttore
        
        //Thread
        MioThread t1 = new MioThread(l); //creazione
        MioThread t2 = new MioThread(l);


        

        //t1.start(); //avvio del extend thread 
        //t1.run();//non è deterministico, sono sempre nel main
        
        new Thread(t1).start(); //implements Runnable
        new Thread(t2).start();

        /* 
        for(int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i); //nome del thread
        }*/

    }
}