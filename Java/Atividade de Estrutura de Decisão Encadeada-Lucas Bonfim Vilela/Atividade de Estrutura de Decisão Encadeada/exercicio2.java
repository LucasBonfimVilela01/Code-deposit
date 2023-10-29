/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;

public class exercicio2 {
    public static void main(String[] args) {
        double peso, alt, imc;
        
        peso = Double.parseDouble(JOptionPane.showInputDialog("informe o seu peso"));
        alt = Double.parseDouble(JOptionPane.showInputDialog("informe a sua altura"));
        
        imc = peso/(alt*alt);
        
        if (imc<18){
         JOptionPane.showMessageDialog(null, "você está abaixo do seu peso ideal");   
        }
        else{
         if(imc<25){   
            JOptionPane.showMessageDialog(null, "você está no seu peso ideal"); 
         }
         else{
          if(imc<30){   
             JOptionPane.showMessageDialog(null, "você está acima do seu peso ideal");  
          }
          else{
           JOptionPane.showMessageDialog(null, "você está obeso");    
          }
         }
        }
    }
}
