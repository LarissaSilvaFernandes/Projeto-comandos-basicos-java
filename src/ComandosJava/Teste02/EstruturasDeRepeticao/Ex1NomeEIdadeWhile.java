package ComandosJava.Teste02.EstruturasDeRepeticao;
/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representado o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
 */

import java.util.Scanner;

public class Ex1NomeEIdadeWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scanner.next();
            if (nome.equals("0"))break;

            System.out.println("idade: ");
            idade = scanner.nextInt();
        }
        System.out.println("fim");
    }
}
