package ols2307.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackTest {
    @Test
    public void testPush() {
        Stack stack = new Stack();
        int response = stack.push(10);
        assertEquals(10, response);
    }
}
