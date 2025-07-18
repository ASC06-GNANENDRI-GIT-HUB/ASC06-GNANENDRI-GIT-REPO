package com.labExp.Lab1.Question5;

public class StringMethodTest {
    public static void main(String[] args){
        String str = "Hello Java World";
        System.out.println("chatAt()" + str.charAt(6));
        System.out.println("contains(java)" + str.contains("Java"));
        System.out.println("length():" + str.length());
        System.out.println("indexof(/java)" + str.indexOf("Java"));
        System.out.println("equals(/hello java worls" + str.equals("Hello Java World"));
        System.out.println("equalsignorescase" + str.equalsIgnoreCase("  Hello Java World  " ));
    }
}
