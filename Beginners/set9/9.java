import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class lexicl{
     public static void main(String aa[]){
        String s1;
        Scanner ss=new Scanner(System.in);
        s1=ss.next();
        char v[]=s1.toCharArray();
        Arrays.sort(v);
        for(int i=0;i<v.length;i++){
            System.out.print(v[i]+"\n");
        }
        
        
  }
}
