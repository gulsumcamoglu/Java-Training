package Homeworks;
import java.util.*;
public class GroceryCashierProgram {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.print("Kg of Pear: ");
        double p = s.nextDouble();
        System.out.print("Kg of Apple: ");
        double a = s.nextDouble();
        System.out.print("Kg of Tomato: ");
        double t = s.nextDouble();
        System.out.print("Kg of Banana: ");
        double b = s.nextDouble();
        System.out.print("Kg of Eggplant: ");
        double e = s.nextDouble();
        double total = p*2.14 + a*3.67 + t*1.11 + b*0.95 + e*5.0;
        System.out.println("Total: "+total);
    }
}
