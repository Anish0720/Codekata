import java.util.*;
import java.lang.*;
public class pof{
      public static void main(String aa[]){
           int n;
           int f=0;
           Scanner s=new Scanner(System.in);
           n=s.nextInt();
          for(int i=2;i<n;i++){
              if(n%i==0){
                  f=1;
                  break;
              }
          }
           if(f==0){
               System.out.println("Yes\n");
           }
         else{
               System.out.println("No\n");
         }
         

}
}
