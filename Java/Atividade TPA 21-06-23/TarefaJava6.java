/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaintroducao;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class TarefaJava6 {
    public static void main(String[] args) {
        double montante, capitalInicio, mes1, mes2, mes3;
        capitalInicio=500;
        mes1=capitalInicio+(capitalInicio/100);
        mes2=mes1+(mes1/100);
        mes3=mes2+(mes2/100);       
        System.out.println("A quantia após 3 mesês com taxa de 1% ao mês é: "+mes3);
    }
    
    
}
