import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int number = scn.nextInt();
     int numberOfRotations = scn.nextInt();
     
     
     // finding number of digits
     int temp = number;
     int numberOfDigits = 0;
     while(temp != 0){
         temp = temp / 10;
         numberOfDigits ++;
         
     }
     
     // handling special cases
     
     // 1. if numberOfRotations = numberOfDigits then answer is same
     numberOfRotations = numberOfRotations % numberOfDigits;
     
     // 2. handling negative rotations
     if(numberOfRotations < 0){
         numberOfRotations = numberOfRotations + numberOfDigits;
     }
     
     // finding divisor and mulltiplier
     int divisor = 1;
     int multiplier = 1;
     for(int i = 1; i <= numberOfDigits; i++){
         if(i <= numberOfRotations){
             divisor *= 10;
         } else {
             multiplier *= 10;
         }
     }
     
     int quotient = number / divisor;
     int remainder = number % divisor;
     int answer = remainder * multiplier + quotient;
     System.out.println(answer);
     
     
    }
   }
