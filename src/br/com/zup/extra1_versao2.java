package br.com.zup;

import java.util.Scanner;

public class extra1_versao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o número de termos: ");
        int numeroDeTermos = leitor.nextInt();
        String repetidor = "1";

        for (int contador = 1; contador <= numeroDeTermos; contador++)
        {
            if (!(contador == 1)) repetidor = repetidor + 1;
            System.out.println(repetidor);
        }
    }
}
