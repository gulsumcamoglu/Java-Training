package Homeworks;
import java.util.Scanner;
public class HarmonicNums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double sum = 1.0;
        for (int i=2;i<=n;i++){
            sum =sum + (1.0/i);
        }

        System.out.println(sum);
    }
}
