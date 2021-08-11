import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
      int b2 = scn.nextInt();
      
      int d = getValue(n, b1, b2);
      System.out.println(d);
  }
      
      
      
  public static int getValue(int n, int b1, int b2){
      int dec = getValueInBase(n, b1);
      int dn = getValueIndecimal(dec, b2);
      return dn;
}

              
  public static int getValueInBase(int n, int b){
      int rv = 0;
      int p = 1;
      while(n>0){
        int dig = n % 10;
        n = n / 10;
        rv += dig * p;
        p = p * b;
      }
      
      return rv;
  }
      
      
  public static int getValueIndecimal(int n, int b){
        int rv = 0;
        int p = 1;
        while(n>0){
           int dig = n % b;
           n = n/b;
           rv += dig * p;
           p = p * 10;
            
       }
       
       return rv;    
       
  }
  }
