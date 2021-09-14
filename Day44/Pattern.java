To print the following pattern -
  
A
BB
C*C
D**D
E***E
F****F

Note - There are no spaces or tabs between every character

Code - 
  
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    char x = 64;
    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= i; j++) {

        if (j == 1 || i == j) {
          System.out.print((char)(x + i));
        } else {
          System.out.print("*");
        }
      }

      System.out.println();
    }

  }
}
