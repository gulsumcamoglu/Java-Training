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
        int[][] values = new int[row][column];

        for (int i=0;i<matris.length;i++){
            Arrays.fill(matris[i]," - ");
        }
        for (int i=0;i<(row*column)/4;i++){
            int mine1row = (int)(Math.random()*row);
            int mine1col = (int)(Math.random()*column);
            matris[mine1row][mine1col]=" * ";
        }

        System.out.println("Location of Mines");
        for (int i=0;i<matris.length;i++){
            for (int j=0;j<matris[i].length;j++){
                System.out.print(matris[i][j]);
            }
            System.out.println();
        }
        boolean isWin=false;

        System.out.println("Welcome to Mine Field Game!!!!");
        for (int i=0;i<matris.length;i++){
            for (int j=0;j<matris[i].length;j++){
                System.out.print(" - ");
                if (matris[i][j] != " * "){
                    if (i-1 >=0 && j-1 >=0 && j+1 <= matris[i].length-1 && i+1 <=matris.length-1){
                        if (matris[i][j-1]==" * "){

                            values[i][j]=values[i][j]+1;
                        } if (matris[i+1][j-1]==" * ") {
                            values[i][j]=values[i][j]+1;
                        }if (matris[i+1][j]==" * ") {
                            values[i][j]=values[i][j]+1;
                        }if (matris[i+1][j+1]==" * ") {
                            values[i][j]=values[i][j]+1;
                        }if (matris[i][j+1]==" * ") {
                            values[i][j]=values[i][j]+1;
                        }if (matris[i-1][j-1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if (matris[i-1][j]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if (matris[i-1][j+1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }

                    } else if (i==0) {
                        if (j-1>=0 && j+1<=matris[i].length-1){
                            if (matris[0][j-1]==" * "){
                                values[i][j]=values[i][j]+1;
                            }
                            if (matris[1][j-1]==" * "){
                                values[i][j]=values[i][j]+1;
                            }if (matris[0][j+1]==" * "){
                                values[i][j]=values[i][j]+1;
                            }if (matris[1][j+1]==" * "){
                                values[i][j]=values[i][j]+1;
                            }if (matris[1][j]==" * "){
                                values[i][j]=values[i][j]+1;
                            }

                        } else if (j+1<= matris[i].length-1) {
                            if (matris[0][j+1]==" * "){
                                values[i][j]=values[i][j]+1;
                            }if (matris[1][j+1]==" * "){
                                values[i][j]=values[i][j]+1;
                            }if (matris[1][j]==" * "){
                                values[i][j]=values[i][j]+1;
                            }
                        }else if(j==matris[i].length-1){
                            if(matris[0][j-1]==" * "){
                                values[i][j]=values[i][j]+1;
                            }if(matris[1][j-1]==" * "){
                                values[i][j]=values[i][j]+1;
                            }if(matris[1][j]==" * "){
                                values[i][j]=values[i][j]+1;
                            }
                        }
                    } else if (i !=0 && j==0 && i != matris.length-1) {
                        if(matris[i-1][j]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i-1][j+1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i][j+1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i+1][j+1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i+1][j]==" * "){
                            values[i][j]=values[i][j]+1;
                        }

                    } else if (i==matris.length-1 && j == 0) {
                        if(matris[i-1][j]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i-1][j+1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i][j+1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }
                    } else if (i!=0 && i!=matris.length-1 && j==matris[i].length-1) {
                        if(matris[i-1][j]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i-1][j-1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i][j-1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i+1][j-1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i+1][j]==" * "){
                            values[i][j]=values[i][j]+1;
                        }
                    } else if (i==matris.length-1 && j==matris[i].length-1) {
                        if(matris[i-1][j]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i-1][j-1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i][j-1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }
                    } else if (j !=0 && j!=matris[0].length-1 && i==matris.length-1) {
                        if(matris[i][j-1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i-1][j-1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i-1][j]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i-1][j+1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }if(matris[i][j+1]==" * "){
                            values[i][j]=values[i][j]+1;
                        }
                    }
                }else{
                    continue;
                }


            }
            System.out.println();
        }

        while (!isWin){
            System.out.print("Enter row: ");
            int r=s.nextInt();
            System.out.print("Enter column: ");
            int c = s.nextInt();
            if (matris[r][c]==" * "){
                isWin = true;
                System.out.println("Game Over");
            } else if (matris[r][c]==" - ") {
                isWin =false;
                matris[r][c]=" "+values[r][c]+" ";
                for (int i=0;i<matris.length;i++){
                    for (int j=0;j<matris[i].length;j++){
                        if (matris[i][j]==" * "){
                            System.out.print(" - ");
                        }else {
                            System.out.print(matris[i][j]);
                        }
                    }
                    System.out.println();
                }
            }

        }


    }
}
