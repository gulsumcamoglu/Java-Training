package String;
import java.sql.SQLOutput;
import java.util.*;
public class EstimationGame {
    public static void main(String[] args) {
        /**
        int rights=5;
        Scanner s = new Scanner(System.in);
        int num = (int)(Math.random()*101);

            while(rights>0){
                System.out.print("Guess number: ");
                int guessNum = s.nextInt();
                if (num==guessNum) System.out.println("You win");
                else{
                    System.out.println("wrong guess");
                    if (num<guessNum){
                        System.out.println("your guess bigger than num");
                    }
                    else {
                        System.out.println("your guess smaller than num");
                    }
                    rights--;
                }
            }
        System.out.println("you fail!! num is "+num); */

        getSmallestAndLargest("welcometojava",3);

    }
    public static void getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] stack = new String[s.length()/3];

        for (int i=0;i<s.length();i=i+3){

        }


    }
    public static boolean isPalindrome(String str){
        boolean isPalindrome=false;
        int j=str.length()-1;
        int i=0;

            while(i<j){
                if (str.charAt(i)==str.charAt(j)){
                    isPalindrome=true;
                }else{
                    isPalindrome=false;
                }
                j--;
                i++;
            }

        return isPalindrome;
    }
}
