package Homeworks;
import java.util.Scanner;
public class PracticeLoop2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        int sum = 0;
        while (y>=0){
            if (y%2==1){
                sum +=y;
            }
            y = s.nextInt();
        }

        System.out.println(sum);

        System.out.println("----");

        int num2 = s.nextInt();
        int sum2 = 0;
        while (!(num2%2==1)){
            if (num2%4==0){
                sum2 +=num2;
            }
            num2 = s.nextInt();
        }
        System.out.println(sum2);
    }
}
