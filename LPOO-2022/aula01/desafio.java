package aula01;

import java.util.Scanner;

public class desafio {
 
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println("Entre com a primeira nota: ");
        nota1 = scanner.nextFloat();

        System.out.println("Entre com a segunda nota: ");
        nota2 = scanner.nextFloat();

        media = (nota1 + nota2) / 2;

        if(media < 5){
            System.out.println("Infelizmente você reprovou, sua média foi: "+ media);
        } else if (media > 5  && media < 7){
            System.out.println("Você está de exame, sua média foi: "+ media);
        } else {
            System.out.println("Parabéns você foi aprovado(a), sua média foi: "+ media);
        }

        scanner.close();

    }

}
