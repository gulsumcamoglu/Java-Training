package Homeworks;
import java.util.*;

public class Homework4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a km: ");
        double km = s.nextDouble();
        double result = 10 + km*(2.2);
        boolean less = 20>result;
        double tutar = less ? 20 : result;
        System.out.println("Tutar: " + tutar);
    }
}
