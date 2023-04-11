package MethodsHomeworks;

public class PrimeNums {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (prime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean prime(int x){
        int count=0;
        for (int i=1;i<=x;i++){
            if (x%i==0){
                count++;
            }
        }
        if (count==2){

            return true;
        }else {
            return false;
        }
    }
}
