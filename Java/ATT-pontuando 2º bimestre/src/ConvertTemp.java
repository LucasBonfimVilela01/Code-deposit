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
public class ConvertTemp extends JFrame {
    
    //Criar variáveis de JLabel
    JLabel rotulo1, exibirKelvin, exibirFahrenheit;
    
    //Criar variáveis de JTextField
    JTextField texto1;
    
    //Criar variáveis de JButton
    JButton converter, fechar;
    
    //Método construtor
    public ConvertTemp() {
        
        //Define o título da janela
        super("Conversor de Temperatura");
        
        //Cria o container tela 
        Container tela = getContentPane();
        
        //Define o layout como nulo
        setLayout(null);
        
        //Armazena novos JLabel dentro das variáveis de rótulo, com texto
        rotulo1 = new JLabel("   Temperatura em Celsius: ");
        
        //Armazena novos JTextField dentro das variáveis de caixa e texto, 5 colunas
        texto1 = new JTextField(5);
        
        //Armazena novo JLabel dentro da variável de exibição de resultado
        exibirKelvin = new JLabel("");
        exibirFahrenheit = new JLabel("");
                
        //Armazena novos JButton dentro das variáveis de botões
        converter = new JButton("Converter");
        fechar = new JButton("Fechar");
        
        //Define dimensão e posição dos rótulos
        rotulo1.setBounds(100, 30, 200, 20); 
        
        //Define dimensão e posição das caixas de texto
        texto1.setBounds(100, 50, 200, 40); 
        
        //Define dimensão e posição do texto de resultado
        exibirKelvin.setBounds(30, 100, 350, 20); 
        exibirFahrenheit.setBounds(30, 120, 350, 20); 
        
        //Define dimensão e posição do botão
        converter.setBounds(110, 160, 180, 35);
        
        //Define dimensão e posição do botão de fechar programa e cor do texto
        fechar.setBounds(125, 210, 150, 30);
        
        //Define o estilo do rótulo 1
        rotulo1.setFont(new Font("Arial", Font.BOLD, 13));
        rotulo1.setForeground(Color.BLUE);
        
        //Define o estilo da caixa de texto 1
        texto1.setBorder(new RoundedBorder(10));
        texto1.setForeground(Color.BLACK);
        texto1.setOpaque(false);
        texto1.setBackground(new Color(0, 0, 0, 0));
        
        //Define estilo do botão de converter
        converter.setForeground(Color.blue);
        converter.setBorder(new RoundedBorder(40));
        converter.setOpaque(false);
        converter.setBackground(new Color(0, 0, 0, 0));
        
        //Define estilo do botão de fechar
        fechar.setForeground(Color.red);
        fechar.setBorder(new RoundedBorder(40));
        fechar.setOpaque(false);
        fechar.setBackground(new Color(0, 0, 0, 0));
        
        //Define a função que será executada no botão converter
        converter.addActionListener((ActionEvent e) -> {
            //Cria variáveis
            double celsius, kelvin, fahrenheit;
            
            //Armazena o número que está na caixa de texto na variável
            celsius = Double.parseDouble(texto1.getText());
            
            //Calcula os valores
            kelvin = celsius + 273.15;
            fahrenheit = celsius * 9/5 + 32;
            
            //Faz que o resultado seja visível
            exibirKelvin.setVisible(true);
            exibirFahrenheit.setVisible(true);
            
            exibirKelvin.setText("A temperatura em Kelvin é: " + String.format("%.2f", kelvin));
            exibirFahrenheit.setText("A temperatura em Fahrenheit é: " + String.format("%.2f", fahrenheit));
        });
        
        //Define a função que será executada no botão fechar
        fechar.addActionListener((ActionEvent e) -> {
            //Fecha o programa
            System.exit(0);
        });
        
        //Deixa o texto de resultado invisível
        exibirKelvin.setVisible(false);
        exibirFahrenheit.setVisible(false);
        
        //Adiciona os rótulos na tela
        tela.add(rotulo1); 
        
        //Adiciona as caixas de texto na tela
        tela.add(texto1); 
        
        //Adiciona o texto de resultado na tela
        tela.add(exibirKelvin);
        tela.add(exibirFahrenheit);
        
        //Adiciona os botões de operação na tela
        tela.add(converter); 
        
        //Adiciona o botão de fechar programa na tela
        tela.add(fechar);
        
        //Define a dimensão da janela quando ela for aberta
        setSize(400, 300);
        
        //Deixa a janela visível
        setVisible(true);
        
        //Define que o usuário não pode redimensionar a janela
        setResizable(false);
        
        //Define que a janela estará no centro da tela
        setLocationRelativeTo(null);
        
        //Define uma cor de background para o container tela
        tela.setBackground(Color.LIGHT_GRAY);
    }
    
    //Método main
    public static void main(String[] args) {
        //Cria o objeto "app" a partir do método calc
        ConvertTemp app = new ConvertTemp();
        
        //Executa o objeto app e define a operação para fechar(botões no canto)
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//------------------------------------------------------------------------------
