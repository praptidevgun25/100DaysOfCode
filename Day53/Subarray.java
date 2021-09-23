import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    /* 
        subsets of 10 20 30 will be
        10
        10 20
        10 20  30
        20
        20 30
        30 
        
    */
    
    Scanner scn = new Scanner(System.in);
    int sizeOfArray = scn.nextInt();
    int[] arr = new int[sizeOfArray];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }

    for (int startIndex = 0; startIndex < arr.length; startIndex++) {
      for (int endIndex = startIndex; endIndex < arr.length; endIndex++) {
        for (int i = startIndex; i <= endIndex; i++) {
          System.out.print(arr[i] + "\t");
        }

        System.out.println();
      }
    }
  }

}
