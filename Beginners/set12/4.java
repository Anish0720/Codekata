import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class od2{
    public static void main(String aa[]){
    Scanner ss=new Scanner(System.in);
    int a=ss.nextInt();
    int count=1;
    int k=ss.nextInt();
    for(int i=0;i<=a;i++){
      if(i%2!=0){
        if(count==k){
        
        
          System.out.print(i+"\n");
        }
        count++;
        }
    }
  }
}
