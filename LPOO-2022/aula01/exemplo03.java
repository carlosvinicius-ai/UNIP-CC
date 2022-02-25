package aula01;

// importação nescessaria para utilizar o Scanner

import java.util.Scanner; //Para trabalhar com entrada de dados via teclado

public class exemplo03 {
    
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        //scanner é o nome padrão para o meu Scanner; Posso utilizar qualquer outro nome Ex: Corinthians

        int idade;

        System.out.println("Entre com a sua idade: ");

        idade = scanner.nextInt();

        // Checando a idade

        if(idade < 18){
            System.out.println("Que pena! você não pode dirigir seu corsa tunado ;-;");
        } else{
            System.out.println("Parabéns! você pode andar com seu corsa tunado na rua!!");  
        }
    
        scanner.close(); //Para finalizar o Scannen

    }

}
