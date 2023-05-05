package BordaAssignment;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*;


public class Question1 {
    static ArrayList<ArrayList> pairsOfPolies; // each pair of point that belongs to poliygons
    static ArrayList<ArrayList> pairsOfPassages;// each pair of point that belongs to Passages
    static ArrayList<ArrayList> pairsOfLines;// each pair of point that belongs to Lines
    static ArrayList<ArrayList> pairsOfPoliesLine; // using the point, creating the line of polygons and save the m and n via y = mx + n;
    static ArrayList<ArrayList> pairsOfPassagesLine;// using the point, creating the line of Passages and save the m and n via y = mx + n;
    static ArrayList<ArrayList> pairsOfLinesLine;// using the point, creating the lines and save the m and n via y = mx + n;
    public static void main(String[] args) {
        pairsOfPolies = new ArrayList<>();
        pairsOfPassages= new ArrayList<>();
        pairsOfLines= new ArrayList<>();
        pairsOfPoliesLine = new ArrayList<>();
        pairsOfPassagesLine= new ArrayList<>();
        pairsOfLinesLine= new ArrayList<>();
        try{
            File file = new File("q1_input.txt"); // reading the input file
            Scanner reader = new Scanner(file);
            String polygon1 ;
            /**
             * At the end of this loop, will have the all points of polygons
             */
            while (!(polygon1 = reader.nextLine()).isEmpty()){
                ArrayList<Pair> poly = new ArrayList<>();
                System.out.println(polygon1);
                String[] p1 = polygon1.split(";"); // seperate the every point with ;

                for (int i=0;i<p1.length;i++){


                    double v1 = Double.parseDouble(p1[i].split(",")[0]);

                    double v2 = Double.parseDouble(p1[i].split(",")[1]);
                    Pair p = new Pair(v1,v2); // save the x,y pairs
                    poly.add(p);
                }
                pairsOfPolies.add(poly);
            }
            /**
             * At the end of this loop, will have the all points of passages
             */
            while (!(polygon1 = reader.nextLine()).isEmpty()){
                ArrayList<Pair> door = new ArrayList<>();
                System.out.println(polygon1);
                String[] p1 = polygon1.split(";");
                for (int i=0;i<p1.length;i++){


                    double v1 = Double.parseDouble(p1[i].split(",")[0]);

                    double v2 = Double.parseDouble(p1[i].split(",")[1]);
                    Pair p = new Pair(v1,v2);
                    door.add(p);
                }
                pairsOfPassages.add(door);
            }
            /**
             * At the end of this loop, will have the all points of Lines
             */
            try {
                while (!(polygon1 = reader.nextLine()).isBlank()){
                    ArrayList<Pair> line = new ArrayList<>();
                    System.out.println(polygon1);
                    String[] p1 = polygon1.split(";");
                    for (int i=0;i<p1.length;i++){


                        double v1 = Double.parseDouble(p1[i].split(",")[0]);

                        double v2 = Double.parseDouble(p1[i].split(",")[1]);
                        Pair p = new Pair(v1,v2);
                        line.add(p);
                    }
                    pairsOfLines.add(line);
                }
            }catch (NoSuchElementException n){

            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        /**
         * Creating polygon line equation
         */

        for (ArrayList pair:pairsOfPolies) {

                ArrayList<Pair> p = creatPoly(pair);
                pairsOfPoliesLine.add(p);

            }

        for (ArrayList pair:pairsOfPassages) {

            ArrayList<Pair> p = creatLine(pair);
            pairsOfPassagesLine.add(p);

        }
        /**
         * During the loop, every time giving the line slope and b via y=slope*x + b
         * And checking this line whether has an intersection with gate or wall
         * If line has an intersection with wall but not with gate, return 0
         * Else if line has an intersection with wall and  gate, return 0
         * Else if line has an intersection with gate and  gate, return 1
         */
        for (ArrayList pair:pairsOfLines) {

            ArrayList<Pair> p = creatLine(pair);

            pairsOfLinesLine.add(p);
            if (checkGate(p,pair) && checkWall(p,pair)){
                System.out.println(1);
            } else if (!checkGate(p,pair) && checkWall(p,pair)) {
                System.out.println(0);
            }else if (!checkGate(p,pair) && !checkWall(p,pair)) {
                System.out.println(1);
            }

        }
        }


    /**
     *
     * @param arr : an ArrayList contains the x,y pairs of polygon
     * @return : y = mx + b , returns an arraylist contains pairs of m,b
     */
    public static ArrayList<Pair> creatPoly(ArrayList<Pair> arr){
                ArrayList<Pair> poly = new ArrayList<>();
                for (int i=0;i<arr.size();i++){

                    double m=0.0;
                    double equation = 0.0;
                    if (i==arr.size()-1){
                        m = (arr.get(0).y - arr.get(i).y)/(arr.get(0).x - arr.get(i).x);
                        equation = -(m*arr.get(i).x)+arr.get(i).y;
                    }else{
                        m = (arr.get(i+1).y - arr.get(i).y)/(arr.get(i+1).x - arr.get(i).x);
                        equation = -(m*arr.get(i).x)+arr.get(i).y;
                    }
                    Pair p = new Pair(m,equation);
                    poly.add(p);
                }
                return poly;
        }
    /**
     *
     * @param arr : an ArrayList contains the x,y pairs of passages
     * @return : y = mx + b , returns an arraylist contains pairs of m,b of passage line m and b
     */
        public static ArrayList<Pair> creatLine(ArrayList<Pair> arr){
            ArrayList<Pair> poly = new ArrayList<>();
            double m=0.0;
            double equation = 0.0;
            m = (arr.get(1).y - arr.get(0).y)/(arr.get(1).x - arr.get(0).x);
            equation = -(m*arr.get(0).x)+arr.get(0).y;
            Pair p = new Pair(m,equation);
            poly.add(p);
            return poly;
        }

    /**
     *
     * @param p : pair o f m and b like y=mx + b; each line check with gate intersection
     * @return : true, if there is an intersection with any gate
     *           false, if there is no intersection
     */
    public static boolean checkGate(ArrayList<Pair> p,ArrayList<Pair> pair){ // herhangi bir gate ile ortak noktası var mı
        boolean isIntersected = false;
        for (ArrayList<Pair> gate:pairsOfPassagesLine) {
            for (Pair pairofGate:gate) {

                double x = (pairofGate.y - p.get(0).y)/(pairofGate.x - p.get(0).x);
                double y = pairofGate.x*x + pairofGate.y;
                if (pair.get(0).x > x && x>pair.get(1).x){
                    if (pair.get(0).y > y && y>pair.get(1).y){
                        isIntersected = true;
                    } else if (pair.get(1).y > y && y>pair.get(0).y) {
                        isIntersected = true;
                    }else{
                        isIntersected = false;
                    }

                } else if (pair.get(1).x > x && x>pair.get(0).x) {
                    if (pair.get(0).y > y && y>pair.get(1).y){
                        isIntersected = true;
                    } else if (pair.get(1).y > y && y>pair.get(0).y) {
                        isIntersected = true;
                    }else{
                        isIntersected = false;
                    }
                }else{
                    isIntersected = false;
                }
            }

        }
        return isIntersected;

    }

    /**
     *
     * @param p : pair o f m and b like y=mx + b; each line check with gate intersection
     * @return : true, if there is an intersection with any gate
     *           false, if there is no intersection
     */
    public static boolean checkWall(ArrayList<Pair> p,ArrayList<Pair> pair){ // herhangi bir gate ile ortak noktası var mı
        boolean isIntersected = false;
        for (ArrayList<Pair> gate:pairsOfPassagesLine) {
            for (Pair pairofGate:gate) {

                double x = (pairofGate.y - p.get(0).y)/(pairofGate.x - p.get(0).x);
                double y = pairofGate.x*x + pairofGate.y;
                if (pair.get(0).x > x && x>pair.get(1).x){
                    if (pair.get(0).y > y && y>pair.get(1).y){
                        isIntersected = true;
                    } else if (pair.get(1).y > y && y>pair.get(0).y) {
                        isIntersected = true;
                    }else{
                        isIntersected = false;
                    }

                } else if (pair.get(1).x > x && x>pair.get(0).x) {
                    if (pair.get(0).y > y && y>pair.get(1).y){
                        isIntersected = true;
                    } else if (pair.get(1).y > y && y>pair.get(0).y) {
                        isIntersected = true;
                    }else{
                        isIntersected = false;
                    }
                }else{
                    isIntersected = false;
                }
            }

        }
        return isIntersected;

    }
    }


