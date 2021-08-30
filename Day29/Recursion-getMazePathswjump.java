import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        // base case 
        if(sr == dr && sc == dc){
            ArrayList<String> baseresult = new ArrayList<>();
            baseresult.add("");
            return baseresult;
        }
        ArrayList<String> paths = new ArrayList<>(); // my path
        
        // ms -> horizontal move size
        for(int ms = 1; ms <= dc - sc; ms++){
            ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc); // all horizontal paths 
            for(String hpath: hpaths){
                paths.add("h" + ms + hpath); // adding h and jump in front of every path
            }
        }
        
        // ms -> vertical move size
        for(int ms = 1; ms <= dr - sr; ms++){
            ArrayList<String> vpaths = getMazePaths(sr + ms, sc, dr, dc); // all vertical paths
            for(String vpath: vpaths){
                paths.add("v" + ms + vpath); // adding v and jump in front of every path
            }
        }
        
        // ms -> diagonal move size
        for(int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++){
            ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc); // all diagonal paths
            for(String dpath: dpaths){
                paths.add("d" + ms + dpath); // adding d and jump in front of every path
            }
        }
        
        return paths;
    }

}
