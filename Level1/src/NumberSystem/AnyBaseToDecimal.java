package NumberSystem;

import java.util.Scanner;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getAnyBaseToDecimal(n, b);
        System.out.println(d);
    }

    public static int getAnyBaseToDecimal(int n, int b){
        // write your code here
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%10;
            n=n/10;
            rv+=dig*p;
            p=p*b;
        }
        return rv;
    }
}
