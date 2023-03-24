package com.Program1;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if number is Armstrong number
        if(isArmstrongNumber(num)){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
        }
    }

    // Method to check if number is Armstrong number
    public static boolean isArmstrongNumber(int num){
        int sum = 0;
        int temp = num;
        int digits = String.valueOf(num).length();
        
        while(temp > 0){
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        
        return num == sum;
    }
}
