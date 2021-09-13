Print the following pattern -
  
1	  2	3	4	 5	
11	*	*	*	 15	
21	*	*	*	 25	
16	*	*	*	 20	
6	  7	8	9	 10	
  
note- there is a tab after each element 

import java.util.*;
public class Pattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = 0;
        int startingValue = 0;

        for(int i=1; i<=num; i++) {
            
            // if num is odd 
            if(num%2 != 0) {
                startingValue = num*k + 1; 
                
                // deconstructing starting value in case of odd input
                if(i <= num/2){
                    k += 2;
                }
                else if(i == num/2 + 1) {
                    k--;
                }
                else{
                    k -= 2;
                }
            }

            // deconstructing starting value in case of even input
            if(num%2 == 0) {
                startingValue = num*k + 1;
                

                if(i < num/2){
                    k += 2;
                }
                else if(i == num/2) {
                    k += 1;
                }
                else{
                    k -= 2;
                }
            }
        
        
            for(int j=1; j<=num; j++){
                
                // printing first row as it is
                if(i==1 || i==num){
                    System.out.print(startingValue +"\t");
                }
                else{
                    
                    // printing first and last column
                    if(j==1 || j==num) {
                        System.out.print(startingValue +"\t"); 
                    }
                    else{
                      
                      // otherwise printing *
                        System.out.print("*\t");
                    }
                }
              
                startingValue++; 
            }
            
            // new line
            System.out.println();
        }
    }
}
