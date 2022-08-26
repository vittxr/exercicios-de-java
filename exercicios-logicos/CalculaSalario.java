/*
  -> Enunciado: 
    A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo: 
        a. Professor Nível 1 R$12,00 por hora/aula;
        b. Professor Nível 2 R$17,00 por hora/aula;
        c. Professor Nível 3 R$25,00 por hora/aula
*/

import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de horas de aula dadas: ");
        float horas = scanner.nextFloat();

        System.out.println("Informe o seu nível como professor - [1], [2], ou [3]");
        int nivelProfessor = scanner.nextInt();
        
        switch (nivelProfessor) {
            case 1: 
               System.out.println("Seu salário mensal é: " + horas * 12.00);
               break;
            case 2: 
               System.out.println("Seu salário mensal é: " + horas * 17.00);
               break;
            case 3: 
               System.out.println("Seu salário mensal é: " + horas * 25.00);
               break;
            default: 
               System.out.println("Por favor, insira um nível válido. As opções são: 1, 2, ou 3");
        }
    }
}
