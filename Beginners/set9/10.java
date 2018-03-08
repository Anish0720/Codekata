import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class alpha{
     public static void main(String aa[]){
        String sd;
        Scanner ss=new Scanner(System.in);
        sd=ss.next();
        char v[]=sd.toCharArray();
        for(int i=0;i<v.length;i++){
            if(Character.isDigit(v[i])){
                System.out.print(v[i]+"\n");
                
            }
        }
    }
}
