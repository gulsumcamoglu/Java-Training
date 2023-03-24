package Homeworks;
import java.util.Scanner;
public class PassClass {
    public static void main(String[] args) {
        double math,phys,chem,music;
        Scanner s = new Scanner(System.in);
        System.out.println("enter math");
        math = s.nextDouble();
        System.out.println("enter phys");
        phys = s.nextDouble();
        System.out.println("enter chem");
        chem = s.nextDouble();
        System.out.println("enter music");
        music = s.nextDouble();
        double result=0;
        if (math>=0 && math <=100){

            result = result + math;
        }if (phys>=0 && phys <=100) {
            result = result + phys;
        } if (chem>=0 && chem <=100) {
            result = result + chem;
        } if (music>=0 && music <=100) {
            result = result + music;
        }
        System.out.println(result);
        System.out.println(result>=55 ? "Geçti" : "Geçemedi");
    }
}
