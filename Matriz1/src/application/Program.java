package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] mat = new int [n][n];

        for (int i = 0; i < mat.length; i++) { //preenche linha por linha
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int x = 0;
        for (int i = 0; i < mat.length; i++) { //preenche linha por linha
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] < 0) {
                    x++;
                }
            }
        }

        System.out.println("Números negativos: " + x);

        sc.close();

    }
}
