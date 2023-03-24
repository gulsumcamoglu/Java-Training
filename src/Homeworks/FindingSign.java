package Homeworks;
import java.util.Scanner;
import java.util.StringJoiner;

public class FindingSign {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = s.nextInt();
        System.out.print("Enter month: ");
        int m = s.nextInt();
        if(m==1 && day<=21) {
            System.out.println("Oğlak");
        } else if (m==1 && day>21) {
            System.out.println("Kova");
        }

        if(m==2 && day<=19) {
            System.out.println("Kova");
        }else if (m==2 && day>19){
            System.out.println("Balık");
        }
        if(m==3 && day<=20) {
            System.out.println("Balık");
        }else if(m==3 && day>20){
            System.out.println("Koç");
        }
        if(m==4 && day<=20) {
            System.out.println("Koç");
        }else if(m==4 && day>20) {
            System.out.println("Boğa");
        }
        if(m==5 && day<=21) {
            System.out.println("Boğa");
        }else if(m==5 && day>21){
            System.out.println("İkizler");
        }
        if(m==6 && day<=22) {
            System.out.println("İkizler");
        }else if(m==6 && day>22){
            System.out.println("Yengeç");
        }
        if(m==7 && day<=22) {
            System.out.println("Yengeç");
        }else if (m==7 && day>22){
            System.out.println("Aslan");
        }
        if(m==8 && day<=22) {
            System.out.println("Aslan");
        }else if(m==8 && day>22) {
            System.out.println("Başak");
        }
        if(m==9 && day<=22) {
            System.out.println("Başak");
        }else if(m==9 && day>22){
            System.out.println("Terazi");
        }
        if(m==10 && day<=22) {
            System.out.println("Terazi");
        }else if(m==10 && day>22){
            System.out.println("Akrep");
        }
        if(m==11 && day<=21) {
            System.out.println("Akrep");
        }else if(m==11 && day>21){
            System.out.println("Yay");
        }
        if(m==12 && day<=21) {
            System.out.println("Yay");
        }else if(m==12 && day>21){
            System.out.println("Oğlak");
        }


    }
}
