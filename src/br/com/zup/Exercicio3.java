package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        int somaNumeros = 0;
        double media = 0;


        while (contador < 5) {
            System.out.println("Digite um numero");
            double valorLido = leitor.nextDouble();
            somaNumeros += valorLido;
            contador += 1;
            System.out.println(somaNumeros);
        }
        media = somaNumeros / 5;
        System.out.println("A média dos " + 5 + " números escolhidos é: " + media);

    }
}
