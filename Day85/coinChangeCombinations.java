import java.io.*;

import java.util.*;

public class coinChangeCombination {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] coins = new int[n];

    for (int i = 0; i < n; i++) {
      coins[i] = Integer.parseInt(br.readLine());
    }

    int amt = Integer.parseInt(br.readLine());

    int[] dp = new int[amt + 1];
    dp[0] = 1;

    for (int coin : coins) {
      for (int i = 1; i < dp.length; i++) {
        if (i >= coin) {
          dp[i] += dp[i - coin];
        }
      }
    }
    System.out.println(dp[amt]);
  }
}
