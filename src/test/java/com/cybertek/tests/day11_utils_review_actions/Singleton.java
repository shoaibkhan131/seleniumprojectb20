package com.cybertek.tests.day11_utils_review_actions;

public class Singleton {

    private Singleton(){}

    private static String word;

    public static String getWord(){
        if (word == null){
            System.out.println("first time call. Word object is Null"+" Assigning value to it now!");

            word="Something";
        }else{
            System.out.println("word already has a value!");
        }

        return word;
    }
}
