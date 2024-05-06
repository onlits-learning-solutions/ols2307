package ols2307.thread;

public class RunnableTest {
    public static void main(String[] args) {
        new Thread(new D()).start();
        new Thread(new E()).start();
        new Thread(new F()).start();
    }
}
