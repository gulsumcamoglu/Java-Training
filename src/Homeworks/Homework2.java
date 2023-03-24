package Homeworks;
import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give a value");
        double value = s.nextDouble();
        double result = value + value*0.18;
        System.out.println("KDV TOTAL: " + result);
    }
}
