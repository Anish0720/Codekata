import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class opper{
     public static void main(String aa[]){
     int a;
     int b;
     int y;
     char c;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     c=s.next().charAt(0);
     
       b=s.nextInt();
       
   switch(c){
       case '+':
            y=a+b;
           System.out.print(y+"\n");
           break;
           case '-':
            y=a-b;
           System.out.print(y+"\n");
           break;
           case '/':
            y=a/b;
           System.out.print(y+"\n");
           break;
           case '%':
           y=a%b;
           System.out.print(y+"\n");
           break;
        }
    }
}
