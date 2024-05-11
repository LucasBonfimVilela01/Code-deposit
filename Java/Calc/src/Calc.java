//------------------------------------------------------------------------------
//Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//------------------------------------------------------------------------------
//Cria uma classe extendendo a classe JFrame
public class Calc extends JFrame{
    
    //Criar variáveis de JLabel
    JLabel rotulo1, rotulo2, exibir;
    
    //Criar variáveis de JTextField
    JTextField texto1, texto2;
    
    //Criar variáveis de Imageicon
    ImageIcon iconeAdd, iconeSub, iconeDiv, iconeMul, iconeExit;
    
    //Criar variáveis de JButton
    JButton somar, subtrair, dividir, multiplicar, fechar;
 //-----------------------------------------------------------------------------    
    //Método construtor
    public Calc(){
        
        //Define o título da janela
        super("Calculadora simples");
        
        //Cria um objeto a partir de ImageIcon com o endereço da imagem
        ImageIcon icone = new ImageIcon("icone-calc.png");
        
        //Define o ícone da janela como o ícone
        setIconImage(icone.getImage());
        
        //Cria o container tela 
        Container tela = getContentPane();
        
        //Define o layout como nulo
        setLayout(null);
     //-------------------------------------------------------------------------     
        //Armazena novos JLabel dentro das variáveis de rótulo, com texto
        rotulo1 = new JLabel("1° Número: ");
        rotulo2 = new JLabel("2° Número: ");
        
        /*Armazena novos JTextField dentro das variáveis de caixa e texto, 
        5 colunas*/
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        //Armazena novo JLabel dentro da variável de exibição de resultado
        exibir = new JLabel("");
        
        //Armazena novos ImageIcon dentro das variáveis de ícones, com endereço
        iconeAdd = new ImageIcon("icone-add.png");
        iconeSub = new ImageIcon("icone-sub.png");
        iconeDiv = new ImageIcon("icone-div.png");
        iconeMul = new ImageIcon("icone-mul.png");
        iconeExit = new ImageIcon("icone-exit.png");
        
        //Armazena novos JButton dentro das variáveis de botões, com ícone
        somar = new JButton(iconeAdd);
        subtrair = new JButton(iconeSub);
        dividir = new JButton(iconeDiv);
        multiplicar = new JButton(iconeMul);
        fechar = new JButton("fechar",iconeExit);
        
     //-------------------------------------------------------------------------       
        //Define dimensão e posição dos rótulos
        rotulo1.setBounds(50,20,100,20); 
        rotulo2.setBounds(50,60,100,20);
        
        //Define dimensão e posição das caixas de texto
        texto1.setBounds(120,20,200,20); 
        texto2.setBounds(120,60,200,20);
        
        //Define dimensão e posição do texto de resultado
        exibir.setBounds(50,100,200,20); 
        
        //Define dimensão e posição dos botões de operações
        somar.setBounds(160,120,40,40);
        subtrair.setBounds(200,120,40,40);
        dividir.setBounds(160,160,40,40);
        multiplicar.setBounds(200,160,40,40);
        
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
        //Define a função que será executada no botão somar
        somar.addActionListener((ActionEvent e) -> {
            
            //Cria 3 variáveis 
            double numero1, numero2, soma;
            
            //Limpa a variável
            soma=0;
            
            //Armazena os números que estão na caixa de texto nas variáveis
            numero1 = Double.parseDouble(texto1.getText());
            numero2 = Double.parseDouble(texto2.getText());
            
            //Executa a operação
            soma = numero1 + numero2;
            
            //Faz que o resultado seja visível
            exibir.setVisible(true);
            
            //Define o texto de resultado como o resultado da operação
            exibir.setText("A soma é: "+soma);
        });
        
        //Define a função que será executada no botão subtrair
        subtrair.addActionListener((ActionEvent e) -> {
            
            //Cria 3 variáveis 
            double numero1, numero2, sub;
            
            //Limpa a variável
            sub=0;
            
            //Armazena os números que estão na caixa de texto nas variáveis
            numero1 = Double.parseDouble(texto1.getText());
            numero2 = Double.parseDouble(texto2.getText());
            
            //Executa a operação
            sub = numero1 - numero2;
            
            //Faz que o resultado seja visível
            exibir.setVisible(true);
            
            //Define o texto de resultado como o resultado da operação
            exibir.setText("A subtração é: "+sub);
        });
        
        //Define a função que será executada no botão dividir
        dividir.addActionListener((ActionEvent e) -> {
            
            //Cria 3 variáveis 
            double numero1, numero2, div;
            
            //Limpa a variável
            div=0;
            
            //Armazena os números que estão na caixa de texto nas variáveis
            numero1 = Double.parseDouble(texto1.getText());
            numero2 = Double.parseDouble(texto2.getText());
            
            //Executa a operação
            div = numero1 / numero2;
            
            //Faz que o resultado seja visível
            exibir.setVisible(true);
            
            //Define o texto de resultado como o resultado da operação
            exibir.setText("A divisão é: "+div);
        });
        
        //Define a função que será executada no botão dividir
        multiplicar.addActionListener((ActionEvent e) -> {
            
            //Cria 3 variáveis
            double numero1, numero2, multi;
            
            //Limpa a variável
            multi=0;
            
            //Armazena os números que estão na caixa de texto nas variáveis
            numero1 = Double.parseDouble(texto1.getText());
            numero2 = Double.parseDouble(texto2.getText());
            
            //Executa a operação
            multi = numero1 * numero2;
            
            //Faz que o resultado seja visível
            exibir.setVisible(true);
            
            //Define o texto de resultado como o resultado da operação
            exibir.setText("A multiplicação é: "+multi);
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
        tela.add(somar);
        tela.add(subtrair);
        tela.add(dividir);
        tela.add(multiplicar);
        
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
    Calc app = new Calc();
        
    //Executa o objeto app e define a operação para fechar(botões no canto)
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//------------------------------------------------------------------------------   