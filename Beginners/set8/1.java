import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class palin{
     public static void main(String aa[]){
         String ab;
    Scanner s=new Scanner(System.in);
    ab=s.next();
    String w=new StringBuffer().reverse().toString();
    if(ab.equalsIgnoreCase(w)){
        System.out.println("Palindrome\n");
    }
    
    
 else{
        System.out.println("Not palindrome\n");
      }
  }
}
