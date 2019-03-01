package com.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        int reverse = 0, reminder = 0;

        System.out.println("Please write a number: ");
        int palindrome = new Scanner(System.in).nextInt();

        int x = palindrome;

        while(palindrome !=0){

            reminder = palindrome % 10;
            reverse = (reverse * 10) + reminder;
            palindrome = palindrome / 10;
        }


        if (x <= 0) {
            throw new Exception("Please enter values bigger than zero!");
        }else if (x == reverse){
            System.out.println(x + " is a palindrome number.");
        }else{
            System.out.println(x + " is not a palindrome number.");
        }



}}
