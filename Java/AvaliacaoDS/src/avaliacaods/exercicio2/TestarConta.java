package avaliacaods.exercicio2;

import javax.swing.JOptionPane;

public class TestarConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        int loop=1;
        int menu=0;
        boolean passouValores = false;
        boolean fezDeposito = false;
        boolean fezSaque = false;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Operações de conta: "
                    + "\n 1-Insira dados da sua conta "
                    + "\n 2-Depósito "
                    + "\n 3-Saque "
                    + "\n 4-Verificar saldo "
                    + "\n 5-Veja seu extrato bancário "
                    + "\n 6-Sair"));            
            switch(menu){
                case 1:
                    conta.LerValores();
                    passouValores=true;
                break;
                case 2:
                    if(passouValores==true){
                        conta.Deposito();
                        fezDeposito = true;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Insira seu saldo antes de fazer um depósito!");
                    }
                break;
                case 3:
                    if(passouValores==true){
                        conta.Saque();
                        fezSaque = true;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Insira seu limite antes de sacar!");
                    }
                break;
                case 4:
                    if(passouValores==true){
                        conta.ConsultaSaldoDisponível();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Insira o seu saldo antes de conferir!");
                    }
                break;
                case 5:
                    if(passouValores==true||fezDeposito==true||fezSaque){
                        conta.impExtrato();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Use mais sua conta antes de ter um extrato!");
                    }
                break;
                case 6:                   
                    int exit = 2; 
                    exit = JOptionPane.showConfirmDialog(null, "Você tem certeza?");
                    
                    if(exit==0){
                        JOptionPane.showMessageDialog(null,"Saindo...");
                        loop++;
                    }else if (exit==1){
                        JOptionPane.showMessageDialog(null,"Voltando...");
                    }
                default:
                    if(menu!=6)JOptionPane.showMessageDialog(null,"Valor inválido");
                break;
            }
        } while (loop==1);
        
    }
}
