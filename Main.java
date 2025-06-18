package edu.dio;



import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Exercico 01 - Escreva um codigo q ue recebe o nome e o ano de nascimento
        de alguem e imprima na tela a seguinte mensagem:
        "Ola 'Fulano', voce tem 'x' anos"
        */

        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Escreva o seu nome: ");
        var name = scanner.next();
        System.out.println("Escreva seu ano de nascimento: ");
        var year = scanner.nextInt();
        var age = baseYear - year;
        System.out.println("Ola...me diga o seu nome:");
        System.out.printf("Ola %s , voce tem %s anos!\n\n" , name, age);

        /*
        Exercicio 02 - Escreva um codigo que receba o tamanho do lado de um quadrado,
        calcule sua area e exiba na tela ( formula: area = lado x Lado)
        */

        System.out.println("Vamos descobrir a area de um QUADRADO!");
        System.out.println("Digite o tamanho de um lado do quadrado:");
        var ladoQuadrado = scanner.nextDouble();
        var areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.printf("Se o lado do quadrado è: %s,\nA area total è: %s \n\n", ladoQuadrado, areaQuadrado);

        /*
        Exercicio 03 - Escreva um codigo que receba a base e a altura de um retangulo,
        calcule sua area e exiba na tela (formula: area = base x altura)
        */

        System.out.println("Vamos descobrir a area de um RETANGULO!");
        System.out.println("Digite o tamanho da base do retangulo:");
        double baseRetangulo = scanner.nextDouble();
        System.out.println("Digite a altura do retangulo:");
        double alturaRetangulo =scanner.nextDouble();
        System.out.printf("Se a base è: %s e a altura è: %s \n", baseRetangulo,alturaRetangulo);
        double areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.println("A area do retangulo è: " + areaRetangulo + "\n\n");

        /*
        Exercicio 04 - Escreva um codigo que receba o nome e a idade de 2 pessoas
        e imprima a diferença de idade entre elas.
         */


        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.next();
        System.out.print("Digite a idade de " + nome1 + ": ");
        int idade1 = scanner.nextInt();
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.next();
        System.out.print("Digite a idade de " + nome2 + ": ");
        int idade2 = scanner.nextInt();

        int diferenca = Math.abs(idade1 - idade2);
        System.out.println("\nA diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferenca + " anos.");

        scanner.close();


    }


}
