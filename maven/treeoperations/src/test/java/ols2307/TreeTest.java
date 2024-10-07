package ols2307;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeTest {
    @Test
    public void testAddNode() {
        assertEquals(0, new Tree<Character>().addNode('A'));
    }
}
