package com.aoao.TestGradle.module3;

/**
 * Created by yunao.liu on 3/10/15.
 */
public class Main {
    public static void main(String [ ] args) {
        int a = 1, b = 2, c = 3, d = 4;
        System.out.printf("This is the sum of %d, %d, %d, %d : %d", a, b, c, d, QuadAdd.Add(a, b, c, d));
    }
}
