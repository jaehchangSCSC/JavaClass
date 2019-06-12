package chat;

import java.lang.Thread;
import java.lang.Runnable;

public class threadtest implements Runnable{
    private int balance;
    public void run(){
        for(int i = 0; i<50; i++){
            increment();
            System.out.println("Balance is " + balance);
        }
    }
    synchronized void increment(){
        balance++;
    }
    public static void main(String[] args){
        Runnable threadJob = new threadtest();
        Thread a = new Thread(threadJob);
        Thread b = new Thread(threadJob);
        a.start();
        b.start();

    }
}