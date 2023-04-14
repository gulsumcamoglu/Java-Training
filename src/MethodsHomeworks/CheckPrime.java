package MethodsHomeworks;
import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        System.out.print("Enter an integer number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        while (num%1==0){
            if (prime(num)) System.out.println(num+ " is prime");
            else System.out.println(num+" is not prime");
            System.out.print("Enter an integer number");
            num = s.nextInt();
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
