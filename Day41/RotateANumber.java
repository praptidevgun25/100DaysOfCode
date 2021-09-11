import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     int num = sc.nextInt();
     int rot = sc.nextInt();
     int temp =num;
     int nod=0;
     
     while(temp > 0)
     {
         temp = temp/10;
         nod++;
     }
     
     rot = rot%nod;
     
     if (rot<0)
     {
         rot= rot + nod;
     }
     
     
     int div =1;
     int mul =1;
     
     
     for (int i=1; i<=nod ; i++)
     {
         if(i <= rot)
         {
             div = div*10;
         }
         else
         {
             mul = mul*10;
         }
     }
     int q = num/div;
     int r = num%div;
     
     int ans = (r*mul) + q;
     System.out.println(ans);
    }
   }
