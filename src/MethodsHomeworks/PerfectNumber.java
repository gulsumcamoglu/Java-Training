package MethodsHomeworks;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number for checking it is perfect number or not.");
        System.out.println("for quit enter 0");
        int num;
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Your number: ");
            num = s.nextInt();
            if (num==0){
                break;
            }
            int sum = 0;
            for (int i=1;i<num;i++){
                if (num%i==0){
                    sum +=i;
                }
            }
            if (sum == num){
                System.out.println(num+" is a perfect number");
            }else {
                System.out.println(num+" is not a perfect number");

            }
        }while (num !=0);
    }
}
