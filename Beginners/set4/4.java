import java.util.*;
import java.lang.*;
public class linec1{
     public static void main(String aa[]){
      String q;
      int count=0;
      Scanner s=new Scanner(System.in);
      q=s.nextLine();
     String b[]=q.split("\\.");
     for(int i=0;i<b.length;i++){
         count++;
     }
     
     System.out.println(count);
    }
}
