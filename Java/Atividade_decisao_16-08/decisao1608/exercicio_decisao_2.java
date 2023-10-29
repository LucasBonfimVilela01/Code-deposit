/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class exercicio_decisao_2 {
    public static void main(String[] args) {
        double n;
        
        n = Double.parseDouble(JOptionPane.showInputDialog("insira um numero para saber se é positivo ou negativo"));
        
        if(n>=0){
            JOptionPane.showMessageDialog(null, "O numero: "+n+" é positivo");
        }
        else{
           JOptionPane.showMessageDialog(null, "O numero: "+n+" é negativo"); 
        }
    }
}
