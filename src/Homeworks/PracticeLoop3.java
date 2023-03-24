package Homeworks;
import java.util.*;
public class PracticeLoop3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        for (int i=0;i<=y;i++){
            System.out.print((int)Math.pow(2,i)+" ");

            System.out.print((int)Math.pow(4,i)+" ");

            System.out.print((int)Math.pow(5,i)+" ");
        }
        System.out.println();
    }
}
