/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class exercicio_decisao_4 {
    public static void main(String[] args) {
        double peso=0, multa=0;
        
        peso = Double.parseDouble(JOptionPane.showInputDialog("insira o peso dos peixes pescados"));
        
        if(peso>50){
            multa = (peso-50)*4;
            JOptionPane.showMessageDialog(null, "você pescou "+peso+" quilos de peixe, e deve pagar uma multa de : R$"+multa);
        }
        else{
            JOptionPane.showMessageDialog(null, "você pescou "+peso+" quantidade permitida, sem multas");
        }
    }
}
