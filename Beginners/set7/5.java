import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class dotspp{
     public static void main(String aa[]){
     String aa;
     Scanner s=new Scanner(System.in);
     aa=s.nextLine();
     String h[]=aa.split("\\;");
     for(int i=0;i<h.length;i++)
     {
         System.out.printf("%s\n",h[i]);
     } 
  }
}
