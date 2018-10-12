package com.company;

public class Main {

    public static int integerSum(int n){
        System.out.println("Enter an integer n.");
       int output = 0;
       int i= 1;
       while (i<=n){
           output+=i;
           i++;
       }
       System.out.println("The sum from 1 to"+n+"is"+output+".");

    }
}
