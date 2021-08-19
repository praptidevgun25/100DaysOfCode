import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1d = scn.nextInt();
        int t2d = scn.nextInt();
        int t3d = scn.nextInt();
        toh(n, t1d, t2d, t3d);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        
        //base case
        if(n == 0){
            
            return;
            
        }
        
        toh(n - 1, t1id, t3id, t2id); //will print the instructions to move n - 1 disks from t1 to t3 using t2 ( * )
        
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
        
        toh(n - 1, t3id, t2id, t1id); //will print the instructions to move n - 1 disks from t3 to t2 using t1 ( * )
    } 

}
