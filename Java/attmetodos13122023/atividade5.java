
package com.mycompany.attmetodos13122023;

import javax.swing.JOptionPane;

public class atividade5 {
    public static void main(String[] args) {
        double base, altura, hipotenusa;
        int loop=0;
        do{
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 2: "));
        if (base <= 0 || altura <=0 ){
            JOptionPane.showMessageDialog(null, "Valor inválido");  
        }else{
            loop++;
        }
        }while(loop==0);
        hipotenusa = hipotenusa(base, altura);
        JOptionPane.showMessageDialog(null, "A hipotenusa dos catetos: "+base+" e "+altura+" é: "+hipotenusa);  
    }
    static double hipotenusa(double b, double h){
        double hipo;
        hipo = Math.hypot(b, h);
        return hipo;
    }
}
