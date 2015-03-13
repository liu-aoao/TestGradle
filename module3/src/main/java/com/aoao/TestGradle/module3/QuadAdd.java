package com.aoao.TestGradle.module3;

import com.aoao.TestGradle.module1.*;
import com.aoao.TestGradle.module2.*;
/**
 * Created by yunao.liu on 3/10/15.
 */
public class QuadAdd {
    public static int Add(int a, int b, int c, int d) {
        return DoubleAdd.Add(TripleAdd.Add(a, b, c), d) + 1;
    }
}

// will this change affect JAR file?
