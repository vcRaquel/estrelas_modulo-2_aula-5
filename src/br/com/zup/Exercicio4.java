package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int quantidadeNumeros = 0;
        int contador = 0;
        int somaNumeros = 0;
        double media = 0;


        System.out.println("Por favor digite a quantidade de números desejados: ");
        quantidadeNumeros = leitor.nextInt();

        while (contador < quantidadeNumeros){
            System.out.println("Digite um numero");
            double valorLido= leitor.nextDouble();
            somaNumeros += valorLido;
            contador +=1;
            System.out.println(somaNumeros);
        }
        media = somaNumeros/quantidadeNumeros;
        System.out.println("A média dos " + quantidadeNumeros + " números escolhidos é: " + media);

    }
}
