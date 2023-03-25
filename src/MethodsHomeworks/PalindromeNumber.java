package MethodsHomeworks;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(33));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(345));

    }

    static boolean isPalindrome(int num){
        int temp = num, reverse=0,lastDigit=0;
        while (temp!=0){
            lastDigit = temp %10;
            reverse = (reverse*10) + lastDigit;
            temp = temp / 10;
        }
        //707 ->num
        //707 ->reverse
        //247 - 742
        boolean isPalindrome = false;
        if (reverse == num)
            return true;
        else
            return false;


    }

}
