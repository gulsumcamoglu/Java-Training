package Homeworks;
import java.util.*;
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int num = s.nextInt();
        int temp = num;
        int temp2 = num;
        int count = 0;
        while (num!=0){
            int d = num %10;
            num = num/10;
            count++;
        }
        while (temp!=0){
            int d = temp %10;
            sum = (int) (sum + Math.pow(d,count));
            temp = temp/10;
        }
        if (sum == temp2){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
