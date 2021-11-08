import java.util.*;
public class tilingMx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of floor: ");
        int n = sc.nextInt();

        System.out.print("Enter breadth of floor: ");
        int m = sc.nextInt();

        // tiles are of size: l=1 & w=m 
        // floor is of size: l=n & w=m

        // each tile can be placed either vertically or horizontally
        // if tile is placed
        // vertically => covers m row & 1 col => new floor l=n-1
        // horizontally => covers m cols & 1 row => new floor l = n-m
        
        int[] dp = new int[n+1];

        for(int i=1; i<=n; i++) {
            if(i < m){
                dp[i] = 1;
            }
            else if(i == m) {
                dp[i] = 2;
            }
            else{
                dp[i] = dp[i-1] + dp[i-m];
            }
        }

        System.out.println("Ways to tile up floor of dimension "+m+"x"+n+" are: " +dp[n]);
    }
}
