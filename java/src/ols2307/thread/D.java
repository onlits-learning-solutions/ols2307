package ols2307.thread;

public class D implements Runnable {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("\tFrom Thread D: i = " + i);
        }
        System.out.println("Exit from D ");
    }
}
