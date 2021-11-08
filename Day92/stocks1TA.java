import java.util.*;
public class stocks1TA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[]prices = new int[n];

        System.out.println("Enter the prices for:");
        for(int i = 0; i < n; i++) {
            System.out.print("Day "+i+" : ");
            prices[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int totProfit = 0;
        int todayProfit = 0;

        for(int i = 0; i < n; i++) {
            // finding a lower price
            if(prices[i] < min) {
                min = prices[i];
            }

            todayProfit = prices[i] - min;

            // if today profit is max
            if(todayProfit > totProfit) {
                totProfit = todayProfit;
            }
        }

        System.out.println("Max profit achievable = "+ totProfit);

    }
}
