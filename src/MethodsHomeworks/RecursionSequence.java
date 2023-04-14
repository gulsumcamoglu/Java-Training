package MethodsHomeworks;
import java.util.Scanner;
public class RecursionSequence {

        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        System.out.println(sequenceCreator(num,num,false));


    }

    public static String sequenceCreator(int num,int temp,boolean stop){
        if (num<=0){
            stop = true;
            return num +" "+ sequenceCreator(num+5,temp,stop);
        }else{
            if (stop){
                if (num==temp) return num + " ";
                return num  +" "+ sequenceCreator(num+5,temp,stop);
            }

            else return num  +" "+  sequenceCreator(num-5,temp,stop);
        }

    }
}
