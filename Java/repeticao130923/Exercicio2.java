
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio2 {
    public static void main(String[] args) {
        int i, num;
        num = Integer.parseInt(JOptionPane.showInputDialog("insira um número para saber sua tabuada"));
        for( i=1; i <= 10; i++ ){
            System.out.println("tabuada: " + (num * i));
        }
    }
}
