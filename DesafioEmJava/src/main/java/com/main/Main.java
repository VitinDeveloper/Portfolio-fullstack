package com.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("           > > > > > Menu de sistemas: < < < < <");
        System.out.println();
        System.out.println("1. Verificar se um número pertence à sequência de Fibonacci");
        System.out.println("2. Contar ocorrências de uma letra em uma string");
        System.out.println();
        System.out.print("Digite o número da opção: ");
        int opcao = scanner.nextInt();

        System.out.println();

        switch (opcao) {
            case 1:
                System.out.print("Digite um número para verificar a sequência de Fibonacci: ");
                int numero = scanner.nextInt();

                System.out.println();

                int fib0 = 0;
                int fib1 = 1;
                int proximoValor = fib0 + fib1;

                if (numero >= fib1) {
                    System.out.print("Sequência de Fibonacci: " + fib0 + ", " + fib1);

                    while (proximoValor <= numero) {
                        System.out.print(", " + proximoValor);
                        fib0 = fib1;
                        fib1 = proximoValor;
                        proximoValor = fib0 + fib1;
                    }

                    System.out.println();

                    if (Fibonacci.pertenceFibonacci(numero)) {
                        System.out.println("O Número " + numero + " pertence à sequência de Fibonacci.");
                        System.out.println();
                    } else {
                        System.out.println("O Número " + numero + " não pertence à sequência de Fibonacci.");
                        System.out.println();
                    }
                } else {
                    System.out.print("O Número " + numero + " pertence à sequência de Fibonacci");
                }
                break;

            case 2:
                System.out.print("Digite uma String: ");
                scanner.nextLine();
                String texto = scanner.nextLine();

                System.out.print("Digite a letra a ser contada: ");
                char letra = scanner.next().charAt(0);

                VerificadorDeLetras verificador = new VerificadorDeLetras(texto);
                verificador.contarLetra(letra);

                System.out.println(
                        "A letra '" + letra + "' aparece " + verificador.getNumeroDeLetras() + " vezes na string.");
                System.out.println();
                break;

            default:
                System.out.println("Opção inválida.");
                System.out.println();
                break;
        }

        scanner.close();
    }
}