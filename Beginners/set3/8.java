import java.util.*;
import java.lang.*;
public class indexx{
     public static void main(String aa[]){
        int n1;
        Scanner s=new Scanner(System.in);
        n1=s.nextInt();
        int a[]=new int[n1];
        for(int i=0;i<n1;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n1;i++){
            System.out.printf("%d %d",a[i],i);
            System.out.println();
        }
        
        
}
}
