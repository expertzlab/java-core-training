package com.expertzlab.methods;

/**
 * Created by gireeshbabu on 11/04/17.
 */
public class StaicMain {

    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
        int i = sd.makedouble(20);
        System.out.println("value = :" + i);

        int k = StaticDemo.makedouble(30);
        System.out.println("value =:" + k);

    }
}
