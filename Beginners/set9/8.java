import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class gcd2{
     public static void main(String aa[]){
        int aaa,b;
        int c=0;
        Scanner s=new Scanner(System.in);
        aaa=s.nextInt();
        b=s.nextInt();
        
        
        for(int i=1;i<=aaa&&i<=b;i++){
            if(aaa%i==0&&b%i==0){
               c=i;
            }
        }
      int lcm=(aaa*b)/c;
      System.out.println(lcm+"\n");      
    }
}
