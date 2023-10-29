/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;

public class exercicio6 {
    public static void main(String[] args) {
        int idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        
        if (idade>=18){
         JOptionPane.showMessageDialog(null, "Sua classificação é: Senior");   
        }
        else{
         if(idade>=14){   
             JOptionPane.showMessageDialog(null, "Sua classificação é: Juvenil B");
         }
         else{
           if(idade>=11){   
             JOptionPane.showMessageDialog(null, "Sua classificação é: Juvenil A");
         }   
           else{
               if(idade>=8){   
             JOptionPane.showMessageDialog(null, "Sua classificação é: Infantil B");
           }
               else{
                   JOptionPane.showMessageDialog(null, "Sua classificação é: Infantil A");
               }
         }
        }
    }
}
}