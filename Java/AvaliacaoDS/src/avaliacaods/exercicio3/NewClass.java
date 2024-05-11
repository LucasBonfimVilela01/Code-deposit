/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacaods.exercicio3;

import java.util.LinkedList;
import java.util.List;
public class NewClass {
    public static void main(String[] args) {
        List a = new LinkedList();
        a.add("um");
        a.add( "dois");
        a.add( "três");
        a.add( "quatro");
        a.add("um");
        List b = new LinkedList();
            b.add("um");
        b.add( "um");
        b.add("três");
        a.retainAll (b);// TODO code application
    }

}

