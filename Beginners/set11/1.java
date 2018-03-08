import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class charc1 {
    public static void main(String aa[]){
    String a;
    int d1;
    Scanner s=new Scanner(System.in);
    a=s.next();
    d1=s.nextInt();
    String h=new StringBuffer(a).reverse().toString();
    char f[]=h.toCharArray();
    d1=d1-1;
    for(int i=0;i<f.length;i++){
           if(i==d1){
               System.out.println(f[i]+"\n");
           }
      }          
   }
}
