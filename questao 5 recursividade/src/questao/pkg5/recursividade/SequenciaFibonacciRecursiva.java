/* Desenvolver um método que dado um número imprima a sequência de Fibonacci por meio recursivo*/
/*sequencia de fibonacci  ex 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89*/

package questao.pkg5.recursividade;

/*@author camila*/

public class SequenciaFibonacciRecursiva {

    public static void main(String[] args) {
        int n = 10; // Altere para o número desejado de termos da sequência
        System.out.println("Sequencia de Fibonacci com " + n + " termos:");
        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n; // Caso base: Retorna 0 para n=0 e 1 para n=1
        } else {
            // Chamada recursiva para calcular os termos subsequentes
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
