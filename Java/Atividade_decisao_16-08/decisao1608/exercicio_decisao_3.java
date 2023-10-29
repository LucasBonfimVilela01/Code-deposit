/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class exercicio_decisao_3 {
    public static void main(String[] args) {
        double val1, val2, r;
        
        val1 = Double.parseDouble(JOptionPane.showInputDialog("insira o valor 1:"));
        val2 = Double.parseDouble(JOptionPane.showInputDialog("insira o valor 2:"));
        r=val1+val2;
        if(r>25){
            JOptionPane.showMessageDialog(null, "soma maior que 25");
        }
        
        
    }
}
