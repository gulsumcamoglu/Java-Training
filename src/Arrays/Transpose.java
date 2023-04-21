package Arrays;
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        int[][] arr2 = {{1,2,3},
                        {4,3}};
        write(transpose(arr2));

        Scanner s=new Scanner(System.in);
        int size = s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length;i++){

            for(int j=1;j<arr.length+1;j++){
                int sum=0;
                for(int k=i;k<j;k++){
                    sum = sum+arr[k];
                }

                if(sum<0) {
                    count=count+1;
                }
            }
        }

        System.out.println(count);

    }



    public static int[][] transpose(int[][] arr){
        int[][] newArr;
        int max=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i].length>max) max=arr[i].length;
        }
        newArr=new int[max][arr.length];

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                newArr[j][i]=arr[i][j];
            }
        }

        return newArr;
    }

    public static void write(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
