package com.expertzlab;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by gireeshbabu on 11/04/17.
 */
public class ScanningConcat {

    public static void main(String[] args) throws IOException {
       int var = System.in.read();
        while(var != '\n'){
            System.out.println("You entered: "+var);
            var = System.in.read();
        }
    }
}
