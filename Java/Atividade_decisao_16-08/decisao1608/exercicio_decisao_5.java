/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class exercicio_decisao_5 {
    public static void main(String[] args) {
        int senha=0;
        
        senha = Integer.parseInt(JOptionPane.showInputDialog("insira a senha"));
        
        if (senha == 123){
            JOptionPane.showMessageDialog(null, "senha válida!");
        }
        else{
            JOptionPane.showMessageDialog(null, "senha inválida");
        }
        
        
    }
}
