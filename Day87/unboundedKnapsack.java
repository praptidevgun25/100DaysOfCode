import java.util.*;
public class unboundKnapSack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[]vals = new int[n];
        System.out.println("Enter values of element: ");
        for(int i = 0; i < vals.length; i++) {
            vals[i] = sc.nextInt();
        }

        int[]wts = new int[n];
        System.out.println("Enter weights of element: ");
        for(int i = 0; i < wts.length; i++) {
            wts[i] = sc.nextInt(); 
        }

        System.out.print("Enter capacity of the sack: ");
        int cap = sc.nextInt();

        int res = maxVal(n, vals, wts, cap);
        System.out.println("Max value obtained = " + res);
    }

    public static int maxVal(int n, int[]vals, int[]wts, int cap) {

        // dp storage of size one more than capacity
        int[]dp = new int[cap+1];
        dp[0]  = 0; //if we add elem of wt=0 => value = 0

        // traversing through each bag capacity
        for(int bagc = 1; bagc <= cap; bagc++){
            int max = 0; //to store max value obtained for given bag
            for(int elem=0; elem<n; elem++){
                // for a elem to be added it's wt < bag cap
                if(wts[elem] <= bagc ){

                    int rbagc = bagc - wts[elem];// rem cap after adding elem
                    int rbagv = dp[rbagc]; //value just before adding the ne elem
                    int tbagv = rbagv+vals[elem]; // value after adding the elem

                    // finding the max tot value after trying all elem one by one
                    if(tbagv > max){
                        max = tbagv;
                    }
                }
            }
            dp[bagc] = max;
        }
        return dp[cap];
    }
}
