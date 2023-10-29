/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class exercicio3 {
    public static void main(String[] args) {
        int opcao=0;
        opcao  = Integer.parseInt(JOptionPane.showInputDialog("selecione umas das opções: \n"
                + "1-Bigmag\n"
                + "2-Quarteirão\n"
                + "3-MacChicken\n"
                + "4-Cheddar MacMelt\n"
                + "5-MacMax"));
        switch(opcao){
            case 1:
                JOptionPane.showMessageDialog(null,"Bigmag");
                break;
            case 2:            
                JOptionPane.showMessageDialog(null,"Quarteirão");
                break;
            case 3:    
                JOptionPane.showMessageDialog(null,"MacChicken");
                break;
            case 4:    
                JOptionPane.showMessageDialog(null,"Cheddar MacMelt");
                break;    
            case 5:    
                JOptionPane.showMessageDialog(null,"MacMax");
                break;    
            default:    
                JOptionPane.showMessageDialog(null,"pedido inválido");
                break;
        }
        
        
    }
}
