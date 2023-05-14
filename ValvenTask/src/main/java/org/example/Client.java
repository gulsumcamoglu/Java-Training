package org.example;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Client {
    private static Socket s;
    private static ArrayList<String> paths;
    public static void main(String args[])throws Exception{
        s=new Socket("localhost",3333);
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str="",str2="";

        while(!str.equals("stop")){
            str=br.readLine();
            dout.writeUTF(str);
            dout.flush();


            if (str.equals("dir")){
                ObjectInputStream objectInput = new ObjectInputStream(s.getInputStream()); //Error Line!
                try {
                    Object object = objectInput.readObject();
                    paths =  (ArrayList<String>) object;
                    for (int i=1;i<paths.size();i++){
                        System.out.println(paths.get(i));
                    }
                    System.out.print(paths.get(0)+">");
                } catch (ClassNotFoundException e) {
                    System.out.println("The title list has not come from the server");
                    e.printStackTrace();
                }
            }else{
                ObjectInputStream objectInput = new ObjectInputStream(s.getInputStream());
                Object object = objectInput.readObject();
                paths =  (ArrayList<String>) object;
                System.out.print(paths.get(0)+">");
            }


        }

        dout.close();
        s.close();
    }}


