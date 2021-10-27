import java.io.*;

import java.util.*;

public class zeroOneKnapSack {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] price = new int[n];
    String str1 = br.readLine();
    for (int i = 0; i < n; i++) {
      price[i] = Integer.parseInt(str1.split(" ")[i]);
    }

    int[] weight = new int[n];
    String str2 = br.readLine();
    for (int i = 0; i < n; i++) {
      weight[i] = Integer.parseInt(str2.split(" ")[i]);
    }

    int cap = Integer.parseInt(br.readLine());

    int[][] dp = new int[n + 1][cap + 1]; // 2D storage
    
    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        int val = price[i - 1];
        int wt = weight[i - 1];

        if (j >= wt) { // if the current capacity > weight of the current item
          dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wt] + val); // max cost -> max cost before putting the item and after putting it
        } else {
          dp[i][j] = dp[i - 1][j]; // if current capacity < than weight, we do not add item in the bag
        }
      }
    }

    System.out.println(dp[n][cap]);
  }
}
