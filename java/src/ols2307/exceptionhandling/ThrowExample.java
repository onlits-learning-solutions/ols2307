package ols2307.exceptionhandling;

import java.io.IOException;

public class ThrowExample {
    public static void myException() {
        throw new ArithmeticException("There is an unknown arithmetic exception");
    }
    public static void main(String[] args) throws Exception, IOException {
        myException();
    }
}
