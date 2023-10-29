/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class exercicio1 {
    public static void main(String[] args) {
        double hora;
         
        hora = Double.parseDouble(JOptionPane.showInputDialog("informe o horário da sua entrada"));
        
        if (hora<24){
            if (hora>=5){
                if (hora>=13){
                    if (hora>=21){
                        JOptionPane.showMessageDialog(null, "o seu turno é o da noite");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "o seu turno é o da tarde"); 
                    }
                }
                else{
                   JOptionPane.showMessageDialog(null, "o seu turno é o da manhã"); 
                }
                
            }
            else{
               JOptionPane.showMessageDialog(null, "o seu turno é o da noite");  
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "horário inválido");
        }
            
         
    }
}
