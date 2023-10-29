/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exemplo4 {
    public static void main(String[] args) {
        char letras[] = { 'A', 'B', 'C', 'D', 'E'};
        int i;
        for ( i=0; i<letras.length; i++){
            if( letras[i] == 'E'){
            break;
        }
        }
        System.out.println("Ùltimo índice: " +i);
    }
}
