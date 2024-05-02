package ols2307.thread;

public class A extends Thread {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("\tFrom Thread A: i = " + i);
        }
        System.out.println("Exit from A ");
    }
}
