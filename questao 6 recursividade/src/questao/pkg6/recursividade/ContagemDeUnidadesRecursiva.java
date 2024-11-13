/*Faça um programa que o usuário digite um número grande e depois uma unidade. O programa deve 
mostrar a quantidade de números que aparecem de maneira recursiva. Ex: número: 125741289545 unidade: 
5. A resposta é a quantidade: 3. */

package questao.pkg6.recursividade;

/*@author camila*/
import java.util.Scanner;

public class ContagemDeUnidadesRecursiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número grande: ");
        long numero = scanner.nextLong();

        System.out.print("Digite a unidade a ser contada: ");
        int unidade = scanner.nextInt();

        int quantidade = contarUnidades(numero, unidade);

        System.out.println("A quantidade de vezes que a unidade " + unidade + " aparece no numero é: " + quantidade);

        scanner.close();
    }

    public static int contarUnidades(long numero, int unidade) {
        // Caso base: Se o número for 0, não há mais unidades para contar.
        if (numero == 0) {
            return 0;
        } else {
            // Verifica se a unidade do número atual é igual à unidade que estamos procurando.
            int unidadeAtual = (int) (numero % 10);
            if (unidadeAtual == unidade) {
                // Se for igual, incrementa a contagem e continua com o próximo dígito.
                return 1 + contarUnidades(numero / 10, unidade);
            } else {
                // Se não for igual, apenas continua com o próximo dígito.
                return contarUnidades(numero / 10, unidade);
            }
        }
    }
}
