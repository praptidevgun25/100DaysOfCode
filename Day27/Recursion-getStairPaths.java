import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n == 0) {  // 0 implies positive base case
            ArrayList<String> bres = new ArrayList<>();
            // 0 -> 0 implies don't walk, you are already there
            bres.add("");
            return bres;
        } else if(n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            // negative implies you are not going to reach anyway hence not adding any path in array list
            return bres;
            
        }
        
        // faith -> this line will give paths from level 0 to n - 1
        ArrayList<String> paths1 = getStairPaths(n - 1);
        
        // faith -> this line will give paths from level 0 to n - 2
        ArrayList<String> paths2 = getStairPaths(n - 2);
        
        // faith -> this line will give paths from level 0 to n - 3
        ArrayList<String> paths3 = getStairPaths(n - 3);
        
        // we need paths from 0 from n 
        ArrayList<String> paths = new ArrayList<>();
        
        // if we put 1 in front of n - 1 to 0 paths -> becomes n to 0 paths 
        // as to reach n - 1 from n there can only be jump of 1
        for(String path: paths1){
            paths.add(1 + path);
        }
        
        // if we put 2 in front of n - 2 to 0 paths -> becomes n to 0 paths 
        // as to reach n - 2 from n there can be 2 ways, jump of 2 or twice of jump pf 2
        for(String path: paths2){
            paths.add(2 + path);
        }
        
        // if we put 3 in front of n - 3 to 0 paths -> becomes n to 0 paths 
        // as to reach n - 3 from n there can be 3 ways, jump of 3, thrice of jump of 1 or jump of 2 + jump of 1
        for(String path: paths3){
            paths.add(3 + path);
        }
        
        return paths;
        
    }
}
