//------------------------------------------------------------------------------
//Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
//------------------------------------------------------------------------------
//Classe para arredondar borda
class RoundedBorder implements Border {
    private final int radius;

    RoundedBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius + 5, this.radius + 10, this.radius + 5, this.radius + 10);
    }

    @Override
    public boolean isBorderOpaque() {
        return false; 
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(c.getForeground()); 
        
        if (!c.isOpaque()) {
            g2.setColor(c.getBackground());
            g2.fillRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
        
        g2.setColor(c.getForeground());
        g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}

//Cria uma classe extendendo a classe JFrame
public class Bhaskara extends JFrame{
    
    //Criar variáveis de JLabel
    JLabel rotulo1, rotulo2, rotulo3, exibir1, exibir2;
    
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
        rotulo1 = new JLabel("Valor a: ");
        rotulo2 = new JLabel("Valor b: ");
        rotulo3 = new JLabel("Valor c: ");
        
        /*Armazena novos JTextField dentro das variáveis de caixa e texto, 
        5 colunas*/
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        
        //Armazena novo JLabel dentro da variável de exibição de resultado
        exibir1 = new JLabel("");
        exibir2 = new JLabel("");
                
        //Armazena novos JButton dentro das variáveis de botões, com ícone
        calcular = new JButton("Calcular");
        fechar = new JButton("fechar");
        
     //-------------------------------------------------------------------------       
        //Define dimensão e posição dos rótulos
        rotulo1.setBounds(50,30,60,20); 
        rotulo2.setBounds(50,80,60,20);
        rotulo3.setBounds(50,130,60,20);
        
        //Define dimensão e posição das caixas de texto
        texto1.setBounds(120,20,200,40); 
        texto2.setBounds(120,70,200,40);
        texto3.setBounds(120,120,200,40);
        
        //Define dimensão e posição do texto de resultado
        exibir1.setBounds(50,170,200,20);
        exibir2.setBounds(50,210,200,20);
        
        //Define dimensão e posição do botão
        calcular.setBounds(125,240,150,35);
        
        //Define dimensão e posição do botão de fechar programa e cor do texto
        fechar.setBounds(125,280,150,30);
     //-------------------------------------------------------------------------
     //Definindo o estilo dos rótulos
     rotulo1.setForeground(Color.BLUE);
     rotulo1.setFont(new Font("Arial",Font.BOLD,13));
     
     rotulo2.setForeground(Color.BLUE);
     rotulo2.setFont(new Font("Arial",Font.BOLD,13));
     
     rotulo3.setForeground(Color.BLUE);
     rotulo3.setFont(new Font("Arial",Font.BOLD,13));
     
     ////Define o estilo da caixa de texto 1
     texto1.setBorder(new RoundedBorder(10));
     texto1.setForeground(Color.BLACK);
     texto1.setOpaque(false);
     texto1.setBackground(new Color(0, 0, 0, 0));
    
     //Define o estilo da caixa de texto 2
     texto2.setBorder(new RoundedBorder(10));
     texto2.setForeground(Color.BLACK);
     texto2.setOpaque(false);
     texto2.setBackground(new Color(0, 0, 0, 0));
     
     //Define o estilo da caixa de texto 3
     texto3.setBorder(new RoundedBorder(10));
     texto3.setForeground(Color.BLACK);
     texto3.setOpaque(false);
     texto3.setBackground(new Color(0, 0, 0, 0));
     
     //Define estilo do botão de calcular
     calcular.setForeground(Color.blue);
     calcular.setBorder(new RoundedBorder(40));
     calcular.setOpaque(false);
     calcular.setBackground(new Color(0, 0, 0, 0));
        
     //Define estilo do botão de fechar
     fechar.setForeground(Color.red);
     fechar.setBorder(new RoundedBorder(40));
     fechar.setOpaque(false);
     fechar.setBackground(new Color(0, 0, 0, 0));
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
            exibir1.setVisible(true);
            exibir2.setVisible(true);
            
            //Define o texto de resultado como o resultado da operação
            if(delta >=0){
                
                //Calcula o X1
                xi = (-b+Math.sqrt(delta))/(2*a);
                
                //Calcula o X2
                xii = (-b-Math.sqrt(delta))/(2*a);
                
                //Define o texto de resultado como o resultado das operações
                exibir1.setText("XI = "+String.format("%.5f", xi));
                exibir2.setText("XI = "+String.format("%.5f", xii));
            }
            else{
                
                /*Define o texto de resultado quando não tiver uma resposta 
                possível*/
                exibir1.setText("Solução não existe");
            }
        });
        
        //Define a função que será executada no botão fechar
        fechar.addActionListener((ActionEvent e) -> {
            
            //Fecha o programa
            System.exit(0);
        });
     //-------------------------------------------------------------------------       
        //Deixa o texto de resultado invisível
        exibir1.setVisible(false);
        exibir2.setVisible(false);
        
        JLabel[] rotulosTela = {rotulo1, rotulo2, rotulo3, exibir1, exibir2};
        for(JLabel i: rotulosTela){tela.add(i);}
        
        JTextField[] caixasTextoTela = {texto1, texto2, texto3};
        for(JTextField i: caixasTextoTela){tela.add(i);}
        
        JButton[] botoesTela = {calcular, fechar};
        for(JButton i: botoesTela){tela.add(i);}

     //-------------------------------------------------------------------------       
     //Define a dimensão da janela quando ela for aberta
     setSize(400, 400);
     
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

