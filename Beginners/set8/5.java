import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class repll {
     public static void main(String aa[]){
        String b1;
        Scanner s=new Scanner(System.in);
        b1=s.next();
       int y= b1.length();
       int u=y/2;
       char t[]=b1.toCharArray();
       System.out.println(u);
       for(int i=0;i<b1.length();i++){
         if(i==u){
             t[i]='*';
         }
     }
      for(int i=0;i<t.length;i++){
          System.out.print(t[i]);
          
          
        }
        System.out.print("\n");
  }
}
