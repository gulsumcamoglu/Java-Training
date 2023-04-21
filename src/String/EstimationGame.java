package String;
import java.sql.SQLOutput;
import java.util.*;
public class EstimationGame {
    public static void main(String[] args) {
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
        System.out.println("you fail!! num is "+num);

    }
}
