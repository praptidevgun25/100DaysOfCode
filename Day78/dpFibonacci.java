import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    // calling fibonacci
    int fib = Fibonacci(n);
    System.out.println(fib);

    scn.close();
  }

  public static int Fibonacci(int n) {
      
    // base case
    // 0 -> 0 , 1 -> 1
    if (n == 0 || n == 1) {
      return n;
    }
    
    // we know fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)

    int fibn1 = Fibonacci(n - 1);
    int fibn2 = Fibonacci(n - 2);
    int fibn = fibn1 + fibn2;
    return fibn;
  }
}
