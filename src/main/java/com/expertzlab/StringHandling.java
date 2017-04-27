package com.expertzlab;

/**
 * Created by gireeshbabu on 24/04/17.
 */
public class StringHandling {

    public static void main(String[] args) {
        String f = "banana";
        String k = f;
        //System.out.println(f.substring(2,4));
        //System.out.println(f.indexOf('a',2));

        f = new String("banana");

        System.out.println("k =" +k);

        if(f.equals(k)){
            System.out.println("They are equal");
        } else {
            System.out.println("The are not equal");
        }
    }
}
