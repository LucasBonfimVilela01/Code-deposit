package avaliacaods.exercicio2;

import javax.swing.JOptionPane;

class Conta extends Object{
    public int numConta;
    public double saldo;
    public double limite;
    
    double ultimoDeposito;
    double ultimoSaque;
    
    public void LerValores(){
        boolean valido = false;
        do{
            numConta = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da sua conta"));
            
            if(numConta==0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser maior que zero");
            }else if(numConta<0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser positivo");
            }else{
                valido = true;
            }
        }while(valido==false);
        valido=false;
        do{
            saldo = Double.parseDouble(JOptionPane.showInputDialog("Insira o saldo da sua conta"));
            
            if(saldo==0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser maior que zero");
            }else if(saldo<0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser positivo");
            }else{
                valido = true;
            }
        }while(valido==false);
        valido=false;
        do{
            limite = Double.parseDouble(JOptionPane.showInputDialog("Insira o limite da sua conta"));
            
            if(limite==0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser maior que zero");
            }else if(limite<0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser positivo");
            }else{
                valido = true;
            }
        }while(valido==false);     
    }
    public void Deposito(){
        boolean valido = false;
        do{
            ultimoDeposito = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade que quer depositar"));
            
            if(ultimoDeposito==0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser maior que zero");
            }else if(ultimoDeposito<0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser positivo");
            }else{
                saldo = saldo + ultimoDeposito;
                JOptionPane.showMessageDialog(null,"O seu saldo agora é: "+saldo);
                valido = true;
            }
        }while(valido==false);  
        
    }
    public void Saque(){
        boolean valido = false;
        do{
            ultimoSaque = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade que quer sacar"));
            
            if(ultimoSaque==0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser maior que zero");
            }else if(ultimoSaque<0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser positivo");
            }else if(ultimoSaque>limite){
                JOptionPane.showMessageDialog(null,"Este valor ultrapassa seu limite!");
            }
            else{
                saldo = saldo - ultimoSaque;
                JOptionPane.showMessageDialog(null,"O seu saldo agora é: "+saldo);
                valido = true;
            }
        }while(valido==false);  
        
    }
    public void ConsultaSaldoDisponível(){
        JOptionPane.showMessageDialog(null,"Seu saldo disponível é de: "+saldo);
    }
    public void impExtrato(){
        JOptionPane.showMessageDialog(null,"O extrado da atividade recente de sua conta: "
                + "\n Código da sua conta = "+numConta
                + "\n Saldo atual = "+saldo
                + "\n Limite = "+limite
                + "\n Último Depósito = "+ultimoDeposito
                + "\n Último Saque = "+ultimoSaque);
    }
}
