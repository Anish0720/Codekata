import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class vowel1{
     public static void main(String aa[]){
         String a;
    Scanner s=new Scanner(System.in);
    a=s.next();
    int ce=0;
   int l=a.length();
   char b[]=a.toCharArray();
   for(int i=0;i<l;i++){
     if((b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u')||(b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U')){
         ce=1;
         break;
     }
   }
   if(ce==1){
       System.out.println("Yes");
   }
 else{
       System.out.println("No");
      }
 }
}
