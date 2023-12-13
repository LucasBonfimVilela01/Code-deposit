
package com.mycompany.attmetodos13122023;

import javax.swing.JOptionPane;

public class atividade2 {
    public static void main(String[] args) {
        int val1 = 0, val2 = 0;
        val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: "));
        val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2: "));
        diferenca(val1, val2);
    }
    static void diferenca(int a, int b){
        if (a==b){
            JOptionPane.showMessageDialog(null, "A diferença é igual a: 0");
        }else if(a>b){
           int dif = a-b; 
           JOptionPane.showMessageDialog(null, "A diferença é igual a: "+dif);
        }else{
            int dif = b-a; 
           JOptionPane.showMessageDialog(null, "A diferença é igual a: "+dif);
        }    
    }
}
