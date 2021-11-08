import java.util.*;
public class stocksInfTAFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[]prices = new int[n];

        System.out.println("Enter prices for:");
        for(int i = 0; i < prices.length; i++) {
            System.out.print("Day "+i+" : ");
            prices[i] = sc.nextInt();
        }

        System.out.print("Enter fees: ");
        int fees = sc.nextInt();

        int profit = findMax(prices, fees);
        System.out.println("Max profit: " + profit);
    }
    public static int findMax(int[] prices, int fees) {

        int obsp = -prices[0]; //old buy state profit =>we bought the 1st stock
        int ossp = 0; //old sell state profit
        for(int i=1; i<prices.length; i++) {
            
            int nbsp = 0; //new buy state profit
            int nssp = 0; //new sell state profit
            // finding nbsp
            // if buying a new stock after selling last stock gives bigger amount than keeping previously bought stock
            if(ossp - prices[i] > obsp){
                nbsp = ossp - prices[i];
            }
            else{
                nbsp = obsp;
            }
            // finding nssp
            // if sellig the bought stock after reducing fees is more than prev. sold stock
            if(obsp + prices[i] - fees > ossp){
                nssp = obsp + prices[i] - fees;
            }
            else{
                nssp = ossp;
            }
            // updating old buy and sell
            obsp = nbsp;
            ossp = nssp;
        }
        return ossp;
    }
}
