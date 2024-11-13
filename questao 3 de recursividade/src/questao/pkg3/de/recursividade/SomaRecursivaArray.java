/*Construa um programa que dado um array preenchido calcule a soma de todos os elementos desse 
array de forma recursiva.*/

package questao.pkg3.de.recursividade;

/*@author camila*/
 
public class SomaRecursivaArray {

    public static void main(String[] args) {
        int[] array = {8, 2, 10 ,6, 5};
        int resultado = somaRecursiva(array);
        System.out.println("A soma de todos os elementos do array e: " + resultado);
    }

    public static int somaRecursiva(int[] array) {
        return somaRecursivaAux(array, 0, array.length);
    }

    public static int somaRecursivaAux(int[] array, int posicao, int tamanho) {
        // Caso base: Se a posição for igual ao tamanho, retornamos 0  
        if (posicao == tamanho) {
            return 0;
        } else {
            // Chamamos a função recursiva para somar os elementos restantes do array.
            // Incrementamos a posição para avançar para o próximo elemento.
            return array[posicao] + somaRecursivaAux(array, posicao + 1, tamanho);
        }
    }
}
