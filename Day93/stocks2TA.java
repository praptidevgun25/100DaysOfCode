import java.util.*;
public class stocks2TA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[]prices = new int[n];

        System.out.println("Enter price for: ");
        for(int i = 0; i < prices.length; i++){
            System.out.print("Day "+ (i+1) + " : ");
            prices[i] = sc.nextInt();
        }

        int profit = findMax(prices);
        System.out.println("Max profit: " + profit);
    }

    public static int findMax(int[] prices) {

        // -----Left side of best date-----
        // solving for best buy date 
        // sell date is fixed
        int mpist = 0; //max profit if sold today
        int leastbp = prices[0]; //least buy price till date
        int[] dpLeft = new int[prices.length]; // stores maxprofit till date=> left of best date

        for(int i=1; i<prices.length; i++) {
            // finding least price
            if(prices[i] < leastbp) {
                leastbp = prices[i];
            }

            mpist = prices[i] - leastbp; // profit = today's sellPrice - least buyPrice till date

            // checks if today's profit is all time high
            if(mpist > dpLeft[i-1]){
                dpLeft[i] = mpist;
            }else{
                // if no continue with prev day's profit
                dpLeft[i] = dpLeft[i-1];
            }
        }

        // -----Right side of best date-----
        // solving for best sell date 
        // Buy date is fixed
        int mpibt = 0; //max profit if bought today
        int maxSp = prices[prices.length - 1]; // max sell price after today
        int[] dpRight = new int[prices.length]; //stores maxprofit when sold after today => right of best date

        for(int i=prices.length-2; i>=0; i--){
            // find max sell price
            if(prices[i] > maxSp){
                maxSp = prices[i];
            }

            mpibt = maxSp - prices[i]; // profit = max sellPrice after today - today's buyPrice

            // checks if today's profit is more than if sold afterwards
            if(mpibt > dpRight[i+1]){
                dpRight[i] = mpibt;
            }
            else{
                // if no continue with next day's profit
                dpRight[i] = dpRight[i+1];
            }
        }

        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(dpLeft[i] + dpRight[i] > profit) {
                profit = dpLeft[i] + dpRight[i];
            }
        }

        return profit;
    }
}
