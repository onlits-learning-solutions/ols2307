package ols2307.thread;

public class E implements Runnable {
    public void run() {
        for(int j=1; j<=5; j++) {
            System.out.println("\tFrom Thread E: j = " + j);
        }
        System.out.println("Exit from E ");
    }
}
