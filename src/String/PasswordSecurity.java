package String;
import java.util.*;
public class PasswordSecurity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pwd = s.nextLine();
        flip(pwd);

    }

    public static void flip(String pwd){
        for (int i=1;i<pwd.length();i++){


            System.out.println(pwd.substring(0,i)+" --");
            System.out.println(pwd.substring(i)+" --");
            String str1 = pwd.substring(0,i);
            String str2 = pwd.substring(i);
            if (str1.length()%2==0 && str2.length()%2==0 ){
                if (str1.contains("0") &&  str1.contains("1") ){

                }else if(str2.contains("1") && str2.contains("0")){

                }
            }else{
                continue;
            }



        }

    }
}
