package br.com.zup;

import java.util.Scanner;

public class lista5_Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadeNumeros = 0;
        int contador = 0;
        double maiorValor = 0;
        double menorValor = 0;


        System.out.println("Por favor digite a quantidade de números desejados: ");
        quantidadeNumeros = leitor.nextInt();

        System.out.println("Digite um numero");
        double valorLido = leitor.nextDouble();
        menorValor = valorLido;

        while (contador < (quantidadeNumeros -1)) {
            System.out.println("Digite um numero");
            valorLido = leitor.nextDouble();

            if (valorLido >=0 && valorLido < menorValor) {
                menorValor = valorLido;
            }else{
                maiorValor = valorLido;
            }
            contador += 1;

        }
        System.out.println("O menor valor digitado foi: " + menorValor);
        System.out.println("O maior valor digitado foi: " + maiorValor);
        System.out.println("A soma do maior valor e do menor valor digitados é: " + (menorValor + maiorValor));
    }
}
