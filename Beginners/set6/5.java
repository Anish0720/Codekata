import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class mulop{
     public static void main(String aa[]){
     int n1,m;
     int sum=0;
     Scanner s=new Scanner(System.in);
     n1=s.nextInt();
     m=s.nextInt();
     sum=n1*m;
     if(sum%2==0){
         System.out.println("Even\n");
     }
     else{
         System.out.println("Odd\n");
     }
     
   }
}
