package com.expertzlab;

/**
 * Created by gireeshbabu on 19/04/17.
 */
public class ObjectHandling {

    public static void main(String[] args) {
        A var = new A();
        System.out.println("i = " + var.i);

        A v1 = var;
        var.i =20;
        System.out.println("i in v1 - "+ v1.i);
        System.out.println("i in var -" + var.i);
    }

}

class A{

    int i = 10;

    String abc = "hello";
}