import java.util.*;
import java.lang.*;
public class numecc{
     public static void main(String aa[]){
      String d;
      int count=0;
      Scanner s=new Scanner(System.in);
      d=s.nextLine();
     for(int i=0;i<d.length();i++){
        if(d.charAt(i)>='0'&&d.charAt(i)<='9'){
             count++;
        }
        
     }
     System.out.println(count);
    } 
}
