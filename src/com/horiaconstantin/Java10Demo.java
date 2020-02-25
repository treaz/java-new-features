package com.horiaconstantin;

import java.util.List;

//https://www.journaldev.com/20395/java-10-features
public class Java10Demo {


    static void localVarTypeInference(){
        var numbers = List.of(1, 2, 3, 4, 5);
        for (var number : numbers) {
            System.out.println(number);
        }

    }
}
