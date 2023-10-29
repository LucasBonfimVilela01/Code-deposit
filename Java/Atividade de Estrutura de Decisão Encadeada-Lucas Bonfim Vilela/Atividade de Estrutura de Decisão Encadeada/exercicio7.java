/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;

public class exercicio7 {
    public static void main(String[] args) {
        int ano1, ano2, mes1, mes2, dia1, dia2;
        
        ano1 = Integer.parseInt(JOptionPane.showInputDialog("insira o ano 1"));
        mes1 = Integer.parseInt(JOptionPane.showInputDialog("insira o mes 1"));
        dia1 = Integer.parseInt(JOptionPane.showInputDialog("insira o dia 1"));
        ano2 = Integer.parseInt(JOptionPane.showInputDialog("insira o ano 2"));
        mes2 = Integer.parseInt(JOptionPane.showInputDialog("insira o mes 2"));
        dia2 = Integer.parseInt(JOptionPane.showInputDialog("insira o dia 2"));
        
        if (ano1 == ano2){
            if (mes1 == mes2){
                if (dia1 == dia2){
                    JOptionPane.showMessageDialog(null, "é o mesmo dia!");
                }
                else{
                 if (dia1>dia2){   
                     JOptionPane.showMessageDialog(null, "A sequência é : "+ano1+"/"+mes1+"/"+dia1+" ----> "+ano2+"/"+mes2+"/"+dia2);
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "A sequência é : "+ano1+"/"+mes1+"/"+dia1+" ----> "+ano2+"/"+mes2+"/"+dia2);
                 }
                }
            }
            else{
             if(mes1>mes2){   
                 JOptionPane.showMessageDialog(null, "A sequência é : "+ano1+"/"+mes1+"/"+dia1+" ----> "+ano2+"/"+mes2+"/"+dia2);
             }
             else{
                 JOptionPane.showMessageDialog(null, "A sequência é : "+ano2+"/"+mes2+"/"+dia2+" ----> "+ano1+"/"+mes1+"/"+dia1);
             }
            }
        }
        else{
         if(ano1>ano2){   
          JOptionPane.showMessageDialog(null, "A sequência é : "+ano1+"/"+mes1+"/"+dia1+" ----> "+ano2+"/"+mes2+"/"+dia2);   
         }
         else{
             JOptionPane.showMessageDialog(null, "A sequência é : "+ano2+"/"+mes2+"/"+dia2+" ----> "+ano1+"/"+mes1+"/"+dia1);
         }
        }
    }
}
