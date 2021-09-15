To print the following pattern -
  
*   *   *       *
        *       *
*   *   *   *   *   
        *
*   *   *   *   *        
  
Code -
  
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i == 1) {
        for (int j = 1; j <= n; j++) {
          if (j <= n / 2 + 1 || j == n) {
            System.out.print("*\t");
          } else {
            System.out.print("\t");
          }
        }

      } else if (i <= n / 2) {
        for (int j = 1; j <= n; j++) {
          if (j == n / 2 + 1 || j == n) {
            System.out.print("*\t");
          } else {
            System.out.print("\t");
          }
        }
      }

      else if (i == n / 2 + 1) {
        for (int j = 1; j <= n; j++) {
          System.out.print("*\t");
        }



    } else if (i < n) {
      for (int j = 1; j <= n; j++) {
        if (j == 1 || j == n / 2 + 1) {
          System.out.print("*\t");
        } else {
          System.out.print("\t");

        }
      }

    } else {
      for (int j = 1; j <= n; j++) {
        if (j == 1 || j >= n / 2 + 1) {
          System.out.print("*\t");
        } else {
          System.out.print("\t");
        }
      }

    }

    System.out.println();
  }

}
}
