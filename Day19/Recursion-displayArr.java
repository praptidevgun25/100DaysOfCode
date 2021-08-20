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
        
        displayArr(arr, 0);
    }

    public static void displayArr(int[] arr, int idx){
        
        //base case
        if(idx == arr.length){
                return;
        }
            
            System.out.println(arr[idx]);
            displayArr(arr, idx + 1);
    }
    
}
