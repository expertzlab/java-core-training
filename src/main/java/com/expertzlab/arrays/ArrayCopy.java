package com.expertzlab.arrays;

import java.util.Arrays;

/**
 * Created by gireeshbabu on 20/04/17.
 */
public class ArrayCopy {

    public static void main(String[] args) {
        int[] a1 = new int[10];
        a1[0]=1;  a1[1] = 2;  a1[2]=5;
        int[] a2 = new int[15];
        System.arraycopy(a1,0,a2,0,10);
        System.out.println(a2[1]);
        a2[1]=10;
        System.out.println(a1[1]);
    }
}
