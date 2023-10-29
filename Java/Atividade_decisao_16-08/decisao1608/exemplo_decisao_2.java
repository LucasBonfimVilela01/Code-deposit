/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class exemplo_decisao_2 {
    public static void main(String[] args) {
        double nota1=0, nota2=0, media=0;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota:"));
        
        media=(nota1+nota2)/2;
        if (media>=5){
            JOptionPane.showMessageDialog(null, "O Aluno foi aprovado com média: "+media);
        }
        else{ 
            JOptionPane.showMessageDialog(null, "O Aluno foi reprovado com média: "+media);
        }
        
        
      
        
        
    }
}
