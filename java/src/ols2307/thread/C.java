package ols2307.thread;

public class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("\tFrom Thread C: k = " + k);
        }
        System.out.println("Exit from C ");
    }
}
