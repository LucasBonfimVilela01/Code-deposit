/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas
 */
import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
       int start=0, end=0;
        
        start = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número da sequência"));
        end = Integer.parseInt(JOptionPane.showInputDialog("Insira o último número da sequência"));
        
        while(end>=start)
        {
            if((end%2)==0)
            {
                System.out.println(""+end);
                end--;
            }
            else
            {
                end--;
            } 
        }
        
    }
}
