public class Fatorial {
    // Vídeo muito bom para entender a recursividade: https://www.youtube.com/watch?v=3sm_nq7lE20
    static int calcFatorial(int x) {
        return (x <= 1) ? x : x * calcFatorial(x - 1);
    }

    public static void main(String[] args) {
       int x = 6;
       System.out.println("O fatorial de " + x + " é " + Fatorial.calcFatorial(x));
    }
}
