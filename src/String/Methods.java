package String;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        String str = "patika555";
        System.out.println(str.charAt(3)); // 3.indexteki char
        System.out.println(str.codePointAt(1)); // 1.indexteki char'ın ascii kodu
        System.out.println(str.codePointBefore(1)); // 1.'den bir öncekinin ascii'si
        System.out.println(str.codePointCount(2,5)); // belirtilen aralıktaki unicode
        String str2 = "patikac";
        System.out.println(str.compareTo(str2)); // charat değerlerinin farkını alıyor
        System.out.println(str.compareToIgnoreCase(str2));

        System.out.println(str.concat(".dev"));
        System.out.println(str.contains("tika"));
        System.out.println(str.contentEquals("tika"));
        System.out.println(str.endsWith("5"));
        Scanner s = new Scanner(System.in);
        String exp = "3*(4/2)-6+(7-5)+(3*4)";
        System.out.println(exp.substring(exp.indexOf("(")+1,exp.indexOf(")")));
        System.out.println(Integer.valueOf("4"));
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());
        System.out.println(exp.substring(exp.lastIndexOf("(")+1,exp.lastIndexOf(")")));

        System.out.println(str.indexOf("/")); // yoksa -1 döner
        int count=0;
        for(int i=0;i<exp.length();i++){
            if (exp.charAt(i) == '(') {
                count++;
            }
        }
        System.out.println(count);

        System.out.println(exp.replace("("," "));
        // replaceAll regex de alır.
        System.out.println(str.split("t")[0]); // array2 koyar
        System.out.println(str.startsWith("p"));
        System.out.println(str.substring(2));// begin from 2
        System.out.println(str.toUpperCase()); // tolowercase
        System.out.println(str.trim()); // sağ sol boşluklarını silmek
        int i=30;
        String s1 = String.valueOf(i);// int to str
        System.out.println(s1+10);
        //System.out.println((String) i); !!!!!!OLMAZ!!!!

        System.out.println(getSmallestAndLargest("welcometojava",3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,0+k);
        String largest = s.substring(0,0+k);

        for(int i=1;i<s.length();i++){

            if(i+k<=s.length()){

                System.out.println(s.substring(i,i+k));
                if (s.substring(i,i+k).compareTo(smallest)<0){
                    smallest = s.substring(i,i+k);
                }else if(s.substring(i,i+k).compareTo(largest)>0) {
                    largest = s.substring(i,i+k);
                }
            }
        }

        return smallest + "\n" + largest;
    }
}
