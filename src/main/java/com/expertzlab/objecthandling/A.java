package com.expertzlab.objecthandling;

/**
 * Created by gireeshbabu on 19/04/17.
 */

public class A implements Cloneable{

    public A(){

    }

    public A clone() throws CloneNotSupportedException {
        return  (A) super.clone();
    }

    int i = 10;

    String str = "hello";

    public void printString(){
        System.out.println(str);
    }

}