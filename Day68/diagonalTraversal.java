// State Of Wakanda - 2

import java.io.*;

import java.util.*;

public class diagonalTraversal {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
	
    // each gap is a diagonal 
    for (int gap = 0; gap < n; gap++) { 
      
      // for every diagonal i starts with 0 and j starts with gap, j controls when diagonal stops
      for (int i = 0, j = gap; j < n; i++, j++) { 
        System.out.println(arr[i][j]);
      }
    }
  }

}
