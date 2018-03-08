import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class gcd1{
     public static void main(String aa[]){
        int a1,b;
        int c=0;
        Scanner s=new Scanner(System.in);
        a1=s.nextInt();
        b=s.nextInt();
        for(int i=1;i<=a1&&i<=b;i++){
            if(a1%i==0&&b%i==0){
               c=i;
            }
            
            
        }
        System.out.println(c+"\n");
    }
}
