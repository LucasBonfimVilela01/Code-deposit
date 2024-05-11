//------------------------------------------------------------------------------
//Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//------------------------------------------------------------------------------
//Cria uma classe extendendo a classe JFrame
public class Bhaskara extends JFrame{
    
    //Criar variáveis de JLabel
    JLabel rotulo1, rotulo2, rotulo3, exibir;
    
    //Criar variáveis de JTextField
    JTextField texto1, texto2, texto3;
    
    //Criar variáveis de JButton
    JButton calcular, fechar;
 //-----------------------------------------------------------------------------    
    //Método construtor
    public Bhaskara(){
        
        
        //Define o título da janela
        super("Calculadora de Bhaskara");
        
        //Cria o container tela 
        Container tela = getContentPane();
        
        //Define o layout como nulo
        setLayout(null);
     //-------------------------------------------------------------------------     
        //Armazena novos JLabel dentro das variáveis de rótulo, com texto
        rotulo1 = new JLabel("a: ");
        rotulo2 = new JLabel("b: ");
        rotulo3 = new JLabel("c: ");
        
        /*Armazena novos JTextField dentro das variáveis de caixa e texto, 
        5 colunas*/
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        
        //Armazena novo JLabel dentro da variável de exibição de resultado
        exibir = new JLabel("");
                
        //Armazena novos JButton dentro das variáveis de botões, com ícone
        calcular = new JButton("Calcular");
        fechar = new JButton("fechar");
        
     //-------------------------------------------------------------------------       
        //Define dimensão e posição dos rótulos
        rotulo1.setBounds(50,20,100,20); 
        rotulo2.setBounds(50,40,100,20);
        rotulo3.setBounds(50,60,100,20);
        
        //Define dimensão e posição das caixas de texto
        texto1.setBounds(120,20,200,20); 
        texto2.setBounds(120,40,200,20);
        texto3.setBounds(120,60,200,20);
        
        //Define dimensão e posição do texto de resultado
        exibir.setBounds(50,140,200,20); 
        
        //Define dimensão e posição do botão
        calcular.setBounds(140,180,120,20);
        
        //Define dimensão e posição do botão de fechar programa e cor do texto
        fechar.setBounds(140,220,120,20);
        fechar.setForeground(Color.red);
     //-------------------------------------------------------------------------
     //Definindo a cor do texto dos rótulos
     rotulo1.setForeground(new Color(255,50,255));
     rotulo2.setForeground(new Color(255,120,155));
     rotulo3.setForeground(new Color(255,255,50));
     
     //Define a fonte, estilo e tamanho do texto
     rotulo1.setFont(new Font("Arial",Font.BOLD,13));
     rotulo2.setFont(new Font("Arial",Font.BOLD,13));
     rotulo3.setFont(new Font("Arial",Font.BOLD,13));
     //-------------------------------------------------------------------------    
        //Define a função que será executada no botão calcular
        calcular.addActionListener((ActionEvent e) -> {
            
            //Cria 6 variáveis
            double a, b, c, delta, xi, xii;
            
            //Limpa a variável delta
            delta=0;
            
            //Armazena os números que estão na caixa de texto nas variáveis
            a = Double.parseDouble(texto1.getText());
            b = Double.parseDouble(texto2.getText());
            c = Double.parseDouble(texto3.getText());
            
            //Calcula o valor de delta
            delta=b*b-4*a*c;
            
            //Faz que o resultado seja visível
            exibir.setVisible(true);
            
            //Define o texto de resultado como o resultado da operação
            if(delta >=0){
                
                //Calcula o X1
                xi = (-b+Math.sqrt(delta))/(2*a);
                
                //Calcula o X2
                xii = (-b-Math.sqrt(delta))/(2*a);
                
                //Define o texto de resultado como o resultado das operações
                exibir.setText("XI = "+String.format("%.5f", xi)+
                           "\n XII = "+String.format("%.5f", xii));
            }
            else{
                
                /*Define o texto de resultado quando não tiver uma resposta 
                possível*/
                exibir.setText("Solução não existe");
            }
        });
        
        //Define a função que será executada no botão fechar
        fechar.addActionListener((ActionEvent e) -> {
            
            //Fecha o programa
            System.exit(0);
        });
     //-------------------------------------------------------------------------       
        //Deixa o texto de resultado invisível
        exibir.setVisible(false);
        
        JLabel[] rotulosTela = {rotulo1, rotulo2, rotulo3, exibir};
        for(JLabel i: rotulosTela){tela.add(i);}
        
        JTextField[] caixasTextoTela = {texto1, texto2, texto3};
        for(JTextField i: caixasTextoTela){tela.add(i);}
        
        JButton[] botoesTela = {calcular, fechar};
        for(JButton i: botoesTela){tela.add(i);}
        
/*
        //Adiciona os rotulos na tela
        tela.add(rotulo1); 
        tela.add(rotulo2);
        tela.add(rotulo3);
        
        //Adiciona as caixas de texto na tela
        tela.add(texto1); 
        tela.add(texto2);
        tela.add(texto3);
        
        //Adiciona o texto de resultado na tela
        tela.add(exibir);
        
        //Adiciona os botões de operação na tela
        tela.add(calcular); 
        
        //Adiciona o botão de fechar programa na tela
        tela.add(fechar);
*/

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
    Bhaskara app = new Bhaskara();
        
    //Executa o objeto app e define a operação para fechar(botões no canto)
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//------------------------------------------------------------------------------   

