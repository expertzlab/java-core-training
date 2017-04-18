package com.expertzlab;

/**
 * Created by gireeshbabu on 11/04/17.
 */
public class InputArgs {

    public static void main(String[] args) {

        String s1 = args[0];
        String s2 = args[1];

        System.out.println(new Integer(s1) * new Integer(s2));

    }
}
