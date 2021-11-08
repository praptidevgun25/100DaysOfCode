import java.util.*;
public class stocksKTA{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        
        int[]prices = new int[n];

        System.out.println("Enter prices for: ");
        for(int i = 0; i < prices.length; i++){
            System.out.print("Day "+(i+1)+" : ");
            prices[i] = sc.nextInt();
        }

        System.out.print("Enter number of transactions allowed: ");
        int k = sc.nextInt();

        int profit = findMax(prices, k);
        System.out.println("Max profit with "+ k+" transactions : "+ profit);
        
    }
    public static int findMax(int[] prices, int k) {
        
        int n = prices.length;
        // to store profit of all days
        // rows = transaction & columns = Days
        int[][] dp = new int[k+1][n];

        
        // --------------------This is of n^3 as 3 for loops are there -----------------------
        
        // we start from 1,1 as 0th day and 0 transaction = 0 profit
        // for(int transc = 1; transc <= k; transc++) {
        //     for(int day = 1; day <n; day++) {

        //         // let profit made using t transactions one day before be the max
        //         int max = dp[transc][day-1];

        //         for(int prev =0; prev<day; prev++){
        //             int pTranscm1 = dp[transc-1][prev]; //profits from transc-1 of all prev days
        //             int pTransc = prices[day] - prices[prev]; //today's profit after last transc

        //             // if sum of t-1 transc of prev days + today's last transc is more
        //             if(pTranscm1 + pTransc > max){
        //                 max = pTranscm1 + pTransc;
        //             }
        //         }

        //         dp[transc][day] = max;
        //     }
        // }
        // ------------------------------------------------------------------------------------------

        // we start from 1,1 as 0th day and 0 transaction = 0 profit
        for(int transc = 1; transc <= k; transc++) {
            int max = Integer.MIN_VALUE;

            for(int day = 1; day <n; day++) {

                // we check if the profit stored for 1 transc less of prev day - price of that day
                if(dp[transc-1][day-1] - prices[day-1] > max) {
                    max = dp[transc-1][day-1] - prices[day-1];
                }

                // if the obtained max + todays price > make that the profit else use prev day's
                if(max+prices[day] > dp[transc][day-1]) {
                    dp[transc][day] = max + prices[day];
                }
                else{
                    dp[transc][day] = max + prices[day-1];
                }
            }
        }

        return dp[k][n-1];
    }
}
