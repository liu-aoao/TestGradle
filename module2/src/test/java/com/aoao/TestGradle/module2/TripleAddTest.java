package com.aoao.TestGradle.module2;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by yunao.liu on 3/26/15.
 */
public class TripleAddTest {
    @Test
    public void testNormalAdd() {
        assertEquals(TripleAdd.Add(1, 2, 3), 6);
    }
}