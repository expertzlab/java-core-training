package com.expertzlab.arrays;

import com.expertzlab.objecthandling.A;

/**
 * Created by gireeshbabu on 20/04/17.
 */
public class ArrayHandling {

    public static void main(String[] args) {
        A[] v1 = new A[10];
        System.out.println(v1.length);
        v1[0] = new A();
        v1[0].printString();
    }
}
