import java.util.*;
import java.lang.*;
public class fibon{
     public static void main(String aa[]){
     int a=0,b=1;
     int c;
     int nn;
     Scanner s=new Scanner(System.in);
     nn=s.nextInt();

      for(int i=0;i<nn;i++){
          System.out.println(a);
          c=a+b;
          a=b;
          
          b=c;
      }
      
      System.ot.println("\n");
     }
}
