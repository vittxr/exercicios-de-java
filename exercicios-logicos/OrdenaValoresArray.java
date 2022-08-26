/*
  enunciado: Escreva um algoritmo que leia valores inteiros distintos e os escreva em ordem crescente 
*/ 

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class OrdenaValoresArray {
    // essa função ordena os valores usando o método de ordenação bubble sort.
    public static ArrayList ordenaValores(ArrayList arr) {
        int nPosterior = 0;
        int nAtual = 0;

        // no loop abaixo, é preciso verificar se a iteração (loop) atual é igual ao tamanho do array - 1. Assim, evita-se o erro de pegar o valor fora do alcance do array, já que dentro do loop pegamos i+1 ou j+1. Não queremos fazer isso na última iteração, então é preciso fazer essa comparação antes de efetuar o loop.
        for (int i = 0; i < arr.size(); i++) {
            if (i != arr.size()-1) {
                for (int j = 0; j < arr.size(); j++) {
                    if (j != arr.size()-1) {
                        // colocar o (int) converte objeto para int. Claro, caso esse objeto seja um número.
                        nAtual = (int) arr.get(j);
                        nPosterior = (int) arr.get(j+1); 
        
                        if (nAtual > nPosterior) {
                            arr.set(j, nPosterior);
                            arr.set(j + 1, nAtual);
                        } 
                    }
                }
            }
        }  

        return arr;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char desejaContinuar = 's';
        ArrayList<Integer> numerosEmOrdemCrescente = new ArrayList<Integer>();

        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            System.out.print("Informe um número inteiro: ");
            int num = scanner.nextInt();

            numerosEmOrdemCrescente.add(num);

            System.out.print("Deseja continuar: ");
            desejaContinuar = scanner.next().charAt(0);
        }
        

        /* int nPosterior = 0;
        int nAtual = 0; */
        ArrayList<Integer> exampleList = new ArrayList<Integer>();
        exampleList.add(5);
        exampleList.add(4);
        exampleList.add(7);
        exampleList.add(2);

        System.out.println(ordenaValores(exampleList));

        /* for (int i = 0; i < exampleList.size(); i++) {
            if (i != exampleList.size()-1) {
                for (int j = 0; j < exampleList.size(); j++) {
                    if (j != exampleList.size()-1) {
                        nAtual = exampleList.get(j);
                        nPosterior = exampleList.get(j+1); 
        
                        if (nAtual > nPosterior) {
                            exampleList.set(j, nPosterior);
                            exampleList.set(j + 1, nAtual);
                            System.out.println(nAtual + " é maior que " + nPosterior);
                        } else {
                            System.out.println(nAtual + " é menor que " + nPosterior);
                        }
        
                        System.out.println(nAtual);
                        System.out.println(nPosterior);
                        System.out.println(exampleList);
                    }
                }
            }
        }   */  

        //System.out.println(exampleList);
    }
}
