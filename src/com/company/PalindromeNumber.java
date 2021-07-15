package com.company;

public class PalindromeNumber{
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int stored = number;
        // checking palindrome  for positive and negative numbers
        while (stored != 0){

            // extract the last digit of the number

            int lastDigit = stored % 10;
            System.out.println("lastDigit : " + lastDigit);

            reverse =(reverse*10 )+ lastDigit;
            System.out.println("reserve : "+reverse);

            // Drop the least significant digit
            stored =stored / 10;

            if(number==reverse){
                return true;
            }
        }
        return false;
    }

}
