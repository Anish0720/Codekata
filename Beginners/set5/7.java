import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class maxmin1{
     public static void main(String aa[]){
     int q,f;
     ArrayList<Integer>b=new ArrayList<Integer>();
     Scanner s=new Scanner(System.in);
     q=s.nextInt();
     for(int i=0;i<q;i++){
         f=s.nextInt();
         b.add(f);
     }
     Integer min=Collections.min(b);
     Integer max=Collections.max(b);
     
     System.out.printf("%d %d\n", min,max);
    }
}
