/* Encontrar o MDC (máximo divisor comum) entre dois números recursivamente*/

package questao.pkg7.recursividade;

/* @author camila*/

import javax.swing.JOptionPane;

public class MDCRecursivo {

    public static void main(String[] args) {
        String numero1Input = JOptionPane.showInputDialog("Digite o primeiro número:");
        int numero1 = Integer.parseInt(numero1Input);

        String numero2Input = JOptionPane.showInputDialog("Digite o segundo número:");
        int numero2 = Integer.parseInt(numero2Input);

        int mdc = calcularMDC(numero1, numero2);

        JOptionPane.showMessageDialog(null, "O MDC entre " + numero1 + " e " + numero2 + " é: " + mdc);
    }

    public static int calcularMDC(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calcularMDC(b, a % b);
        }
    }
}
