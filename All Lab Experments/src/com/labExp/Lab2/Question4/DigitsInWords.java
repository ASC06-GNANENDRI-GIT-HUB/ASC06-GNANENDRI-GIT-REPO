package com.labExp.Lab2.Question4;

public class DigitsInWords {
    public static void printDigitsInWords(int number){
        if(number<100||number>999){
            System.out.println("Enter a 3-degit number.");
            return;
        }
        String[] words = {"zero", "one", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numStr = String.valueOf(number);
        for(char digit : numStr.toCharArray()){
            System.out.println(words[digit - '0'] + " ");
        }
    }
    public static void main(String[] args){
        int number = 951;
        System.out.println("output: ");
        printDigitsInWords(number);
    }
}
