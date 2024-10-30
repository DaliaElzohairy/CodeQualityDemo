package org.examole;

import org.example.Demo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {

    private Demo demo = new Demo();

    @Test
    public void testAdd() {
        assertEquals(5, demo.add(2, 3));
        assertEquals(0, demo.add(-1, 1));
        assertEquals(-3, demo.add(-1, -2));
    }
}
