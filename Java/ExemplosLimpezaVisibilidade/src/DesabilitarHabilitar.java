//------------------------------------------------------------------------------
//Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//------------------------------------------------------------------------------
//Cria uma classe extendendo a classe JFrame
public class DesabilitarHabilitar extends JFrame{
    
    //Criar variáveis de JLabel
    JLabel rotulo1, rotulo2;
    //Criar variáveis de JButton
    JButton desabilitar, habilitar;
 
 //-----------------------------------------------------------------------------
    //Método construtor
    public DesabilitarHabilitar(){
        
        //Define o título da janela 
        super("Exemplo de Desabilitar e Habilitar componentes");
    
        //Cria o container tela 
        Container tela = getContentPane();
    
        //Define o layout como nulo
        setLayout(null);
     //-------------------------------------------------------------------------
        //Armazena novos JLabel dentro das variáveis de rótulo, com texto
        rotulo1 = new JLabel("Rótulo 1"); 
        rotulo2 = new JLabel("Rótulo 2");
    
        //Armazena novos JButton dentro das variáveis de botões
        desabilitar = new JButton("Desabilitar"); 
        habilitar = new JButton("Habilitar");
     //-------------------------------------------------------------------------
        //Define dimensão e posição dos rótulos
        rotulo1.setBounds(50,20,100,20); 
        rotulo2.setBounds(50,60, 100,20); 
    
        //Define dimensão e posição dos botões
        desabilitar.setBounds(80,100,100,20); 
        habilitar.setBounds(250,100,100,20);
     //-------------------------------------------------------------------------
     //Define a função que será executada no botão desabilitar
        desabilitar.addActionListener((ActionEvent e) -> {
            rotulo1.setEnabled(false);
            rotulo2.setEnabled(false);
        });
        //Define a função que será executada no botão habilitar
        habilitar.addActionListener((ActionEvent e) -> {
            rotulo1.setEnabled(true);
            rotulo2.setEnabled(true);
        });
     //------------------------------------------------------------------------- 
        //Adiciona os rótulos na tela
        tela.add(rotulo1); 
        tela.add(rotulo2); 
     
        //Adiciona os botões na tela
        tela.add(desabilitar); 
        tela.add(habilitar);
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
        DesabilitarHabilitar app = new DesabilitarHabilitar();
        
        //Executa o objeto app e define a operação para fechar(botões no canto)
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//------------------------------------------------------------------------------ 