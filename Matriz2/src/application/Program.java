package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int [m][n];

        for (int i = 0; i < mat.length; i++) { //preenche linha por linha
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int valor = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == valor) {
                    System.out.println("Posição: " + i + "," + j + ":");
                    if (j>0) {
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }
                    if (i>0) {
                        System.out.println("Cima: " + mat[i-1][j]);
                    }
                    if (j<mat.length) {
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i<mat[i].length) {
                        System.out.println("Baixo: " + mat[i+1][j]);
                    }
                }
            }
            sc.close();
        }
    }
}
