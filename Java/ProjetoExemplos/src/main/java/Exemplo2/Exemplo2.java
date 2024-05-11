package Exemplo2;

import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {
        int t;
        String p;
        digite();
        p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
        t=tamanho(p);
        JOptionPane.showMessageDialog(null,p+" possui "+t+" caracteres");
    }
    static void digite(){
        JOptionPane.showMessageDialog(null, "Digite uma palavra");
    }
    static int tamanho(String x){
        return x.length();
    }
}
