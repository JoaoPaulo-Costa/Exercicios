package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] vet = new double[n];

        for(int i=0; i<n; i++) {
            vet[i] = sc.nextDouble();
        }

        double soma = 0.00;

        for (int i = 0; i<n; i++) {
            soma += vet[i];
        }

        double med = soma/n;

        System.out.printf("Média da soma = %.2f", med);

        sc.close();

    }

}
