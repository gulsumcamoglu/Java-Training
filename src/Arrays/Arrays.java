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
