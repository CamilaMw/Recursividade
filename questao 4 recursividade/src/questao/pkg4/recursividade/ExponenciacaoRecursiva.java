/*Criar um método recursivo para calcular a exponenciação passando como parâmetro a base e o 
expoente.*/
/* @author camila*/

package questao.pkg4.recursividade;
import javax.swing.JOptionPane;

public class ExponenciacaoRecursiva {

    public static void main(String[] args) {
        String baseInput = JOptionPane.showInputDialog("Digite a base:");
        double base = Double.parseDouble(baseInput);

        String expoenteInput = JOptionPane.showInputDialog("Digite o expoente:");
        int expoente = Integer.parseInt(expoenteInput);

        double resultado = calcularExponenciacao(base, expoente);

        JOptionPane.showMessageDialog(null, "O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
    }

    public static double calcularExponenciacao(double base, int expoente) {
        if (expoente == 0) {
            return 1; // Qualquer número elevado a 0 é 1.
        } else if (expoente > 0) {
            // Caso positivo: base ^ expoente = base * base ^ (expoente - 1)
            return base * calcularExponenciacao(base, expoente - 1);
        } else {
            // Caso negativo: base ^ expoente = 1 / (base ^ (-expoente))
            return 1 / (base * calcularExponenciacao(base, -expoente - 1));
        }
    }
}


