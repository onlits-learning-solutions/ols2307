package ols2307.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackTest {
    @Test
    public void testPushMultiple() {
        Stack stack = new Stack();
        int response = stack.push(10);
        response = stack.push(20);
        response = stack.push(30);
        assertEquals(30, response);
    }
}