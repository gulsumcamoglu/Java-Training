package BordaAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Question2 {

    static ArrayList<Locator> locators;
    public static void main(String[] args) {
        locators = new ArrayList<>();
        try{
            File file = new File("q2_input.txt");
            Scanner reader = new Scanner(file);
            String polygon1 ;



            try {
                while (!(polygon1 = reader.nextLine()).isBlank()){


                    String[] p1 = polygon1.split(";");
                    for (int i=0;i<p1.length;i++){


                        double x = Double.parseDouble(p1[i].split(",")[0]);

                        double y = Double.parseDouble(p1[i].split(",")[1]);
                        double rotz = Double.parseDouble(p1[i].split(",")[2]);
                        double azimuth = Double.parseDouble(p1[i].split(",")[3]);
                        Locator l = new Locator(x,y,rotz,azimuth);
                        locators.add(l);
                    }
                }
            }catch (NoSuchElementException n){

            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        CreateTags();


    }

    public static void CreateTags(){
        Pair pair_tag = new Pair();

        int i=0;
        while (i<locators.size()){
            Pair intersect1;
            Pair intersect2;
            Pair intersect3;
            double max_x = 0;
            double min_x = 0;
            double max_y = 0;
            double min_y = 0;
            int f=i; //0
            int s=i+1;//1
            int l=i+2;//2
            Locator l1 = locators.get(f);
            Locator l2 = locators.get(s);
            Locator l3 = locators.get(l);
            double slope1 = Math.tan(l1.azimuth+l1.rotz);
            double b1 = -1*(slope1*l1.x)+l1.y;// first locator equation y = slope1*x + b1

            double slope2 = Math.tan(l2.azimuth+l2.rotz);
            double b2 = -1*(slope2*l2.x)+l2.y;
            double slope3 = Math.tan(l3.azimuth+l3.rotz);
            double b3 = -1*(slope3*l3.x)+l3.y;
            Pair p1 = new Pair(slope1,b1);
            Pair p2 = new Pair(slope2,b2);
            Pair p3 = new Pair(slope3,b3);
            intersect1 = findIntersection(p1,p2);
            if (intersect1.x>max_x) max_x=intersect1.x;
            if (intersect1.x<min_x) min_x=intersect1.x;
            if (intersect1.y>max_y) max_y=intersect1.y;
            if (intersect1.y<min_y) min_y=intersect1.y;
            intersect2 = findIntersection(p1,p3);
            if (intersect2.x>max_x) max_x=intersect2.x;
            if (intersect2.x<min_x) min_x=intersect2.x;
            if (intersect2.y>max_y) max_y=intersect2.y;
            if (intersect2.y<min_y) min_y=intersect2.y;
            intersect3 = findIntersection(p2,p3);
            if (intersect3.x>max_x) max_x=intersect3.x;
            if (intersect3.x<min_x) min_x=intersect3.x;
            if (intersect3.y>max_y) max_y=intersect3.y;
            if (intersect3.y<min_y) min_y=intersect3.y;

            Random r = new Random();
            double tagx;
            double tagy;
            tagx = min_x + (max_x-min_x)*r.nextDouble();
            tagy = min_y + (max_y-min_y)*r.nextDouble();
            pair_tag.x = tagx;
            pair_tag.y = tagy;
            System.out.println(pair_tag.toString());
            i=i+3;

        }

    }

    public static Pair findIntersection(Pair p1,Pair p2){
        double x = (p2.y - p1.y)/(p2.x - p1.x);
        double y = p1.x*x + p1.y;
        Pair p3  = new Pair(x,y);
        return p3;
    }
}
