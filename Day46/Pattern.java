To prin the following pattern -
1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1
  
CODE - 
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int nsp = 2 * n - 3;

    int nst = 1;

    for (int i = 1; i <= n; i++) {
      int val = 1;
      for (int j = 1; j <= nst; j++) {
        System.out.print(val + "\t");
        val++;
      }

      for (int j = 1; j <= nsp; j++) {
        System.out.print("\t");
      }


      if (i == n) {
        nst--;
        val--;
      }

      for (int j = 1; j <= nst; j++) {
        val--;
        System.out.print(val + "\t");
      }

      nst++;
      nsp -= 2;

      System.out.println();

    }


  }
}
