import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        int d = scn.nextInt(); //data
        int fi = firstIndex(arr, 0, d); //first index
        System.out.println(fi);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        //base case
        if(idx == arr.length){
            return -1;
        }
        
        if(arr[idx] == x){
            return idx;
        } else {
            
            //first index in smaller array
            int fiisa = firstIndex(arr, idx + 1, x);
            return fiisa;
        }
    }

}
