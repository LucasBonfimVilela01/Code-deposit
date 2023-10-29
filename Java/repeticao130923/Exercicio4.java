/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        int start, end, i, add=0 ;
        
        start = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número da sequência"));
        end = Integer.parseInt(JOptionPane.showInputDialog("Insira o último número da sequência"));
        
        for(i=start; i <= end; i++ ){
          if((i%2)!=0){
              add = add+i;}    
        }
        JOptionPane.showMessageDialog(null, "A soma dos números ímpares é: "+add);
    }
}
