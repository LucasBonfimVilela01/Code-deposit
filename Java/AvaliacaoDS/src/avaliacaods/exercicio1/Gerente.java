package avaliacaods.exercicio1;

import javax.swing.JOptionPane;

class Gerente extends Object{
    public double salario;
    
    public void LerValores(){
        boolean valido = false;
        do{
            salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu salário"));
            
            if(salario==0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser maior que zero");
            }else if(salario<0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser positivo");
            }else if(salario<1412){
                JOptionPane.showMessageDialog(null,"O valor é menor que o salário mínimo");
            }else{
                valido = true;
            }
        }while(valido==false);
    }
    public double AumentoPersonalizado(){
        boolean valido = false;
        double taxa;
        double h;
        do{
            taxa = Double.parseDouble(JOptionPane.showInputDialog("Insira a taxa do aumento do salário em porcentagem"));
            
            if(salario==0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser maior que zero");
            }else if(salario<0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser positivo");
            }else{
                valido = true;
            }
        }while(valido==false);
        taxa = taxa/10;
        salario = salario + (salario*taxa);
        return salario;
    }
    public double AumentoFixo(){
        salario = salario + (salario*0.1);
    return salario;
}
}
