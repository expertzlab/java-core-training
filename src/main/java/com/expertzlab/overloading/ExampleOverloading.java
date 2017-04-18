package com.expertzlab.overloading;

/**
 * Created by gireeshbabu on 18/04/17.
 */
public class ExampleOverloading {

    public static int method1(int i){
        System.out.println("Float and Int");
        return 0;
    }

    public static float method1(int i, float j){
        System.out.println("Int and float");
        return (float)1.0;
    }


    public static void main(String[] args) {
        //method1((float) 1.0, 1);
    }
}
