//------------------------------------------------------------------------------
//Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//------------------------------------------------------------------------------
//Cria uma classe extendendo a classe JFrame
public class Pitágoras extends JFrame{
    
    //Criar variáveis de JLabel
    JLabel rotulo1, rotulo2, exibir;
    
    //Criar variáveis de JTextField
    JTextField texto1, texto2;
    
    //Criar variáveis de JButton
    JButton calcular, fechar;
 //-----------------------------------------------------------------------------    
    //Método construtor
    public Pitágoras(){
        
        //Define o título da janela
        super("Calculadora de Pitágoras");
        
        //Cria o container tela 
        Container tela = getContentPane();
        
        //Define o layout como nulo
        setLayout(null);
     //-------------------------------------------------------------------------     
        //Armazena novos JLabel dentro das variáveis de rótulo, com texto
        rotulo1 = new JLabel("cateto 1: ");
        rotulo2 = new JLabel("cateto 2: ");
        
        /*Armazena novos JTextField dentro das variáveis de caixa e texto, 
        5 colunas*/
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        //Armazena novo JLabel dentro da variável de exibição de resultado
        exibir = new JLabel("");
                
        //Armazena novos JButton dentro das variáveis de botões, com ícone
        calcular = new JButton("Calcular");
        fechar = new JButton("fechar");
        
     //-------------------------------------------------------------------------       
        //Define dimensão e posição dos rótulos
        rotulo1.setBounds(50,20,100,20); 
        rotulo2.setBounds(50,40,100,20);
        
        //Define dimensão e posição das caixas de texto
        texto1.setBounds(120,20,200,20); 
        texto2.setBounds(120,40,200,20);
        
        //Define dimensão e posição do texto de resultado
        exibir.setBounds(50,80,300,20); 
        
        //Define dimensão e posição do botão
        calcular.setBounds(140,180,120,20);
        
        //Define dimensão e posição do botão de fechar programa e cor do texto
        fechar.setBounds(140,220,120,20);
        fechar.setForeground(Color.red);
     //-------------------------------------------------------------------------
     //Definindo a cor do texto dos rótulos
     rotulo1.setForeground(new Color(255,50,255));
     rotulo2.setForeground(new Color(255,120,155));
     
     //Define a fonte, estilo e tamanho do texto
     rotulo1.setFont(new Font("Arial",Font.BOLD,13));
     rotulo2.setFont(new Font("Arial",Font.BOLD,13));
     //-------------------------------------------------------------------------    
        //Define a função que será executada no botão calcular
        calcular.addActionListener((ActionEvent e) -> {
            
            //Cria 3 variáveis
            double a, b, hipotenusa;
            
            //Limpa a variável hipotenusa
            hipotenusa=0;
            
            //Armazena os números que estão na caixa de texto nas variáveis
            a = Double.parseDouble(texto1.getText());
            b = Double.parseDouble(texto2.getText());
            
            //Calcula o valor da hipotenusa
            hipotenusa = Math.sqrt(( Math.pow(a, 2) + Math.pow(b, 2) ));
            
            //Faz que o resultado seja visível
            exibir.setVisible(true);
            
            //Define o texto de resultado como o resultado da operação
             exibir.setText("A medida da hipotenusa é: "+String.format("%.3f", hipotenusa));
            
        });
        
        //Define a função que será executada no botão fechar
        fechar.addActionListener((ActionEvent e) -> {
            
            //Fecha o programa
            System.exit(0);
        });
     //-------------------------------------------------------------------------       
        //Deixa o texto de resultado invisível
        exibir.setVisible(false);
        
        //Adiciona os rotulos na tela
        tela.add(rotulo1); 
        tela.add(rotulo2);
        
        //Adiciona as caixas de texto na tela
        tela.add(texto1); 
        tela.add(texto2);
        
        //Adiciona o texto de resultado na tela
        tela.add(exibir);
        
        //Adiciona os botões de operação na tela
        tela.add(calcular); 
        
        //Adiciona o botão de fechar programa na tela
        tela.add(fechar);
     //-------------------------------------------------------------------------       
     //Define a dimensão da janela quando ela for aberta
     setSize(400, 300);
     
     //Deixa a janela visível
     setVisible(true);
     
     //Define que o usuário não pode redimensionar a janela
     setResizable(false);
     
     //Define que a janela estara no centro da tela
     setLocationRelativeTo(null);
     
     //Define uma cor de bakcgroun para o background
     tela.setBackground(Color.LIGHT_GRAY);
     //-------------------------------------------------------------------------    
    }
//Método main
public static void main(String[] args) {
        
    //Cria o objeto "app" a partir do método calc
    Pitágoras app = new Pitágoras();
        
    //Executa o objeto app e define a operação para fechar(botões no canto)
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//------------------------------------------------------------------------------   


