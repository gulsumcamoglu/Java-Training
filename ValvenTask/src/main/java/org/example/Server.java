package org.example;
import java.net.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Server {
    private static  File currentPath;

    static {
        try {
            currentPath = new File(System.getProperty("user.dir")).getCanonicalFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    ;
    private static ServerSocket ss;
    private static DataInputStream din;
    private static DataOutputStream dout;
    private static Socket s;
    private static ArrayList<String> name;

    public static void main(String args[])throws Exception{
        ss=new ServerSocket(3333);
         s=ss.accept();
        din=new DataInputStream(s.getInputStream());
        dout=new DataOutputStream(s.getOutputStream());


        String str="";

        while(!str.equals("stop")){
            str=din.readUTF();
            System.out.println("client says: "+str);
            if (str.equals("cmd")){
                ObjectOutputStream objectOutput = new ObjectOutputStream(s.getOutputStream());
                name = new ArrayList<>();
                name.add(String.valueOf(currentPath));
                objectOutput.writeObject(name);
            }else if(str.contains(" ")){
                String[] strArr = str.split(" ");
                if (strArr[0].equals("cd")){
                    if (strArr[1].equals("..")){
                        System.out.println(currentPath);
                        currentPath = new File(currentPath.getParent()).getCanonicalFile();
                        ObjectOutputStream objectOutput = new ObjectOutputStream(s.getOutputStream());
                        name = new ArrayList<>();
                        name.add(String.valueOf(currentPath));
                        objectOutput.writeObject(name);
                    }else{
                        File newPath = new File(currentPath +"\\" + strArr[1]);
                        System.out.println(newPath);
                        if (newPath.exists()){
                            currentPath = newPath;
                            ObjectOutputStream objectOutput = new ObjectOutputStream(s.getOutputStream());
                            name = new ArrayList<>();
                            name.add(String.valueOf(currentPath));
                            objectOutput.writeObject(name);
                        }else{
                            ObjectOutputStream objectOutput = new ObjectOutputStream(s.getOutputStream());
                            name = new ArrayList<>();
                            name.add(String.valueOf(currentPath));
                            objectOutput.writeObject(name);
                        }
                    }
                } else if (strArr[0].equals("mkdir")) {
                    File directory = new File(currentPath+"\\"+strArr[1]);
                    if (!directory.exists()) {
                        directory.mkdir();
                        ObjectOutputStream objectOutput = new ObjectOutputStream(s.getOutputStream());
                        name = new ArrayList<>();
                        name.add(String.valueOf(currentPath));
                        objectOutput.writeObject(name);
                    }
                } else {
                    currentPath = new File(System.getProperty("user.dir")).getCanonicalFile();

                    dout.writeUTF(String.valueOf(currentPath));
                    dout.flush();

                }
            } else if (str.equals("dir")) {
                name.add(String.valueOf(currentPath));

                Path dir = Paths.get(currentPath.toURI());
                Files.walk(dir).forEach(path -> {
                    try {
                        showFile(path.toFile());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
                ObjectOutputStream objectOutput = new ObjectOutputStream(s.getOutputStream());
                objectOutput.writeObject(name);
                
            } else {

                String currentPath = new java.io.File(".").getCanonicalPath();

                dout.writeUTF(currentPath);
                dout.flush();
            }


        }
        din.close();
        s.close();
        ss.close();
    }
    public static void showFile(File file) throws IOException {

        if (file.isDirectory()) {
            name.add(file.getName());
        } else {
            name.add(file.getName());
        }


    }
}

