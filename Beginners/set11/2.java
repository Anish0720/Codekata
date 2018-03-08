import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class division{
    public static void main(String aa[]){
    int a;
    int cc;
   Scanner s=new Scanner(System.in);
   a=s.nextInt();
   while(a!=1){
   
       if(a%2!=0){
          cc=a;
          break;
       }
       a=a/2;
   }
    System.out.println(a+"\n");          
   }
}
