
package com.mycompany.attmetodos13122023;

import javax.swing.JOptionPane;

public class atividade4 {
    public static void main(String[] args) {
        int op=10;
            while(op!=0){
            op=Integer.parseInt(JOptionPane.showInputDialog("""
                                                            Escolha uma das contas
                                                            1 - Soma
                                                            2 - Subtração
                                                            3 - Divisão
                                                            4 - Multiplicação
                                                            5 - Resto da Divisão
                                                            6 - Dobro
                                                            7 - Quadrado
                                                            8 - Cubo
                                                            9 - Raíz Quadrada
                                                            0 - Sair"""));
            switch(op){
                case 1 -> soma();
                case 2 -> subtracao();
                case 3 -> divisao();
                case 4 -> multiplicacao();
                case 5 -> restoDivisao();
                case 6 -> dobro();
                case 7 -> quadrado();
                case 8 -> cubo();
                case 9 -> raizQuadrada();
                case 0 -> JOptionPane.showMessageDialog(null, "Programa finalizado");
                default -> JOptionPane.showMessageDialog(null, "Valor inválido");           
            }
            }
          
    }
    static void soma(){
        double x, y, z;
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 1: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 2: "));
        z = x+y;
        JOptionPane.showMessageDialog(null, "O resultado da soma é: "+z);
    }
    static void subtracao(){
       double x, y, z;
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 1: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 2: "));
        z = x-y;
        JOptionPane.showMessageDialog(null, "O resultado da subtração é: "+z);
    }
    static void divisao(){
       double x, y, z;
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 1: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 2: "));
        z = x/y;
        JOptionPane.showMessageDialog(null, "O resultado da divisão é: "+z);
    }
    static void multiplicacao(){
        double x, y, z;
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 1: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 2: "));
        z = x*y;
        JOptionPane.showMessageDialog(null, "O resultado da Multiplicação é: "+z);
    }
    static void restoDivisao(){
        double x, y, z;
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 1: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 2: "));
        z = x%y;
        JOptionPane.showMessageDialog(null, "O resto da divisão é: "+z);
    }
    static void dobro(){
        double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 1: "));
        y = x*2;
        JOptionPane.showMessageDialog(null, "O dobro de "+x+" é: "+y);
    }
    static void quadrado(){
        double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 1: "));
        y = Math.pow(x, 2);
        JOptionPane.showMessageDialog(null, "O quadrado de "+x+" é: "+y);
    }
    static void cubo(){
        double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 1: "));
        y = Math.pow(x, 3);
        JOptionPane.showMessageDialog(null, "O cubo de "+x+" é: "+y);
    }
    static void raizQuadrada(){
        double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 1: "));
        if(x<=0){
            JOptionPane.showMessageDialog(null, "Não tem raiz");
        }
        y = Math.sqrt(x);
        JOptionPane.showMessageDialog(null, "A raiz quadrade de "+x+" é: "+y);
    }
    
}
