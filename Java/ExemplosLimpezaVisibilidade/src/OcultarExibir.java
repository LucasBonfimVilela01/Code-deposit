//------------------------------------------------------------------------------
//Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//------------------------------------------------------------------------------
//Cria uma classe extendendo a classe JFrame
public class OcultarExibir extends JFrame{
    
    //Criar variáveis de JLabel
    JLabel rotulo1, rotulo2;
    
    //Criar variáveis de JButton
    JButton ocultar, exbir;
 //-----------------------------------------------------------------------------    
    //Método construtor
    public OcultarExibir(){
        
        //Define o título da janela
        super("Exemplo de ocultar e exibir componente");
        
        //Cria o container tela 
        Container tela = getContentPane();
        
        //Define o layout como nulo
        setLayout(null);
     //-------------------------------------------------------------------------
        //Armazena novos JLabel dentro das variáveis de rótulo, com texto
        rotulo1 = new JLabel("Rótulo 1"); 
        rotulo2 = new JLabel("Rótulo 2");
        
        //Armazena novos JButton dentro das variáveis de botões
        ocultar = new JButton("Ocultar "); 
        exbir = new JButton("Exibir "); 
     //-------------------------------------------------------------------------  
        //Define dimensão e posição dos rótulos
        rotulo1.setBounds(50,20,100,20); 
        rotulo2.setBounds(50,60, 100,20);
        
         //Define dimensão e posição dos botões
        ocultar.setBounds(100, 100,80,20); 
        exbir.setBounds(250, 100,80,20);
     //-------------------------------------------------------------------------
        //Define a função que será executada no botão ocultar
        ocultar.addActionListener((ActionEvent e) -> {
            //Define a visibilidade dos rótulos como falso
            rotulo1.setVisible(false);
            rotulo2.setVisible(false);
        });
        //Define a função que será executada no botão exibir
        exbir.addActionListener((ActionEvent e) -> {
            //Define a visibilidade dos rótulos como verdadeiro
            rotulo1.setVisible(true);
            rotulo2.setVisible(true);
        });
     //-------------------------------------------------------------------------
        //Adiciona os rótulos na tela
        tela.add(rotulo1); 
        tela.add(rotulo2); 
        
        //Adiciona os botões na tela
        tela.add(ocultar); 
        tela.add(exbir);
     //-------------------------------------------------------------------------
        //Define a dimensão da janela quando ela for aberta
        setSize(400, 250);
        
        //Deixa  a janela visível
        setVisible(true);
     //-------------------------------------------------------------------------
    }
    //Método main
    public static void main(String args[]){
        
        //Cria o objeto "app" a partir do método OcultarExibir
        OcultarExibir app = new OcultarExibir();
        
        //Executa o objeto app e define a operação para fechar(botões no canto)
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//------------------------------------------------------------------------------   

        