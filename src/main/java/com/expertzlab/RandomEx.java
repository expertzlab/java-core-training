package com.expertzlab;

import java.util.Random;

/**
 * Created by gireeshbabu on 20/04/17.
 */
public class RandomEx {

    public static void main(String[] args) {
        Random rnd = new Random();
        for(int i =0; i<10; i++)
        System.out.println(rnd.nextInt(2000));
    }
}
