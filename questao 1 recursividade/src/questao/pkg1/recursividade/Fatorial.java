/*Criar um método recursivo para calcular o Fatorial de um número */

package questao.pkg1.recursividade;
import javax.swing.JOptionPane;


/*@author Camila*/


public class Fatorial {
 
    public static void main(String[] args) {
        int num,fat=1;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
       
        JOptionPane.showMessageDialog(null,"O fatorial de:\n"+num+"="+calculafatorial(num));    
}
    public static int calculafatorial(int num){
        int fat =1;
        for (int i=num;i>0;i--){
            fat*=i;
        }
        return fat;
    }
    
    public static int calculafatorialr(int num){
        if(num==0){
            return 1;
        }else
        {
            return num* calculafatorialr(num-1);
        }
          
    }
    
    
}
//recursividade= função que chama ela mesma
// 6!= 6x5!
// 5!=5x4!
// 4!=4x3!
// 3!=3x2!
// 2!=2x1!
// 1!=1x0!
// 0!=1
// 1 -> caso base( algo que e certeza)



//questao 1