package com.labExp.Lab2.Question2;

public class WelcomeApp { public static String welcomeMessage(String name){
    return " Hello " + name + ",welcome to java world!";
}
    public static void main(String[] args){
        String message = welcomeMessage("Alice");
        System.out.println(message);
    }
}
