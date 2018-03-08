import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class check{
    public static void main(String aa[]){
   
    Scanner ss=new Scanner(System.in);
    int a=ss.nextInt();
    int k=ss.nextInt();
    int b[]=new int[a];
    for(int i=0;i<b.length;i++){
        b[i]=ss.nextInt();
    }
    for(int i=0;i<b.length;i++){
        if(b[i]==k){
        
            System.out.println("Yes\n");
            break;
        }
      }          
   }
}
