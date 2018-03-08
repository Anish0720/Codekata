import java.util.*;
import java.lang.*;
public class fact{
      public static void main(String aa[]){
           int n,p;
           int z=1;
           Scanner s=new Scanner(System.in);
           n=s.nextInt();
           for(int i=1;i<=n;i++){
               z=z*i;
           }
           System.out.printf("%d ",z);
      }
}
