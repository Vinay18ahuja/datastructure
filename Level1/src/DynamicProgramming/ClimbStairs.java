package DynamicProgramming;

import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int cs=countPathTab(n);
        System.out.println(cs);
    }

    private static int countPath(int n, int[] qb) {
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        int cp1=countPath(n-1,qb);
        int cp2=countPath(n-2,qb);
        int cp3=countPath(n-3,qb);
        int cp=cp1+cp2+cp3;
        qb[n]=cp;
        return cp;
    }
    private static int countPathTab(int n) {
      int[] dp=new int[n+1];
      dp[0]=1;
      for(int i=1;i<=n;i++){
          if(i==1){
              dp[i]=dp[i-1];
          }else if(i==2){
              dp[i]=dp[i-1]+dp[i-2];
          }else{
              dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
          }
      }
      return dp[n];
    }
}
