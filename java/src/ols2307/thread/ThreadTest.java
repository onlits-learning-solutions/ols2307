package ols2307.thread;

public class ThreadTest {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}
