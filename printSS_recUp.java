import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printSS(str, "");
    }

    public static void printSS(String str, String ans) {
        
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0); // first chatacter 
        String restOfQuestion = str.substring(1); // rest of the characters 
        
        
        printSS(restOfQuestion, ans + ch); // ch -> yes choice
        
        printSS(restOfQuestion, ans + ""); // ch -> no choice
        
    } 

}
