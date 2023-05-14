package MethodsHomeworks;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.print("Java102.First.First.First number: ");
        int first = s.nextInt();
        System.out.print("Second number: ");
        int sec = s.nextInt();
        int max = 1;
        for (int i=1;i<=first;i++){

            if (first%i==0 && sec%i==0){
                max = i;
            }
        }
        System.out.println("EBOB: "+max);
        System.out.println("EKOK: "+ (first*sec)/max);
    }
}
