import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class chch{
     public static void main(String aa[]){
    int aaa;
    Scanner s=new Scanner(System.in);
    aaa=s.nextInt();
    int pl=1;
    int count=0;
   int b[]=new int[aaa];
   for(int i=0;i<aaa;i++){
       b[i]=s.nextInt();
   }
   for(int i=0;i<b.length;i++){
       if(b[i]!=pl){
           count++;
       }
       pl++;
   }
   System.out.println(count+"\n");         
   }
}
