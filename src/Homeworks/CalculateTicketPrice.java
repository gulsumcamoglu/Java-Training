package Homeworks;
import java.util.*;
public class CalculateTicketPrice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Km");
        double km = s.nextDouble();
        System.out.println("Enter age");
        int age = s.nextInt();
        System.out.println("Type of trip; 1: One way, 2:Round");
        int type = s.nextInt();
        double totalKm = km*0.1;
        if (km>0 && age>0 && (type==1 || type==2)){
            if (age<12){
                totalKm = totalKm - (totalKm/2);
            } else if (age>=12 && age<24) {
                totalKm = totalKm - (totalKm*0.1);
            } else if (age>65) {
                totalKm = totalKm - (totalKm*0.3);
            }
            if(type==2){
                totalKm = totalKm - (totalKm*0.2);
                totalKm = totalKm*2;
            }
            System.out.println(totalKm);
        }else{
            if (km<0){
                System.out.println("invalid km, must be positive");
            } else if (age<0) {
                System.out.println("must be positive");
            }else if(type!=1 || type!=2){
                System.out.println("trip type must be 1 or 2");
            }
        }
    }






}
