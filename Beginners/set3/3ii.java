import java.util.*;
import java.lang.*;
public class min{
      public static void main(String aa[]){
       int e;
       int count=0;
       int c;
       ArrayList<Integer>a=new ArrayList<Integer>();
       Scanner s=new Scanner(System.in);
       e=s.nextInt();
       for(int i=0;i<e;i++){
           c=s.nextInt();
           a.add(c);
       }
       
       System.out.println(Collections.min(a));
}
}
