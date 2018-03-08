import java.util.*;
import java.lang.*;
public class flb{
     public static void main(String aa[]){
     int a=0,b=1;
     int c1;
     int n;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
      for(int i=0;i<n;i++){
          System.out.println(a);
          c1=a+b;
          a=b;
          b=c1;
      }
      System.out.println("\n");
      
   }
}
