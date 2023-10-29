/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class exercicio_decisao_6 {
    public static void main(String[] args) {
        int ano;
        ano = Integer.parseInt(JOptionPane.showInputDialog("insira o ano do seu nascimento"));
        
        if ((2023-ano)>=18){
            JOptionPane.showMessageDialog(null, "você já atingiu a maioridade!");
        }
        else {
            JOptionPane.showMessageDialog(null, "você ainda não atingiu a maioridade");
        }
        
    }
}
