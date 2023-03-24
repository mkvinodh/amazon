package com.Program1;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Reverse the number
        int reversedNum = reverseNumber(num);
        
        System.out.println("The reverse of " + num + " is " + reversedNum);
    }

    // Method to reverse a number
    public static int reverseNumber(int num){
        int reversedNum = 0;
        
        while(num != 0){
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        
        return reversedNum;
    }
}
