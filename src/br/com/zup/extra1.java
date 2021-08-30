package br.com.zup;

import java.util.Scanner;

public class extra1 {
    public static void main(String args[])
    {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o número de termos: ");
        int numeroDeTermos = leitor.nextInt();
        int repetidor = 0, contador;
        for (contador = 1; contador <= numeroDeTermos; contador++)
        {
            repetidor = repetidor * 10 + 1;
            System.out.println(repetidor);
        }
    }
}
