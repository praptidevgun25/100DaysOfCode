import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int r1 = scn.nextInt();
    int c1 = scn.nextInt();
    int[][] one = new int[r1][c1];
    
    for(int i = 0; i < one.length; i++){
        for(int j = 0; j < one[0].length; j++){
            one[i][j] = scn.nextInt();
        }
    }
    
    int r2 = scn.nextInt();
    int c2 = scn.nextInt();
    int[][] two = new int[r2][c2];
    
    for(int i = 0; i < two.length; i++){
        for(int j = 0; j < two[0].length; j++){
            two[i][j] = scn.nextInt();
        }
    }
    
    if(c1 != r2){
        System.out.print("Invalid input");
        return;
    }
    
    int[][] prd = new int[r1][c2];
    for(int i = 0; i < prd.length; i++){
        for(int j = 0; j < prd[0].length; j++){
            for(int k = 0; k < c1; k++){
                prd[i][j] += one[i][k] * two[k][j];
            }
        }
    }

    for(int i = 0; i < prd.length; i++){
        for(int j = 0; j < prd[0].length; j++){
            System.out.print(prd[i][j] + " ");
        }
        System.out.println();
    }
 }
}
