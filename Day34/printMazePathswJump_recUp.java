import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(1, 1, n, m, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        
        // base case
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }
        
        // horizontal move
        for(int ms = 1; ms <= dc - sc; ms++){
            printMazePaths(sr, sc + ms, dr, dc, psf + "h" + ms);
        }
        
        // vertical move
        for(int ms = 1; ms <= dr - sr; ms++){
            printMazePaths(sr + ms, sc, dr, dc, psf + "v" + ms);
        }
        
        // diagonal move
        for(int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++){
            printMazePaths(sr + ms, sc + ms, dr, dc, psf + "d" + ms);
        }
    }

}
