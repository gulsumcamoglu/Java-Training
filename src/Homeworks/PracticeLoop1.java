package Homeworks;
import java.util.Scanner;
public class PracticeLoop1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        for(int i=0;i<=y;i++){

            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
