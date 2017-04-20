package com.expertzlab.objecthandling;

/**
 * Created by gireeshbabu on 19/04/17.
 */
public class StringHandling {

    public static void main(String[] args) throws CloneNotSupportedException {
        A v1 = new A();
        A v2 = new A();
        System.out.println("str in v1 = " + v1.str);
        System.out.println("str in v2 = " + v2.str);
        v2 = v1.clone();
        v1.str= v1.str + " how are you";

        System.out.println("str in v1 = " + v1.str);

        System.out.println("str in v2 = " + v2.str);

    }

}
