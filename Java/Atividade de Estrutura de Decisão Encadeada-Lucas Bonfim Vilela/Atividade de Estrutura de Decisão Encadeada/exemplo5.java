/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class exemplo5 {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
        
        if ((a < b) && (a < c)) {
    if (b < c) {
        JOptionPane.showMessageDialog(null, "A sequência é : " + a + " - " + b + " - " + c);
    } else {
        JOptionPane.showMessageDialog(null, "A sequência é : " + a + " - " + c + " - " + b);
    }
} else if ((b > a) && (b < c)) {
    if (a < c) {
        JOptionPane.showMessageDialog(null, "A sequência é : " + b + " - " + a + " - " + c);
    } else {
        JOptionPane.showMessageDialog(null, "A sequência é : " + b + " - " + c + " - " + a);
    }
} else {
    if (a < b) {
        JOptionPane.showMessageDialog(null, "A sequência é : " + c + " - " + b + " - " + a);
    } else {
        JOptionPane.showMessageDialog(null, "A sequência é : " + c + " - " + b + " - " + a);
    }
}
    }
}
    