package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Ana");
        list.add("Jusé");
        list.add("Jony");
        list.add(2, "Raphael");

        System.out.println(list.size());



        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------");
        //list.remove("Ana");
        //list.remove(1);
        list.removeIf(x -> x.charAt(0)=='A');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------");
        System.out.println("Index of Maria: " + list.indexOf("Jusé"));
        System.out.println("Index of Maria: " + list.indexOf("Josué"));

        System.out.println("----------------");

        List<String> result = list.stream().filter(x -> x.charAt(0)=='M').collect(Collectors.toList()); //filtra pra tudo pra nomes que começam com M
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("----------------");

        String nome = list.stream().filter(x -> x.charAt(0)=='J').findFirst().orElse(null);
        System.out.println(nome);
        System.out.println("----------------");

        String nome2 = list.stream().filter(x -> x.charAt(0)=='T').findFirst().orElse(null);
        System.out.println(nome2);

    }

}