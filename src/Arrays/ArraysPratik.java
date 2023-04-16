package Arrays;
import java.util.*;

public class ArraysPratik {
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

        int[] arr1 = {1,1,2,3,4,5,5,5,7,2,2,3,4,4,6,6,8,8};

        System.out.println(Arrays.toString(RepeatValuesAlternative(arr1)));


        // Ödev1

        System.out.print("Enter array size: ");
        int size = s.nextInt();
        System.out.println(Arrays.toString(sort(createArray(size))));
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

    public static void RepeatValues(int[] arr){


        for (int i=0;i<arr.length;i++){
            int temp = arr[i];
            int count=0;
            for (int j=0;j<arr.length;j++){
                if (temp==arr[j]) count++;
            }
            if (count>1) System.out.println(temp);
        }
    }
    public static int[] RepeatValuesAlternative(int[] arr){
        int[] dublicate = new int[arr.length];
        int start = 0;
        for (int i=0;i<arr.length;i++){

            for (int j=0;j<arr.length;j++){
                if ( (i != j) && (arr[i]==arr[j]) && arr[i]%2==0){
                    if (!isFind(dublicate,arr[i]) ) dublicate[start++]=arr[i];

                }

            }

        }

        return dublicate;
    }

    public static boolean isFind(int[] arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }

    public static int[] createArray(int size){
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            Scanner s= new Scanner(System.in);
            System.out.print("Enter number "+i+" : ");
            int num = s.nextInt();
            arr[i] = num;
        }
        return arr;
    }

    public static int[] sort(int[] arr){
        int k=0;

        for (int i=0;i<arr.length;i++){
            k=arr[i];
            int min =arr[i];
            int arg = 0;
            for (int j=i;j<arr.length;j++){
                if (min>=arr[j]){
                    min =arr[j];
                    arg=j;
                }

            }
            arr[arg] = k;
            arr[i] = min;
            System.out.println("m");



        }

        return arr;
    }

}
