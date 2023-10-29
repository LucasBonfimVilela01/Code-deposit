import javax.swing.JOptionPane;
public class correcaoava {
    public static void main(String[] args) {
        double saldo=10000, saque=0, deposito=0, emprestimo=0;
        int op=0;
        int senha=Integer.parseInt(JOptionPane.showInputDialog("Digite a senha:"));
        if(senha==12345){
            while(op!=5){
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "Banco DS\n"
            +"1. Saldo;\n"
            +"2. Saque;\n"
            +"3. Depósito;\n"
            +"4. Empréstimo;\n"
            +"5. Finalizar."
            ));
            switch(op){
                case 1: JOptionPane.showInputDialog(null, "O seu saldo é: \n R$"+saldo);
                break;
                case 2: saque=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"))    ;
                        if(saque>=0){
                        if(saldo>=saque){
                          saldo=saldo-saque;  
                          JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso!");
                        }
                        else{
                           JOptionPane.showMessageDialog(null, "Saldo insuficiente!"); 
                        }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Valor inválido");
                        }
                break;
                case 3: deposito=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito"))    ;
                        if(deposito>=0){
                          saldo=saldo+deposito;  
                          JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso!");
                        }
                        else{
                          JOptionPane.showMessageDialog(null, "Valor inválido");
                        }    ;
                
                break;
                case 4: emprestimo=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do empréstimo"))    ;
                        if(emprestimo>=0){
                          emprestimo=emprestimo-(emprestimo*0.05);
                          saldo=saldo+emprestimo;  
                          JOptionPane.showMessageDialog(null, "emprestimo efetuado com sucesso!, com taxa de 5% ");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Valor inválido");
                        }    ;
                
                break;
                case 5:     ;
                        JOptionPane.showMessageDialog(null, "Obrigado por usar nosso banco!");
                break;
                default:     ;
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                break;
                
            }
            
            }
        }
        else{  
            JOptionPane.showMessageDialog(null, "SENHA INVÁLIDA!");
        }
        
    }
 
}
