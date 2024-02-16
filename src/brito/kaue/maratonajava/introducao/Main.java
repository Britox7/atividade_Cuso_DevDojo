package brito.kaue.maratonajava.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        Double salario, jurosUm, jurosDois, jurosTres, valorFinal;

        jurosUm = 9.70 / 100;
        jurosDois = 37.35 / 100;
        jurosTres = 49.50 / 100;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Qual o seu salário?");
        salario = sc.nextDouble();

        if (salario <= 34712) {
            valorFinal = salario * jurosUm;
        } else if (salario >= 34713 && salario <= 68507) {
            valorFinal = salario * jurosDois;
        } else {
            valorFinal = salario * jurosTres;
        }

        System.out.printf("%s você irá receber: R$%.2f", nome, valorFinal);

    }
}