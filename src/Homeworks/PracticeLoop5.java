package Homeworks;
import java.util.*;
public class PracticeLoop5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();

        int y2 = s.nextInt();
        while (y!=0){
            System.out.println(Math.pow(y,y2));
            y = s.nextInt();

            y2 = s.nextInt();
        }
    }
}
