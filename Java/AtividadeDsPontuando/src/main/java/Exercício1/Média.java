package Exercício1;

import javax.swing.JOptionPane;

public class Média {
    public static void main(String[] args) {
        TestarMédia Média = new TestarMédia();
        int loop=1;
        int menu=0;
        String nome = "";
        nome = JOptionPane.showInputDialog("Insira o seu nome");
        
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n 1-Insira notas \n 2-Calcular média \n 3-Sair"));            
            switch(menu){
                case 1:
                    Média.LerNota();
                break;
                case 2:
                    if(Média.calcularMédia()>=7){
                        JOptionPane.showMessageDialog(null,"A média de "+nome+" foi: "+Média.calcularMédia()+" aprovado");
                    }else{
                        JOptionPane.showMessageDialog(null,"A média de "+nome+" foi: "+Média.calcularMédia()+" reprovado");
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
