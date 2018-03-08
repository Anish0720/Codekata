import java.util.*;
import java.lang.*;
public class max1{
     public static void main(String aa[]){
     int n1;
     int c;
     Scanner s=new Scanner(System.in);
     n1=s.nextInt();
     ArrayList<Integer>a=new ArrayList<Integer>();
     for(int i=0;i<n1;i++){
        c=s.nextInt();
        a.add(c);
     }
   System.out.print(Collections.max(a));
   System.out.print("\n\n");
   
    }
    
}
