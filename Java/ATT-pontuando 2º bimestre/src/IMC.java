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
public class IMC extends JFrame{
    
    //Criar variáveis de JLabel
    JLabel rotulo1, rotulo2, exibir;
    
    //Criar variáveis de JTextField
    JTextField texto1, texto2;
    
    //Criar variáveis de JButton
    JButton calcular, fechar;
 //-----------------------------------------------------------------------------    
    //Método construtor
    public IMC(){
        
        //Define o título da janela
        super("Calcule seu IMC");
        
        //Cria o container tela 
        Container tela = getContentPane();
        
        //Define o layout como nulo
        setLayout(null);
     //-------------------------------------------------------------------------     
        //Armazena novos JLabel dentro das variáveis de rótulo, com texto
        rotulo1 = new JLabel("Seu peso: ");
        rotulo2 = new JLabel("Sua altura: ");
        
        /*Armazena novos JTextField dentro das variáveis de caixa e texto, 
        5 colunas*/
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        //Armazena novo JLabel dentro da variável de exibição de resultado
        exibir = new JLabel("");
                
        //Armazena novos JButton dentro das variáveis de botões
        calcular = new JButton("Calcular");
        fechar = new JButton("fechar");
        
     //-------------------------------------------------------------------------       
        //Define dimensão e posição dos rótulos
        rotulo1.setBounds(30,30,80,20); 
        rotulo2.setBounds(30,80,80,20);
        
        //Define dimensão e posição das caixas de texto
        texto1.setBounds(120,20,200,40); 
        texto2.setBounds(120,70,200,40);
        
        //Define dimensão e posição do texto de resultado
        exibir.setBounds(30,120,350,20); 
        
        //Define dimensão e posição do botão
        calcular.setBounds(125,180,150,35);
        
        //Define dimensão e posição do botão de fechar programa e cor do texto
        fechar.setBounds(125,220,150,30);
        
     //-------------------------------------------------------------------------
    //Define o estilo do rótulo 1
     rotulo1.setFont(new Font("Arial",Font.BOLD,13));
     rotulo1.setForeground(Color.BLUE);
    
     //Define o estilo do rótulo 2
     rotulo2.setForeground(Color.BLUE);
     rotulo2.setFont(new Font("Arial",Font.BOLD,13));
     
     //Define o estilo da caixa de texto 1
     texto1.setBorder(new RoundedBorder(10));
     texto1.setForeground(Color.BLACK);
     texto1.setOpaque(false);
     texto1.setBackground(new Color(0, 0, 0, 0));
    
     //Define o estilo da caixa de texto 2
     texto2.setBorder(new RoundedBorder(10));
     texto2.setForeground(Color.BLACK);
     texto2.setOpaque(false);
     texto2.setBackground(new Color(0, 0, 0, 0));
     
     //Define estilo do botão de calcular
     calcular.setForeground(Color.blue);
     calcular.setBorder(new RoundedBorder(40));
     calcular.setOpaque(false);
     calcular.setBackground(new Color(0, 0, 0, 0));
        
     //Define estilo do botão de calcular
     fechar.setForeground(Color.red);
     fechar.setBorder(new RoundedBorder(40));
     fechar.setOpaque(false);
     fechar.setBackground(new Color(0, 0, 0, 0));
     //-------------------------------------------------------------------------    
        //Define a função que será executada no botão calcular
        calcular.addActionListener((ActionEvent e) -> {
            
            //Cria 3 variáveis
            double m, h, imc;
            
            //Limpa a variável imc
            imc=0;
            
            //Armazena os números que estão na caixa de texto nas variáveis
            m = Double.parseDouble(texto1.getText());
            h = Double.parseDouble(texto2.getText());
            
            //Calcula o valor da hipotenusa
            imc = m / ( h * h );
            
            //Faz que o resultado seja visível
            exibir.setVisible(true);
            if(imc<18){
                exibir.setText("O seu IMC é: "+String.format("%.2f", imc)+", você esta abaixo do seu peso ideal");
            }else if(imc<25){
                exibir.setText("O seu IMC é: "+String.format("%.2f", imc)+", você esta no seu peso ideal");
            }else{
                exibir.setText("O seu IMC é: "+String.format("%.2f", imc)+", você esta acima do seu peso ideal");
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
    IMC app = new IMC();
        
    //Executa o objeto app e define a operação para fechar(botões no canto)
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//------------------------------------------------------------------------------   
