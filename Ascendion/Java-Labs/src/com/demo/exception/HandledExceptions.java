package com.demo.exception;

public class HandledExceptions {
    public static void main (String[] args) {
        int i = 100;
        int result;
        result = 0;
        System.out.println("divide by zero");
        try{
            result = i/0;
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
            System.out.println("exception handled");
        }
        System.out.println("result");
    }
}
