import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[]  arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        displayArrReverse(arr, 0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        
        //base case
        if(idx == arr.length){
            return;
        }
        displayArrReverse(arr, idx + 1);
        System.out.println(arr[idx]);
    }

}
