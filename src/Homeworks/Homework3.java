package Homeworks;
import java.util.*;
public class Homework3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give the values of triangle:");
        System.out.print("1: ");
        double bir = s.nextDouble();
        System.out.print("2: ");
        double iki = s.nextDouble();


        double hypo = Math.sqrt(bir*bir + iki*iki);
        System.out.println("hypo: "+(int)hypo);

        double alan = (bir + iki)/2;
        System.out.println("alan: "+(int)alan);

    }
}
