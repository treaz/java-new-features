package com.horiaconstantin;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

//https://www.journaldev.com/24601/java-11-features
public class Java11Demo {

    static void stringUtils(){
        var blank = "hello".isBlank();
        var empty = "dsf".isEmpty();

        String multiline = "JD\nJD\nJD";
        System.out.println(multiline);
        System.out.println(multiline.lines().collect(Collectors.toList()));

        String str = " JD ";
        System.out.print("Start" + str.strip()+ "End");

        System.out.print("Start"+str.stripLeading()+"End");

        System.out.print("Start"+str.stripTrailing()+"End");


    }

//    Reading/Writing Strings to and from the Files
    static void stringsAndFiles() throws Exception {
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s); //This was posted on JD

    }
}
