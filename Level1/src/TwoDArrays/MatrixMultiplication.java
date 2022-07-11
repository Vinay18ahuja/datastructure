package TwoDArrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] one = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                one[i][j] = scn.nextInt();
            }
        }
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] two = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                two[i][j] = scn.nextInt();
            }
        }
        if(m1!=n2){
            System.out.println("Invalid Input");
            return;
        }
        int[][] prod=new int[n1][m2];
        for(int i=0;i< prod.length;i++){
            for(int j=0;j<prod[0].length;j++){
                for(int k=0;k<m1;k++){
                    prod[i][j]+=one[i][k]+two[k][j];
                }
            }
        }
        for(int i=0;i< prod.length;i++){
            for(int j=0;j<prod[0].length;j++){
                System.out.print(prod[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
