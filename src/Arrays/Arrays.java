package Arrays;

import BoxerGame.Match;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        MinandMax(arr);
    }

    public static void MinandMax(int[] arr){
        int min=0;
        int max=0;
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]) min = arr[i];
            if (max<arr[i]) max = arr[i];
        }
        System.out.println("min "+min +" max: "+ max);
    }
}
