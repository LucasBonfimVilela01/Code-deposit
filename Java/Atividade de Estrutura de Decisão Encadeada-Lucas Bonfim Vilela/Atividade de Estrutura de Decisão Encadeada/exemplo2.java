/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class exemplo2 {
    public static void main(String[] args) {
        String pais="", estado="", cidade="", bairro="";
        
        pais = JOptionPane.showInputDialog("infome o país :");
        estado = JOptionPane.showInputDialog("infome o estado :");
        cidade = JOptionPane.showInputDialog("infome o cidade :");       
        bairro = JOptionPane.showInputDialog("infome o bairro :");        
        
        if (!pais.equals("Brasil"))
        {
            JOptionPane.showMessageDialog(null, "país errado");
        }    
        else{
            if (!estado.equals("Bahia"))
            {
                JOptionPane.showMessageDialog(null, "estado errado");
            }
            else{
                if (!cidade.equals("Salvador"))
                {
                    JOptionPane.showMessageDialog(null, "cidade errado");   
                }
                else{
                    if (!bairro.equals("Nhocuné"))
                    {
                        JOptionPane.showMessageDialog(null, "bairro errado");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "este bairro possui 5500 habitantes");
                    }
                }
            }
        }
        
    }
}   
