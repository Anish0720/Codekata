import java.util.*;
import java.lang.*;
public class arteh{
      public static void main(String aa[]){
      int nn;
      int f;
      int l;
      int sum=0;
      int val;
      Scanner s=new Scanner(System.in);
      nn=s.nextInt();
      f=s.nextInt();
      l=s.nextInt();
      val=f;
      for(int i=0;i<nn;i++){
          sum=sum+val;
          val=val+l;
      }
      System.out.println(sum+"\n");
      }
}
