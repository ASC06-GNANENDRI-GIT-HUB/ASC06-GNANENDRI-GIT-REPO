package com.labExp.Lab1.Question4;

public class WordCount {
    public static int Count(String input){
        String[] words = input.split("[^A-Xa-z]+");
        int count = 0;
        for(String word : words ){
            if(!word.isEmpty()){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String input = "sum of 12 and 23 is 32";
        int result = Count(input);
        System.out.println("number of words" + "is" + " " + result);
    }
}
