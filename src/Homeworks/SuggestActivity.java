package Homeworks;
import java.util.Scanner;
public class SuggestActivity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int temp  = s.nextInt();
        if (temp<5){
            System.out.println("You should go to ski");
        } else if (temp>=5 && temp<15) {
            System.out.println("You should go to cinema");
        } else if (temp>=15 && temp<25) {
            System.out.println("You should go to picnic");
        }else{
            System.out.println("you should go to swim");
        }

    }
}
