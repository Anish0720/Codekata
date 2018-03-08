import java.util.*;
public class posneg{
      public static void main(String aa[]){
            int n;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            if(n>0){
                System.out.println("Positive\n\t");
            }
          else if(n<0){
               System.out.println("Negative\n\t");
          }
       else{
                 System.out.println("Zero\n");
       }      
      }
}
