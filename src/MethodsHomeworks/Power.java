package MethodsHomeworks;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 0 for quit!! ");
        System.out.print("Please Enter Base Number: ");
        int base = s.nextInt();
        System.out.print("Please Enter Power Number: ");
        int power = s.nextInt();
        while (base !=0 || power != 0){
            System.out.println(power(base,power));
        }


    }

    public static int power(int base, int power){
        if (power==0){
            return 1;
        }
        return base * power(base,power-1);
    }
}
