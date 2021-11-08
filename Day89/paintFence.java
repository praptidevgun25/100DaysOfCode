import java.util.*;
public class paintFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of fences: ");
        int f = sc.nextInt();

        System.out.print("Enter number of colours: ");
        int c = sc.nextInt();

        // not possible when num of fences = 1
        // this is the base case and is considerd for num of fence =  2
        // num of ways to paint fences
        // 1. such that last 2 are same
        long same = c *1; //if we paint 2nd last with say col red ; num of options to paint last = 1
        // 2. such that last 2 are diff
        long diff = c * (c-1); //if we paint 2nd last with say col red ; num of options to paint last = (c-1)

        long tot = same + diff;

        for(int i=3; i<=f; i++){
            //we take all combination of diff from last fence and simply repeat the color done on last fence => option= 1
            same = diff * 1; 
            //we take all combination of total from last fence and simply repeat any color except that done on last fence => option= (c-1)
            diff = tot * (c-1);

            tot = same+diff;
        }

        System.out.println("Number of ways to colour fences = " + tot);

    }
}
