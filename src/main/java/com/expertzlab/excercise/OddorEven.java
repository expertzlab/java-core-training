package com.expertzlab.excercise;

import java.util.Scanner;

/**
 * Created by gireeshbabu on 18/04/17.
 */
public class OddorEven {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int rem = num %2;
        if(rem > 0){
            System.out.println("Odd number");
        } else {
            System.out.println("Even Number");
        }
    }
}
