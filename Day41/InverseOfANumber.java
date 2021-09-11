import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int number = scn.nextInt(); 
    int placeValue = 1; 
    int inverse = 0;
    
    // inverse of 426135 -> 416253
    // remainder at place value becomes placeValue at remainder -> placeValue * pow(10, r-1)

    while (number > 0) {
        
      int quotient = number / 10; 
      int remainder = number % 10;
      number = quotient;
      inverse = inverse + placeValue * (int)Math.pow(10, remainder - 1);
      placeValue++;
      
    }
    
    System.out.print(inverse);
    
  }
}
