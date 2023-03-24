package Homeworks;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner s = new Scanner(System.in);
        System.out.print("First num: ");
        n1 = s.nextInt();
        System.out.print("Second num: ");
        n2 = s.nextInt();
        System.out.print("Enter one of those 1-toplama\n2-çıkarma\n3-çarpma\n4-bölme ");
        select = s.nextInt();
        switch (select){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("invalid");

        }
    }
}
