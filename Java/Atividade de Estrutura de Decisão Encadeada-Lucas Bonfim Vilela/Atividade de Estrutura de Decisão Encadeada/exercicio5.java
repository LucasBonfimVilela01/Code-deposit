/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;

public class exercicio5 {
    public static void main(String[] args) {
        double n1, n2, n3, n4, med;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 2"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 3"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 4"));
        
        med =(n1+n2+n3+n4)/4;
        
        if (med>=9){
         JOptionPane.showMessageDialog(null, "Você foi aprovado! Nota A: "+med);   
        }
        else{
         if (med>=7){   
             JOptionPane.showMessageDialog(null, "Você foi aprovado! Nota B: "+med);
         }
         else{
          if (med>=5){   
              JOptionPane.showMessageDialog(null, "Você foi aprovado! Nota C: "+med);
          }
          else{
              if (med>2.5){
                  JOptionPane.showMessageDialog(null, "Você foi reprovado Nota D: "+med);
              }
              else{
               JOptionPane.showMessageDialog(null, "Você foi reprovado Nota E: "+med);   
              }
          }
         }
        }
    }
}
