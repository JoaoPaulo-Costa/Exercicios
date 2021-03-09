package application;

import entities.Apartamento;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de quartos no apartamento: ");
        int n = sc.nextInt();

        Apartamento[] vet = new Apartamento[n];

        System.out.print("Número de quartos alugados no apartamento: ");
        int n1 = sc.nextInt();

        for (int i = 1; i<=n1; i++) {
            System.out.println();
            System.out.println("Digitar dados dos inquilinos: ");
            System.out.print("Name: ");
            sc.next();
            String nome = sc.nextLine();
            System.out.print("email: ");
            String email = sc.nextLine();
            System.out.print("Quarto alugado: ");
            int quarto = sc.nextInt();
            vet[quarto] = new Apartamento(nome, email);

        }
        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < n; i++) {
            if(vet[i] != null){
                System.out.println(i + ": " + vet[i]);
            }
        }

        sc.close();

    }

}
