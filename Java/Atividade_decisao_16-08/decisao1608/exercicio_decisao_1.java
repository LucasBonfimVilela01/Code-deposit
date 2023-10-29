/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class exercicio_decisao_1 {
    public static void main(String[] args) {
        double altura=0, Pideal;
        char sexo;
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        sexo = JOptionPane.showInputDialog("Informe seu sexo com M ou F:").charAt(0);
        
        if (sexo == 'M'){
        Pideal = (72.7*altura)-58;
            JOptionPane.showMessageDialog(null, "O seu peso ideal é: "+Pideal);
        }
        if (sexo == 'F'){
        Pideal = (62.1*altura)-44.7;
            JOptionPane.showMessageDialog(null, "O seu peso ideal é: "+Pideal);
        }
    }
}
