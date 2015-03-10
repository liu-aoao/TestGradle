package com.aoao.TestGradle.module2;

import com.aoao.TestGradle.module1.*;

/**
 * Created by yunao.liu on 3/10/15.
 */
public class TripleAdd {
    public static int Add(int a, int b, int c) {
        return DoubleAdd.Add(a, DoubleAdd.Add(b, c));
    }
}
