import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    for(int div = 2; div * div <= n; div++) {
        while(n % div == 0){
            n = n / div;
            System.out.print(div + " ");
        }
    }
    
    if(n != 1){
        System.out.print(n);
        
    }
 }
}
