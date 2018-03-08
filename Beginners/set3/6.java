import java.util.*;
import java.lang.*;
public class meg11{
     public static void main(String aa[]){
        int q;
        Scanner s=new Scanner(System.in);
       q=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<q;i++){
            a[i]=s.nextInt();

        }
       Arrays.sort(a);
       int y=q/2;
       for(int i=0;i<q;i++){
           if(i==y){
               System.out.println(a[i]);
           }
           
       }  
       
}
}
