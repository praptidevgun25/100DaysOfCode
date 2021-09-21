// You are given a number n, representing the size of array a.
// You are given n numbers, representing elements of array a.
// You are required to print a bar chart representing value of arr a.

// Input Format -
// A number n
// n1
// n2
// .. n number of elements

// Output Format -
// A bar chart of asteriks representing value of array a

// Constraints
// 1 <= n <= 30
// 0 <= n1, n2, .. n elements <= 10

// Sample Input
// 5
// 3
// 1
// 0
// 7
// 5

// Sample Output
// 			*		
// 			*		
// 			*	*	
// 			*	*	
// *			*	*	
// *			*	*	
// *	*		*	*	


// Code - 
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int[] arr = new int[n];
    
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }
    
    // checking for maximun element in array 
    int max = arr[0];
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    
    // loop for traversing from floor one to max floor
    for(int ht = 1; ht <= max; ht++){
        
        // loop for traversing the array 
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] >= ht){ 
              
                System.out.print("*	"); ){ // if element in the array is greater than floor value, we print a star
                  
            } else {
                  
                System.out.print("	"); // if element in the array is greater than floor value, we print space
                  
            }
        }
        
        // new line 
        System.out.println();
    }
 }

}
