
package com.mycompany.attmetodos13122023;

import javax.swing.JOptionPane;

public class atividade3 {
    public static void main(String[] args) {
        int loop = 0;
        double altura = 0, pesoIdeal=0;
        String sexo;
        do{
            sexo = JOptionPane.showInputDialog("Insira seu sexo: \n M para masculino\n F para feminino");
            
            if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")){
                loop++;
            }
            else{
                JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }while(loop == 0);
        do{
            altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura"));
                if (altura > 0){
                    loop++;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
        }while(loop != 2);
        pesoIdeal = calcularPesoIdeal(sexo, altura);
        
        JOptionPane.showMessageDialog(null, "Seu peso ideal é: "+pesoIdeal);
    }
    static double calcularPesoIdeal(String s, double h){
        double pi;
        if(s.equalsIgnoreCase("m")){
            pi = (72.7 * h) - 58;
            return pi;
        }else{
            pi = (62.1 * h) - 44.7;
            return pi;
        }
    }
}
