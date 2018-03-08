import java.util.*;
import java.lang.*;
public class spec1{
     public static void main(String aa[]){
      String a;
      int cou=0;
      Scanner s=new Scanner(System.in);
      a=s.nextLine();
      
     for(int i=0;i<a.length();i++){
        if(a.charAt(i)>='0'&&a.charAt(i)<='9'){
             cou++;
        }
        
     }
     
     System.out.println(cou);
    } 
}
