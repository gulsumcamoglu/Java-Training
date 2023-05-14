package MethodsHomeworks;
import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter an integer number");
            num = s.nextInt();
            if (prime(num)) System.out.println(num+ " is prime");
            else System.out.println(num+" is not prime");
        }
        while (s.hasNextInt());



        if (!s.hasNextInt()){
            System.out.println("Please enter int number!!");
        }
    }

    public static boolean prime(int x){
        int count=0;
        for(int i = 1;i<=x;i++){
            if(x%i==0) count++;
        }
        if (count==2) return true;
        else return false;

    }
}
