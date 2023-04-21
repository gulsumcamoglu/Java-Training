package Minefield;
import java.util.*;
public class Minefield {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the row of matris: ");
        int row = s.nextInt();
        System.out.print("Enter the column of matris: ");
        int column = s.nextInt();
        String[][] matris = new String[row][column];

        int mine1row = (int)(Math.random()*row);
        int mine1col = (int)(Math.random()*column);
        int mine2row = (int)(Math.random()*row);
        int mine2col = (int)(Math.random()*column);
        for (int i=0;i<matris.length;i++){
            for (int j=0;j<matris[i].length;j++){
                if (i==mine1row && j==mine1col){
                    matris[i][j]="*";
                }else if (i==mine2row && j==mine2col){
                    matris[i][j]="*";
                }else{
                    matris[i][j]="-";
                }
            }
        }
        for (int i=0;i<matris.length;i++){
            for (int j=0;j<matris[i].length;j++){
                System.out.print(matris[i][j]);
            }
            System.out.println();
        }

    }
}
