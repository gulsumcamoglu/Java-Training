package Homeworks;
import java.util.*;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.print("Enter height: ");
        double h = s.nextDouble();
        System.out.print("Enter weight: ");
        double w = s.nextDouble();
        System.out.println("BodyMassIndex: " + w/(h*h));

    }
}
