package com.expertzlab.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gireeshbabu on 20/04/17.
 */
public class UseofList {

    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("a");
        myList.add("d");
        myList.add("c");
        myList.add("b");

        for(Object str: myList) {
            System.out.println((String) str);
        }
    }
}
