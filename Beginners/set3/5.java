import java.util.*;
import java.lang.*;
public class meg1{
     public static void main(String aa[]){
        int w;
        Scanner s=new Scanner(System.in);
        w=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<w;i++){
            a[i]=s.nextInt();

        }
       Arrays.sort(a);
       int y=n/2;
       for(int i=0;i<w;i++){
           if(i==y){
               System.out.println(a[i]);
           }
       }
}

}
