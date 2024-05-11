package Exercício1;

import javax.swing.JOptionPane;

class TestarMédia extends Object{
    public double nota1;
    public double nota2;
public void LerNota(){
    do{
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota"));
  
        if (nota1<0)
            JOptionPane.showMessageDialog(null,"Valor inválido! Nota deve ser positiva");
        if (nota1>10)
            JOptionPane.showMessageDialog(null,"Valor inválido! Nota Máxima é 10");
    }while(nota1<0&&nota1>10);
    do{   
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota"));
        
        if (nota2<0)
            JOptionPane.showMessageDialog(null,"Valor inválido! Nota deve ser positiva");
        if (nota2>10)
            JOptionPane.showMessageDialog(null,"Valor inválido! Nota Máxima é 10");
    }while(nota2<0&&nota2>10);
}
public double calcularMédia(){
    double med = (nota1+nota2)/2;
    return med;
}
}