import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class charnum1{
     public static void main(String aa[]){
     int n1;
     int sum=0;
     Scanner s=new Scanner(System.in);
     n1=s.nextInt();
     String f=String.valueOf(n1);
     char a[]=f.toCharArray();
     for(int i=0;i<a.length;i++){
        int d=Character.getNumericValue(a[i]);
        sum=sum+d;
     }
     System.out.print(sum);
     
     
     System.out.print("\n");
}
}
