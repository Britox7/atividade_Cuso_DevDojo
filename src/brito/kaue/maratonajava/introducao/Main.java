package brito.kaue.maratonajava.introducao;

public class Main {
    public static void main(String[] args) {

        String nome = "Kauê";
        double salario = 1000000;
        double jurosUm = 9.70 / 100;
        double jurosDois = 37.35 / 100;
        double jurosTres = 49.50 / 100;
        double valorFinal;

        if (salario <= 34712) {
            valorFinal = salario * jurosUm;
        } else if (salario >= 34713 && salario <= 68507) {
            valorFinal = salario * jurosDois;
        }
        else {
            valorFinal = salario * jurosTres;
        }

        String valorFormatado = String.format("%.2f", valorFinal);

        System.out.println("Kauê irá receber: " + valorFormatado  + "RS$");


    }
}