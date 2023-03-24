package Homeworks;
import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
        System.out.print("Enter your Math grade:");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.print("Enter your Physic grade:");
        int p = s.nextInt();
        System.out.print("Enter your Music grade:");
        int mu = s.nextInt();
        System.out.print("Enter your History grade:");
        int h = s.nextInt();
        System.out.print("Enter your Chem grade:");
        int c = s.nextInt();

        int result = m + p + mu + h + c ;
        boolean r = result > 60 ;
        String ss = r ? "Sınıfı Geçti" : "Sınıfta kaldı";
        System.out.println(ss);
    }
}
