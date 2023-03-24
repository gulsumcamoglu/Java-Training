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

        System.out.println("----------");
        int num2 = s.nextInt();
        int sum=0;
        int count = 0;
        for(int k=0;k<=num2;k++){
            if(k%3==0 && k%4==0){
                sum +=k;
                count++;
            }
        }
        System.out.println("avg "+sum/count);

    }













}
