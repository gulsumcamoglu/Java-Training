package MethodsHomeworks;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("how many numbers will enter: ");
        int num = s.nextInt();
        int max=0;
        int min=0;
        for (int i = 0;i<num;i++){
            System.out.print(i+". Sayı: ");
            int numTaken = s.nextInt();
            if (numTaken>max){
                max = numTaken;
            } else if (numTaken<min) {
                min = numTaken;
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}
