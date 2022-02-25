package aula01;

import java.util.Scanner;

public class exemplo04 {
    
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Entre com a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) /2.0;

        System.out.println("Sua média é igual: "+media); // o "+" é para fazer concatenação com variaveis ou string

        scanner.close();

    }

}
