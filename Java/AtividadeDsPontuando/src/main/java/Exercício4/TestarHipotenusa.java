package Exercício4;

import javax.swing.JOptionPane;

class TestarHipotenusa extends Object{
    public double valor1;
    public double valor2;
    
    public void LerValores(){
        boolean valido1 = false;
        boolean valido2 = false;
        do{
            valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a medida do primeiro cateto"));
            
            if(valor1==0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser maior que zero");
            }else if(valor1<0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser positivo");
            }else{
                valido1 = true;
            }
        }while(valido1==false);
        
         do{
            valor2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a medida do segundo cateto"));
            
            if(valor2==0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser maior que zero");
            }else if(valor2<0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser positivo");
            }else{
                valido2 = true;
            }
        }while(valido2==false);
    }
public double Hipotenusa(){
    double h;
        h = (valor1*valor1)+(valor2*valor2);
        h = Math.sqrt(h);
    return h;
}
}
