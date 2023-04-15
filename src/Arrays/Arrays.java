package Arrays;
import java.sql.SQLOutput;
import java.util.Scanner;
import BoxerGame.Match;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = s.nextInt();
        MinandMax(arr,num);

        // Creating Letter A with Stars and 2-Dim Array
        String[][] letterA = new String[6][4];
        for (int i=0;i<letterA.length;i++){
            for (int j=0;j<letterA[i].length;j++){
                if (i==0 || i==2) letterA[i][j]=" * ";
                else if (j==0 || j==3) letterA[i][j]=" * ";
                else letterA[i][j]="   ";
            }
        }
        for (String[] row : letterA){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

        // Creating Letter A with Stars and 2-Dim Array
        /**
        * * *
        *     *
        * * *
        * * *
        *     *
        * * *
         */
        String[][] letterB = new String[6][4];
        for (int i=0;i<letterB.length;i++){
            for (int j=0;j<letterB[i].length;j++){
                if (j==0) letterB[i][j]=" * ";
                else if (j==1 || j==2){
                    if (i==0 || i==2 || i==3 || i==5) letterB[i][j]=" * ";
                    else letterB[i][j]="   ";
                }
                else if (j==3){
                    if (i==1 || i==4) letterB[i][j]=" * ";
                    else letterB[i][j]="   ";
                }else letterB[i][j]="   ";
            }
        }

        for (String[] row : letterB){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }


    }

    public static void MinandMax(int[] arr,int num){
        int min=0;
        int max=0;
        int distance = Math.abs(num-arr[0]);
        int closest = arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]) min = arr[i];
            if (max<arr[i]) max = arr[i];
            if (Math.abs(num-arr[i])<distance) closest = arr[i]; distance = Math.abs(num-arr[i]);
        }
        System.out.println("min "+min +" max: "+ max);
        System.out.println(closest+" is the closest one to "+ num);

    }
}
