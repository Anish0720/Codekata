import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class repp2{
    public static void main(String aa[]){
    Scanner s=new Scanner(System.in);
    int ab=s.nextInt();
    int count=0;
    int k=s.nextInt();
    int b[]=new int[ab];
    for(int i=0;i<ab;i++){
        b[i]=s.nextInt();
    }
    for(int i=0;i<b.length;i++){
        if(b[i]==k){
            count++;
            
        }
    }
    System.out.println(count+"\n");
    }
}
