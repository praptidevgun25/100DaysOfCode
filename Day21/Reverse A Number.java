import java.util.Scanner; 
public class Main {
public static void main(String[] args) { 
    int n, digit;
    Scanner sc = new Scanner(System.in); 
    n = sc.nextInt(); 
    while(n!=0) {
        digit = n%10; 
        n = n/10; 
        System.out.println(digit);
    }
     
}
}
