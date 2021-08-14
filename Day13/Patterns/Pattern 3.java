import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i;
    int j;
    for(i = 1; i <= n; i++){
        for(j = 1; j <= n; j++){
            if(j == 1 || j == n){
                System.out.print("*	");
            } else if(i > n / 2 && (i==j || i+j == n+1)){
                System.out.print("*	");
            } else {
                System.out.print("	");
            }
        }
    System.out.println();
    }

 }
}
