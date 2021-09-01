package fundamentos;

import javax.swing.JOptionPane;

public class Aula10 {

    public static void main(String[] args) {
        
       String valor = JOptionPane.showInputDialog("Digite um valor: ");
       int numero = Integer.parseInt(valor);

       if (numero % 2 == 0){
           System.out.println("Par");
       }
       else if (numero % 2 == 1){
           System.out.println("Impar");
       }

        
    }
    
}
