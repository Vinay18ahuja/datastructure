package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {
    public static void solution(ArrayList<Integer> al){
        for (int i=al.size()-1;i>=0;i--){
            int num=al.get(i);
            if(isPrime(num)){
                al.remove(i);
            }
        }

    }

    private static boolean isPrime(int num) {
        for(int div=2;div*div<=num;div++){
            if(num%div==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }
}
