
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */

public class ParImpar {
    public static void main(String[] args) {
        int valor=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        if((valor%2)==0)
            JOptionPane.showMessageDialog(null, "Este número é par");
        else
            JOptionPane.showMessageDialog(null, "Este número é ímpar");
    }
}
