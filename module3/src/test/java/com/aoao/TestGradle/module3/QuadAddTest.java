package com.aoao.TestGradle.module3;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by yunao.liu on 3/27/15.
 */
public class QuadAddTest {
    @Test
    public void testNormalAdd() {
        assertEquals(QuadAdd.Add(1, 2, 3, 4), 10);
    }
}