package Arrays;
import java.util.Arrays;
public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,4,6,3,5};
        System.out.println(Arrays.toString(frequency(arr)));
        // 2,2,1,2,3,3,3,1,2,1
    }
    public static int[] frequency(int[] arr){
        int[] fre = new int[arr.length];

        for (int i=0;i<arr.length;i++){
            int count = 1;

            for (int j=0;j<arr.length;j++){
                if ( (i!=j) && arr[i]==arr[j]){
                    count++;
                }
            }
            fre[i] =count;
        }
        return fre;
    }
}
