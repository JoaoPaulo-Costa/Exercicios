package application;

import entities.Produto;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vet = new Produto[n];

        for (int i = 0; i< vet.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vet[i] = new Produto(nome, preco);
        }
        double soma = 0;
        for (int i = 0; i< vet.length; i++) {
            soma += vet[i].getPreco();
        }
        double med = soma/ vet.length;
        System.out.printf("Preço médio: %.2f", med);

    }

}
