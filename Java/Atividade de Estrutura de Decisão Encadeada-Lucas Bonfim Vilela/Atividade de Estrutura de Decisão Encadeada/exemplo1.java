/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class exemplo1 {
    public static void main(String[] args) {
        String pais="", estado="", cidade="", bairro="";
        
        pais = JOptionPane.showInputDialog("infome o país :");
        estado = JOptionPane.showInputDialog("infome o estado :");
        cidade = JOptionPane.showInputDialog("infome o cidade :");       
        bairro = JOptionPane.showInputDialog("infome o bairro :");        
        
        if (pais.equals("Brasil"))
        {
            if (estado.equals("Bahia"))
            {
                if (cidade.equals("Salvador"))
                {
                    if (bairro.equals("Nhocuné"))
                    {
                      JOptionPane.showMessageDialog(null, "este bairro possui 5500 habitantes");  
                    }    
                }    
            }    
        }
    }    
        
    }

