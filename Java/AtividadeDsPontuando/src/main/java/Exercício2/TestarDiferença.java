package Exercício2;

import javax.swing.JOptionPane;

class TestarDiferença extends Object{
    public double valor1;
    public double valor2;
public void LerValores(){
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
  
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));
}
public double diferença(){
    double dif;
    if (valor1<valor2){
        dif = (valor2-valor1);
    }else if(valor1>valor2){
        dif = (valor1-valor2);
    }else{
        dif = (valor2-valor1);
    }
    return dif;
}
}
