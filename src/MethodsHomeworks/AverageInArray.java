package MethodsHomeworks;

public class AverageInArray {
    public static void main(String[] args) {
        int[] list =  {15,6,7,12,7,9,3};
        System.out.println(averageArray(list));

    }

    static double averageArray(int[] arr){
        double avg = 0.0;
        int sum = 0;
        for (int i:arr) {
            sum = sum +i;
        }
        return sum / (double) arr.length;
    }
}
