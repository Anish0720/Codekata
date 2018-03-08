import java.util.*;
import java.lang.*;
public class max{
      public static void main(String aa[]){
       int n;
       int count=0;
       int l;
       ArrayList<Integer>a=new ArrayList<Integer>();
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       for(int i=0;i<n;i++){
           l=s.nextInt();
           a.add(l);
       }
       System.out.println(Collections.max(a));
}
}
