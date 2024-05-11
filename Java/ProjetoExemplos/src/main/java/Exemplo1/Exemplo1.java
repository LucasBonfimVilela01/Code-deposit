package Exemplo1;

import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args) {
         int a;
         digite();
         a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
         dobro(a);
    }
    static void digite()
    {        
     JOptionPane.showMessageDialog(null, "Digite um número:: ");   
    }
    static void dobro(int n)
    {        
     int d = n * 2;   
     JOptionPane.showMessageDialog(null, "Dobro de "+n+" é "+d);
    }
}
