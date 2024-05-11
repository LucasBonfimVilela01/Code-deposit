//------------------------------------------------------------------------------
//imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//------------------------------------------------------------------------------
public class Limpeza extends JFrame{
    //Criar variáveis de JLabel
    JLabel rotulo1, rotulo2;
    
    //Criar variáveis de JTextField
    JTextField texto1, texto2;
    
    //Criar variável de JButton
    JButton limpar;
 //-----------------------------------------------------------------------------
    //Método construtor
    public Limpeza(){
        //Define o título da janela
        super("Exemplo Limpar");
        
        //Cria o container tela
        Container tela = getContentPane();
        
        //Define o layout como nule
        setLayout(null);
     //-------------------------------------------------------------------------   
        //Armazena novos JLabel dentro das variáveis de rótulo, com texto
        rotulo1 = new JLabel("1° Número: ");
        rotulo2 = new JLabel("2° Número: ");
        
        //Armazena novo JTextField dentro da variávei de texto, 5 colunas
        texto1 = new JTextField(5); texto2 = new JTextField(5);
        
        //Armazena novo JButton dentro da variável de limpar, com texto
        limpar = new JButton("Limpar");
     //------------------------------------------------------------------------- 
        //Define dimensão e posição dos rótulos
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50,60,100,20);
        
        //Define dimensão e posição dos textos
        texto1.setBounds(120,20,200,20);
        texto2.setBounds(120,60,200,20);
        
        //Define dimensão e posição do botão de limpar
        limpar.setBounds(150,100,80,20);
     //-------------------------------------------------------------------------
     //Define a função que será executada no botão limpar
        limpar.addActionListener((ActionEvent e) -> {
            
            texto1.setText(null); 
            texto2.setText(null);
            
            texto1.requestFocus();
        });
     //-------------------------------------------------------------------------
        //Adiciona os rótulos na tela
        tela.add(rotulo1); 
        tela.add(rotulo2);
        
        //Adiciona os textos na tela
        tela.add(texto1);
        tela.add(texto2);
        
        //Adiciona o botão na tela
        tela.add(limpar);
        
     //-------------------------------------------------------------------------
        //Define a dimensão da janela quando ela for aberta
        setSize(400, 250);
        
        //Deixa a janela visível
        setVisible(true);
     //-------------------------------------------------------------------------
    }
//Método main
public static void main(String args[]){
     
    //Cria o objeto "app" a partir do método Limpeza
    Limpeza app = new Limpeza();
    
    //Executa o objeto app e define a operação para fechar(botões no canto)
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//------------------------------------------------------------------------------