package Arrays;
import java.util.Arrays;
public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                        {4,3}};
        write(transpose(arr));

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
