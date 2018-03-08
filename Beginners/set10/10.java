import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class sumnnu{
    public static void main(String aa[]){
    String ak;
    int d;
    Scanner s=new Scanner(System.in);
    d=s.nextInt();
    ak=String.valueOf(d);
    char v[]=ak.toCharArray();
    int sum=1;
    for(int i=0;i<v.length;i++){
        int y=Character.getNumericValue(v[i]);
        sum=sum*y;
    }
    System.out.println(sum+"\n");          
   }
}
