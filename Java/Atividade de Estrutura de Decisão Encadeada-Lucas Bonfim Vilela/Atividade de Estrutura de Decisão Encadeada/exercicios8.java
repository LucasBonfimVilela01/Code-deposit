/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas
 */
import javax.swing.JOptionPane;

public class exercicios8 {
    public static void main(String[] args) {
        double a, b, c;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("insira o valor de A"));
        b = Double.parseDouble(JOptionPane.showInputDialog("insira o valor de B"));
        c = Double.parseDouble(JOptionPane.showInputDialog("insira o valor de C"));
        
        if(a<=0){
           JOptionPane.showMessageDialog(null, "Valor invalido"); 
        }
        else{
         if(b<=0){
           JOptionPane.showMessageDialog(null, "Valor invalido"); 
        }   
         else{
           if(c<=0){
           JOptionPane.showMessageDialog(null, "Valor invalido"); 
        }  
           else{
            if(a != b){
                if(b != c){
                    JOptionPane.showMessageDialog(null, "O triangulo é Escaleno");
                }
                else{
                    JOptionPane.showMessageDialog(null, "O triangulo é Isósceles");
                }
                
            }
            else{
                if(b != c){
                    JOptionPane.showMessageDialog(null, "O triangulo é Isósceles");
                }
                else{
                 JOptionPane.showMessageDialog(null, "O triangulo é Equilátero");   
                }
            }
           }
         }
        }
    }
}
