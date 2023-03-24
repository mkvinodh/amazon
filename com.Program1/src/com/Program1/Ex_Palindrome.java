package com.Program1;
import java.util.Scanner;

public class Ex_Palindrome {

    public static void main(String[] args) {
        
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Check if string is palindrome
        if(isPalindrome(str)){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }
    }

    // Method to check if string is palindrome
    public static boolean isPalindrome(String str){
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();
        
        // Check if string is palindrome
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
