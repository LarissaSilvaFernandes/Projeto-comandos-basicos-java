package ComandosJava.Teste02.EstruturasDeRepeticao;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e
informe o maior número
e a média desses números.
 */
public class Ex3_MaiorEMediaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;


        System.out.println("Número: ");
        numero = scanner.nextInt();

        soma = soma + numero;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scanner.nextInt();

            soma = soma + numero;


            if (numero > maior) maior = numero;


            count = count + 1;
        } while (count < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}
