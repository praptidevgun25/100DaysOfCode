import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        //count of digits in n
        int temp=n;
        int count=0;
           while(temp!=0){
               count++;
               temp=temp/10;
           }

        int max=0;
        for(int i=count; i>=1; i--){

            int ans = (int)(n/Math.pow(10, i))*(power(10, i-1)) + (n%(power(10, i-1)));

            if(ans>max){
                max=ans;
            }

        }

        System.out.println(max);

    }

    public static int power(int x, int n){
        int ans=1;
        for(int i=1; i<=n; i++){
            ans=ans*x;
        }

        return ans;
    }


}
