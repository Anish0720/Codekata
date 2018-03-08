import java.util.*;
import java.lang.*;
public class charc {
     public static void main(String aa[]){
      String b;
      int count=0;
      Scanner s=new Scanner(System.in);
      b=s.nextLine();
      for(int i=0;i<b.length();i++){
          if(b.charAt(i)!=' '){
              count++;
          }
      }
      
      System.out.println(count);
    }
}
