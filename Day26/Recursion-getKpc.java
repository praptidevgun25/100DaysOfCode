import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }
    
    //global array
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getKPC(String str) {
        
        // base case -> if no key is pressed then too one word is generated which is blank
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        // 678
        char ch = str.charAt(0); // 6 
        String ros = str.substring(1); // 78
        
        ArrayList<String> rres = getKPC(ros); // 6 words of 78
        ArrayList<String> mres = new ArrayList<>(); // my result list ->  we have to make 24 words for 678
        
        String codeforch = codes[ch - '0']; 
        
        for(int i = 0; i < codeforch.length(); i++){
            
            char chcode = codeforch.charAt(i); 
            //each character in recursion result combine and add to my result 
            for(String rstr: rres){
                mres.add(chcode + rstr);
            }
        }
        return mres;
    }

}


