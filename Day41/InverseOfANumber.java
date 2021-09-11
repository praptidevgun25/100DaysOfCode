import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int placeValue = 1;
    int inv = 0;
    
    while(n > 0){
        int quotient = n / 10;
        int remainder = n % 10;
        n = quotient;
        inv = inv + placeValue * (int)Math.pow(10, remainder - 1);
        placeValue++;
    }
    System.out.print(inv);
  }
}
