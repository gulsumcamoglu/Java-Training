package MethodsHomeworks;
import java.util.Scanner;
public class AtmProject {
    public static void main(String[] args) {
        String userName,password;
        Scanner s = new Scanner(System.in);
        int count = 1;
        double balance = 1500.0 ;
        while(count<4){
            System.out.print("enter username: ");
            userName = s.nextLine();
            System.out.print("enter password: ");
            password = s.nextLine();
            if (userName.equals("glsm") && password.equals("1234")){
                System.out.println("Succesfull");
                System.out.println("1-Para Yatırma\n"+
                        "2-Para Çekme\n"+
                        "3-Bakiye Sorgulama\n"+
                        "4-Quit");
                int move = s.nextInt();
                while (move !=4){
                    switch (move){
                        case 1:
                            System.out.print("Enter amount of money that you want to add: ");
                            double add = s.nextDouble();
                            balance = balance + add;
                            System.out.println("succesfully added. new balance: "+balance);
                            break;
                        case 2:
                            System.out.print("Enter amount of money that you want to take: ");
                            double remove = s.nextDouble();
                            balance = balance - remove;
                            System.out.println("succesfully added. new balance: "+balance);
                            break;
                        case 3:
                            System.out.println("Your balance "+balance);
                            break;

                    }
                    System.out.println("any other movement");
                    System.out.println("1-Para Yatırma\n"+
                            "2-Para Çekme\n"+
                            "3-Bakiye Sorgulama\n"+
                            "4-Quit");
                    move = s.nextInt();
                }
                System.out.println("see you next time");
                break;
            }else{
                if (3-count==0){
                    System.out.println("blocked account");
                }else {
                    System.out.println("Wrong username or password, Try Again!!");
                    System.out.println("remain " + (3 - count));

                }
                count++;
            }

        }

    }
}
