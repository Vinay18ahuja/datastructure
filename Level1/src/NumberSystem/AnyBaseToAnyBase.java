package NumberSystem;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int sourceToDecimal=getDecimalFromAnyBase(n,sourceBase);
        int decimalToDestBase=getAnyBaseFromDecimal(sourceToDecimal,destBase);
        System.out.println(decimalToDestBase);
    }

    private static int getAnyBaseFromDecimal(int n, int destBase) {
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%destBase;
            n=n/destBase;
            rv+=dig*p;
            p=p*10;
        }
        return rv;
    }

    private static int getDecimalFromAnyBase(int n, int sourceBase) {
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%10;
            n=n/10;
            rv+=dig*p;
            p=p*sourceBase;
        }
        return rv;
    }
}
