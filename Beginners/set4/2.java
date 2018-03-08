import java.util.*;
import java.lang.*;
public class wordch{
     public static void main(String aa[]){
      String w;
      int count=0;
      Scanner s=new Scanner(System.in);
      w=s.nextLine();
     String d[]=w.split("\\s+");
     for(int i=0;i<d.length;i++){
         count++;
     }
     System.out.println(count);
    }
    
}
