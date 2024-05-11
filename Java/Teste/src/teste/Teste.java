package teste;

import javax.swing.*;

public class Teste extends JFrame{
    public Teste(){
        super("Nossa primeira janela");
        setSize(300, 150);
        setVisible(true); 
    }
    public static void main(String args[]){
        Teste app = new Teste();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
}
