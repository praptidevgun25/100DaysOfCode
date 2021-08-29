import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // row 
        int m = scn.nextInt(); //column
        
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }
    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    // hpaths - horizontal paths
    // vpaths - vertical paths
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr == dr && sc == dc) { // base case -> at destination their is still one way that is not to move
            ArrayList<String> baseresult = new ArrayList<>();
            baseresult.add("");
            return baseresult;
        }
        
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        
        if(sc < dc) { // for horizontal call it is necessary we are not in last column
            hpaths = getMazePaths(sr, sc + 1, dr, dc); // horizontal move since column is increasing
        }
        
        if(sr < dr) { // for vertical call it is necessary we are not in last row
            vpaths = getMazePaths(sr + 1, sc, dr, dc); // vertical move since row is increasing
        }
        
        ArrayList<String> paths = new ArrayList<>(); // my result
        
        for(String hpath: hpaths){ // loop on horizontal paths and adding h in front of horizontal path to reach the destination 
            paths.add("h" + hpath);
        }
        
        for(String vpath: vpaths){ // loop on vertical paths and adding v in front of vertical path to reach the destination 
            paths.add("v" + vpath);
        }
        
        return paths;
    }

}
