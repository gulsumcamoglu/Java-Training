package Homeworks;
import java.util.*;
public class Homework5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Give radius: ");
        double r = s.nextDouble();
        System.out.println("Alan: "+(Math.PI*r*r));
        System.out.print("Enter an angle: ");
        double angle = s.nextDouble();
        System.out.println("Alan dilim: "+ (Math.PI*Math.pow(r,r)*angle)/360);
    }
}
