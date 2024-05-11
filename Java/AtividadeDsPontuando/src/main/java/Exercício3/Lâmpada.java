package Exercício3;

import javax.swing.JOptionPane;

public class Lâmpada {
    public static void main(String[] args) {
        TestarLâmpada lamp = new TestarLâmpada();
        int loop=1;
        int menu=0;
        boolean ver=false;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Controles lâmpada: \n 1-Mudar estado \n 2-Verficiar estado \n 3-Sair"));            
            switch(menu){
                case 1:
                    lamp.LerEstado();
                    ver=true;
                break;
                case 2:
                    if(ver==false){
                        JOptionPane.showMessageDialog(null,"Defina um valor antes de verificar!");
                    }
                    else{
                        lamp.MostrarEstado();
                    }
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
