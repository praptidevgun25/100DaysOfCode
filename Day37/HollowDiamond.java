import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int os = n / 2;
    int is = -1;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= os; j++){
            System.out.print("	");
        }
        System.out.print("*	");
        for(int j = 1; j <= is; j++){
            System.out.print("	");
        }
        if(i > 1 && i < n){
            System.out.print("*	");
        }
        if( i <= n/2){
            os--;
            is+=2;
        } else {
            os++;
            is-=2;
        }
    System.out.println();
    }

 }
}
