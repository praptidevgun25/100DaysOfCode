import java.util.*;

public class paintHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of houses: ");
        int n = sc.nextInt();

        //2D array with row = house & col = red/green/blue 
        int[][]costs = new int[n][3];

        System.out.println("Enter cost of colours: ");
        for(int i = 0; i < costs.length; i++) {
            System.out.println("Enter costs for colouring house "+ i + " with colour : ");
            for(int j = 0; j < costs[0].length; j++) {
                if(j==0){
                    System.out.print("Red: ");
                }
                else if(j==1){
                    System.out.print("Green: ");
                }
                if(j==2){
                    System.out.print("Blue: ");
                }
                costs[i][j] = sc.nextInt();
            }
        }

        long res = findMin(costs);
        System.out.println("Min cost of painting "+ n + " houses with no 2 adjacent houses having same colour = "+ res);
    }

    public static long findMin(int[][]costs){
        int n = costs.length;
        
        // storage to store min cost  for 
        // house i when painted by the given color
        long[][] dp = new long[n][3];

        dp[0][0] = costs[0][0]; // cost of painting 1st house red 
        dp[0][1] = costs[0][1]; // cost of painting 2nd house green 
        dp[0][2] = costs[0][2]; // cost of painting 3rd house blue 

        // traversing through house 2 to last and finding colour that incurs min cost
        for(int i=1; i<costs.length; i++) {
            // for red
            dp[i][0] = costs[i][0] + (Math.min(dp[i-1][1], dp[i-1][2]));

            // for green
            dp[i][1] = costs[i][1] + (Math.min(dp[i-1][0], dp[i-1][2]));

            // for blue
            dp[i][2] = costs[i][2] + (Math.min(dp[i-1][1], dp[i-1][0]));
        }

        long ans =  Math.min( dp[n-1][0] , Math.min(dp[n-1][1],dp[n-1][2]));
        return ans;
    }
}
