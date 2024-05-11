package avaliacaods.exercicio3;

import javax.swing.JOptionPane;

public class testarPessoa {
    public static void main(String[] args) {
        pessoa per = new pessoa();
        int loop=1;
        int menu=0;
        boolean passouValores = false;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Insira dados da pessoa: "
                    + "\n 1-Insira seus dados "
                    + "\n 2-Verificar faixa de idade "
                    + "\n 3-Verificar tudo "
                    + "\n 4-Sair"));            
            switch(menu){
                case 1:
                    per.LerValores();
                    passouValores=true;
                break;
                case 2:
                    if(passouValores==true){
                        per.Classificar();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Insira sua idade!");
                    }
                break;
                case 3:
                    if(passouValores==true){
                        per.Imprimir();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Insira suas informações antes!");
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
