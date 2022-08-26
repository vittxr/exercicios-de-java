/* 
 -> Enunciado: Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de luz segue a tabela abaixo: 
            Tipo de Cliente / Valor do KW/h
            a. (Residência) 0,60;
            b. (Comércio) 0,48;
            c. (Indústria) 1,29;
*/

import java.util.Scanner;

public class CalculaKWH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu tipo como consumidor: ");
        System.out.println("[a] Residencial: ");
        System.out.println("[b] Comercial: ");
        System.out.println("[c] Industrial: ");
        char tipoConsumidor = scanner.next().charAt(0);

        System.out.println("Informe gasto em KW/h");
        float valorConsumido = scanner.nextFloat();

        if(tipoConsumidor == 'a' || tipoConsumidor == 'A') {
            System.out.println("O valor da conta é de: " + (valorConsumido * 60)/100);
        } else if (tipoConsumidor == 'b' || tipoConsumidor == 'B') {
            System.out.println("O valor da conta é de: " + (valorConsumido * 48)/100);
        } else {
            System.out.println("O valor da conta é de: " + (valorConsumido * 129)/100);
        }
    }
}
