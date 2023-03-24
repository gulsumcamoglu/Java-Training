package Homeworks;
import java.util.Scanner;
public class PracticeLoop4 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        int f = 1;
        for (int i=1; i<=y; i++){
            f *= i;
        }
        System.out.println(f);
        System.out.println("------------");

        int n = s.nextInt();
        int r = s.nextInt();
        int f2 = 1;
        for (int i=1; i<=n; i++){
            f2 *= i;
        }
        int f3 = 1;
        for (int i=1; i<=r; i++){
            f3 *= i;
        }
        int f4 = 1;
        for (int i=1; i<=n-r; i++){
            f4 *= i;
        }
        int result = f2/(f3*f4);
        System.out.println(result);
    }
}
