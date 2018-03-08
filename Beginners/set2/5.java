import java.util.*;
import java.lang.*;
public class ever{
      public static void main(String aa[]){
           int z;
           int f=0;
           Scanner s=new Scanner(System.in);
           int  p=s.nextInt();
           z=s.nextInt();
          for(int i=p+1;i<=z;i++){
                if(i%2==0){
                    System.out.printf("%d\n",i);
                }
          }
    }
}
