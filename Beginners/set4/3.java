import java.util.*;
import java.lang.*;
public class spcw {
     public static void main(String aa[]){
      String w;
      int count=0;
      Scanner s=new Scanner(System.in);
      w=s.nextLine();
    
     for(int i=0;i<w.length();i++){
        if(w.charAt(i)==' '){
            count++;
        }
     }
     System.out.println(count);

}      
}
