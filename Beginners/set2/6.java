import java.util.*;
import java.lang.*;
public class primera{
      public static void main(String aa[]){
           int a,p;
           int f=0;
           Scanner s=new Scanner(System.in);
           p=s.nextInt();
           a=s.nextInt();
           for(int i=p;i<=a;i++){
               for(int j=2;j<i;j++){
                   if(i%j==0){
                       f=0;
                       break;
                   }
               else{
                       f=1;
               }
               }
               if(f==1){
                   System.out.println("i");
               }
           }
}
}
