package Homeworks;
import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s =  new Scanner(System.in);
        System.out.print("1.Sayı: ");
        a = s.nextInt();
        System.out.print("2.Sayı: ");
        b = s.nextInt();
        System.out.print("3.Sayı: ");
        c = s.nextInt();
        if(a>c && a>b){
            if (b>c){
                System.out.println(a+">"+b+">"+c);
            }else {
                System.out.println(a+">"+c+">"+b);
            }
        } else if (c>b && c>a) {
            if (b>a){
                System.out.println(c+">"+b+">"+a);
            }else {
                System.out.println(c+">"+a+">"+b);
            }
        } else if (b>c && b>a) {
            if (c>a){
                System.out.println(b+">"+c+">"+a);
            }else {
                System.out.println(b+">"+a+">"+c);
            }
        }
    }
}
