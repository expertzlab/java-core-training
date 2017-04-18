package com.expertzlab.excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by gireeshbabu on 18/04/17.
 */
public class CharaterWiseReader {

    public static void main(String[] args) throws IOException {
        InputStreamReader ipsReader = new InputStreamReader(System.in);
        BufferedReader bfReader = new BufferedReader(ipsReader);
        char ch[] = new char[10];
        int count= 0;
        int i =0;
        while((count = bfReader.read(ch)) != -1){

            for( ;i<count; i++){
                if(i > 5) break;
                System.out.println("i -" +i+" : char -" + ch[i] + " : int value -"+ (int) ch[i]);

                System.out.println("a");


                System.out.println(" b");

            }
            if(i>5) break;
        }
    }
}
