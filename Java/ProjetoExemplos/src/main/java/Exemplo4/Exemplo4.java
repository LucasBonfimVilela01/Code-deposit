package Exemplo4;

import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args) {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Entre com um número:: "));
        
        if(RestoPorDois(num) == 0)
            JOptionPane.showMessageDialog(null, "O número é par. \n");
        else
            JOptionPane.showMessageDialog(null, "O número é ímpar. \n");
    }
    static int RestoPorDois(int a){
        return a % 2;
    }
}
