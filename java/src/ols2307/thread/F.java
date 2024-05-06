package ols2307.thread;

public class F implements Runnable {
    public void run() {
        for(int k=1; k<=5; k++) {
            System.out.println("\tFrom Thread F: k = " + k);
        }
        System.out.println("Exit from F ");
    }
}
