package MethodsHomeworks;
import java.util.*;
public class AdvancedCalculater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your movement:");
        int select;
        String menu = "1-Plus\n"+
                "2-Minus\n"+
                "3-Multiplication\n" +
                "4-Division\n"+
                "5-Exponent Calculation\n"+
                "6-Factorial Calculation\n"+
                "7-Mode Retrieval\n"+

                "8-Rectangular Area and Perimeter Calculation";
        System.out.println(menu);
        do {
            select = s.nextInt();
            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    Multiplication();
                    break;
                case 4:
                    Division();
                    break;
                case 5:
                    Exponent();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    Mod();
                    break;
                case 8:
                    calc();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (select !=0);
    }
    public static void plus(){
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
            System.out.println("Sonuç : " + result);
        }

    }
    public static void minus(){
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result -= number;
            System.out.println("Sonuç : " + result);
        }

    }

    public static void Multiplication(){
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result *= number;
            System.out.println("Sonuç : " + result);
        }
    }
    public static void Division(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
            System.out.println("Sonuç : " + result);
        }
    }

    public static void Exponent(){
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
            System.out.println("Sonuç : " + result);
        }

        public static void factorial(){
            Scanner scan = new Scanner(System.in);
            System.out.print("enter number: ");
            int num =scan.nextInt();
            int r=1;
            for(int i=1;i<=num;i++){
                r *=i;
            }
            System.out.println("result: "+r);
        }

    public static void Mod(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number :");
        int base = scan.nextInt();
        System.out.print("Enter mod num:");
        int exponent = scan.nextInt();

        System.out.println("Sonuç : " + base%exponent);
    }

    public static void calc(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter small edge :");
        int base = scan.nextInt();
        System.out.print("Enter long edge:");
        int exponent = scan.nextInt();
        System.out.println("Area: " +base*exponent);
        System.out.println("Perimeter: " +2*(base+exponent));
    }
    }

