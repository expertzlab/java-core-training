package com.expertzlab.objecthandling;

/**
 * Created by gireeshbabu on 19/04/17.
 */
public class ObjectHandling2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        A var1 = new A();
        A var2 = new A();
        var2 = (A) var1.clone();
        System.out.println("i in Var1 ="+ var1.i);
        System.out.println("i in Var2 ="+ var2.i);
        var2.i = 20;
        System.out.println("i in Var1 ="+ var1.i);
        System.out.println("i in Var2 ="+ var2.i);
        var1.i = 30;
        System.out.println("i in Var2 =" + var2.i);
    }

}


