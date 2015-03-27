package com.aoao.TestGradle.module1;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by yunao.liu on 3/26/15.
 */
public class DoubleAddTest {
    @Test
    public void testNormalAdd() {
        assertEquals(DoubleAdd.Add(1, 2), 3);
    }
}
