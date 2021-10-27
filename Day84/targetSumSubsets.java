import java.io.*;

import java.util.*;

public class targetSumSubsets {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    int tar = Integer.parseInt(br.readLine());

    boolean[][] dp = new boolean[arr.length + 1][tar + 1];
    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j < dp[0].length; j++) {
        if (i == 0 && j == 0) {
          dp[i][j] = true;
        } else if (i == 0) {
          dp[i][j] = false;
        } else if (j == 0) {
          dp[i][j] = true;
        } else {
          if (dp[i - 1][j] == true) {
            dp[i][j] = true;
          } else {
            int val = arr[i - 1];
            if (j >= val
                && dp[i - 1][j - val] == true) {
              dp[i][j] = true;
            }
          }
        }
      }
    }

    System.out.println(dp[dp.length - 1][tar]);
  }
}
