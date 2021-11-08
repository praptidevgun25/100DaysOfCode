import java.util.*;
public class tiling2x1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of floor: ");
        int n = sc.nextInt();

        // tiles are of size: l=1 & w=2 
        // floor is of size: l=n & w=2

        // each tile can be placed either vertically or horizontally
        // if tile is placed
        // vertically => covers 2 row & 1 col => new floor l=n-1
        // horizontally => covers 2 col & 1 row => new floor l = n-2 
        // while we place a tile horizontally there is space for 1 tile either up or down 
        // but we don't have any choice to fill it => only 1 way to fill thus tot ways = ways to fill n-2
        int[] dp = new int[n+1];

        // base cases
        dp[1] = 1; //place tile vertically
        dp[2] = 2; // place both tile vertically or horizontally

        for(int i=3; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println("Ways to tile up floor of dimension 2x" +n+" are: " +dp[n]);
    }
}
