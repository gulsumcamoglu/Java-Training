package MethodsHomeworks;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int first=1,sec=1,sum;
        System.out.print(first+" "+sec+" ");
        for(int i=2;i<num;i++){
            sum = first+sec;
            first=sec;
            sec=sum;
            System.out.print(sum+" ");
        }

    }

}
