import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class sqrt1{
     public static void main(String aa[]){
       int b1;
        Scanner s=new Scanner(System.in);
       b1=s.nextInt();
      int c=s.nextInt();
      int h=b1*c;
      double j=Math.sqrt(h);
      if(j==c){
          System.out.println("Yes\n");
      }
 else{
          System.out.println("No\n");
      }
  }
}
