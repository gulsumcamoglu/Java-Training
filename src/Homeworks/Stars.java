package Homeworks;
import java.util.Scanner;
public class Stars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int y =n;
        for (int i=1;i<=n;i++){ // num of row
            for (int k = 1;k<=(n-i);k++){ // for blanks in each row
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i=1;i<=n-1;i++){ // num of row
            for (int k = 1;k<=i;k++){ // for blanks in each row
                System.out.print(" ");
            }
            for (int b=2*(y-1)-1;b>=1;b--){
                System.out.print("*");

            }
            y--;


            System.out.println();
        }


    }
}
