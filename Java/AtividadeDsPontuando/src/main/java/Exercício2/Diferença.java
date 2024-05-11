
package Exercício2;

import javax.swing.JOptionPane;

public class Diferença {
    public static void main(String[] args) {
        TestarDiferença Diferença = new TestarDiferença();
        int loop=1;
        int menu=0;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n 1-Insira valores \n 2-Calcular diferença \n 3-Sair"));            
            switch(menu){
                case 1:
                    Diferença.LerValores();
                break;
                case 2:
                    JOptionPane.showMessageDialog(null,"A diferença dos números é: "+Diferença.diferença());
                break;
                case 3:                   
                    int exit = 2; 
                    exit = JOptionPane.showConfirmDialog(null, "Você tem certeza?");
                    
                    if(exit==0){
                        JOptionPane.showMessageDialog(null,"Saindo...");
                        loop++;
                    }else if (exit==1){
                        JOptionPane.showMessageDialog(null,"Voltando...");
                    }
                default:
                    if(menu!=3)JOptionPane.showMessageDialog(null,"Valor inválido");
                break;
            }
        } while (loop==1);
    }
}
