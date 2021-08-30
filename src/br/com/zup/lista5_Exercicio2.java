package br.com.zup;

import java.util.Scanner;

public class lista5_Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadeNumeros = 0;
        int contador = 0;
        int numerosImpares = 0;



        System.out.println("Por favor digite a quantidade de números desejados: ");
        quantidadeNumeros = leitor.nextInt();

        while (contador < quantidadeNumeros){
            System.out.println("Digite um numero");
            double valorLido= leitor.nextDouble();
            if(valorLido % 2 != 0){
                numerosImpares +=1;
            }
            contador +=1;

        }

        System.out.println("A quantidade de números pares nos " + quantidadeNumeros + " números escolhidos é: " + numerosImpares);

    }
}
