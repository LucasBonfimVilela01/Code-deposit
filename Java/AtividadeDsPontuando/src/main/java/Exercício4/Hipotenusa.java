package Exercício4;

import javax.swing.JOptionPane;

public class Hipotenusa {
    public static void main(String[] args) {
        TestarHipotenusa Hipotenusa = new TestarHipotenusa();
        int loop=1;
        int menu=0;
        boolean passouValores = false;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Calcule a hipotenusa: \n 1-Insira medida dos catetos \n 2-Calcular hipotenusa \n 3-Sair"));            
            switch(menu){
                case 1:
                    Hipotenusa.LerValores();
                    passouValores=true;
                break;
                case 2:
                    if(passouValores==true){
                        String hipotenusa = String.format("%.3f", Hipotenusa.Hipotenusa());
                        JOptionPane.showMessageDialog(null,"A medida da hipotenusa é: "+hipotenusa);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Insira algum valor antes de calcular!");
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
