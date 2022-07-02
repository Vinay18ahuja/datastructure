import java.util.Scanner;

public class IsNumberPrimeOrNot {
 public static void main(String args[]){
     Scanner scn=new Scanner(System.in);
     int t=scn.nextInt();
     for(int i=0;i<t;i++){
         int n= scn.nextInt();
         boolean flag=false;
         for(int div=2;div*div<=n;div++){
             if(n%div==0){
                 flag=true;
                 break;
             }
         }
         if(flag){
             System.out.println("not prime");
         }else{
             System.out.println("prime");
         }
     }
 }

}
