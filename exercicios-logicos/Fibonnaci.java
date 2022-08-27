// algoritmo que calcula a sequência de Fibonnaci

import java.util.ArrayList;

public class Fibonnaci {
    static long fibo(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibo(num - 1) + fibo(num - 2);
        }
    }

    public static void main(String[] args) {
        int num = 10; 
        
        // 1° forma de calcular a sequência de fibonnaci: 
        int a = 0;
        int b = 1;
        int c = 0; 
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < num; i++) {
            a = b;     
            b = c; 
            c = a + b;
            result.add(c);
        }
        System.out.println("Sequência de fibonnaci: " + result);

        //2° forma de calcular a sequência de fibonnaci: 
        for (int i = 1; i <= num; i++) {
            System.out.print(Fibonnaci.fibo(i) + ", ");
        };
    } 
}
