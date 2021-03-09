package application;

import entities.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Empregado> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + i + ": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("ID já existente. Tente novamente: ");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            list.add(new Empregado(nome, id, salario));

        }

        System.out.println();
        System.out.print("Selecionar o ID do funcionário que terá aumento: ");
        int id = sc.nextInt();
        Empregado empregado = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (empregado == null) {
            System.out.println("Esse ID não existe!");
        }
        else {
            System.out.print("Porcentagem de aumento: ");
            double percentage = sc.nextDouble();
            empregado.aumento(percentage);
        }

        System.out.println();
        System.out.println("Lista de empregados:");
        for (Empregado obj : list) {
            System.out.println(obj);
        }

        sc.close();


    }
    public static boolean hasId(List<Empregado> list, int id) {
        Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
