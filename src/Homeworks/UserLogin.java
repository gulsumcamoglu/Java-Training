package Homeworks;
import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String username,password;
        Scanner s = new Scanner(System.in);
        username = s.nextLine();
        password = s.nextLine();

        if(username.equals("gulsum") && password.equals("1234")){
            System.out.println("Succesfully Logged in");
        }else{
            if (!password.equals("1234")){
                System.out.print("enter new password: ");
                String newPassword = s.nextLine();
                if (newPassword.equals(password)){
                    System.out.println("same with last one");
                }else {
                    System.out.println("Password is created");
                }
            }
        }
    }
}
