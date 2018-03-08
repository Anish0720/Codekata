import java.util.*;
import java.lang.*;
public class sbeb{
     public static void main(String aa[]){
     int a1;
     int b;
     Scanner s=new Scanner(System.in);
     a1=s.nextInt();
     b=s.nextInt();
     a1=a1^b;
     b=a1^b;
     a1=a1^b;
     System.out.printf("%d %d\n",a1,b);
     
    }
}
