package avaliacaods.exercicio1;

import javax.swing.JOptionPane;

public class TestarGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        int loop=1;
        int menu=0;
        boolean passouValores = false;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Aumente o salário: \n 1-Insira seu salário \n 2-Aumento de 10% \n 3-Aumento personalizado \n 4-Sair"));            
            switch(menu){
                case 1:
                    gerente.LerValores();
                    passouValores=true;
                break;
                case 2:
                    if(passouValores==true){
                        String aumento10 = String.format("%.3f", gerente.AumentoFixo());
                        JOptionPane.showMessageDialog(null,"O salário após o aumento ficaria: "+aumento10);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Insira algum valor antes de calcular!");
                    }
                break;
                case 3:
                    if(passouValores==true){
                        String aumentoPer = String.format("%.3f", gerente.AumentoPersonalizado());
                        JOptionPane.showMessageDialog(null,"O salário após o aumento ficaria: "+aumentoPer);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Insira algum valor antes de calcular!");
                    }
                break;
                case 4:                   
                    int exit = 2; 
                    exit = JOptionPane.showConfirmDialog(null, "Você tem certeza?");
                    
                    if(exit==0){
                        JOptionPane.showMessageDialog(null,"Saindo...");
                        loop++;
                    }else if (exit==1){
                        JOptionPane.showMessageDialog(null,"Voltando...");
                    }
                default:
                    if(menu!=4)JOptionPane.showMessageDialog(null,"Valor inválido");
                break;
            }
        } while (loop==1);
        
    }
}
