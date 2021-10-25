import java.io.*;

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    Integer[] dp = new Integer[n + 1]; // null represents there is no way in Integer array
    dp[n] = 0; 
    
    // dp[i] -> i to n min moves

    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] == 0)
        continue; // can't go anywhere from that spot
      int min = Integer.MAX_VALUE;

      for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
        if (dp[i + j] != null) { // take min when spot is not null
          min = Math.min(min, dp[i + j]);
        }
      }

      // we know in case all spots are null, min will not update

      if (min != Integer.MAX_VALUE)
        dp[i] = min + 1;
    }
    System.out.println(dp[0]);
  }
}
