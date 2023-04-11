package MethodsHomeworks;
import java.util.Scanner;
public class Stars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i=num;i>=1;i--){
            for (int j = 0;j<num-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<(2*i-1);k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
