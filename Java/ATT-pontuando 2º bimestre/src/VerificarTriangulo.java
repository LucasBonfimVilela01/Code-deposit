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
public class VerificarTriangulo extends JFrame {
    
    //Criar variáveis de JLabel
    JLabel rotulo1, rotulo2, rotulo3;
    
    //Criar variáveis de JTextField
    JTextField texto1, texto2, texto3;
    
    //Criar variáveis de JButton
    JButton verificar, fechar;
    
    //Método construtor
    public VerificarTriangulo() {
        
        //Define o título da janela
        super("Verificador de Triângulo");
        
        //Cria o container tela 
        Container tela = getContentPane();
        
        //Define o layout como nulo
        setLayout(null);
        
        //Armazena novos JLabel dentro das variáveis de rótulo, com texto
        rotulo1 = new JLabel("Lado 1: ");
        rotulo2 = new JLabel("Lado 2: ");
        rotulo3 = new JLabel("Lado 3: ");
        
        //Armazena novos JTextField dentro das variáveis de caixa e texto, 5 colunas
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        
        //Armazena novos JButton dentro das variáveis de botões
        verificar = new JButton("Verificar");
        fechar = new JButton("Fechar");
        
        //Define dimensão e posição dos rótulos
        rotulo1.setBounds(30, 30, 80, 20); 
        rotulo2.setBounds(30, 80, 80, 20);
        rotulo3.setBounds(30, 130, 80, 20);
        
        //Define dimensão e posição das caixas de texto
        texto1.setBounds(120, 20, 200, 40); 
        texto2.setBounds(120, 70, 200, 40);
        texto3.setBounds(120, 120, 200, 40);
        
        //Define dimensão e posição do botão
        verificar.setBounds(125, 220, 150, 35);
        
        //Define dimensão e posição do botão de fechar programa e cor do texto
        fechar.setBounds(125, 270, 150, 30);
        
        //Define o estilo dos rótulos
        rotulo1.setFont(new Font("Arial", Font.BOLD, 13));
        rotulo1.setForeground(Color.BLUE);
        
        rotulo2.setFont(new Font("Arial", Font.BOLD, 13));
        rotulo2.setForeground(Color.BLUE);
        
        rotulo3.setFont(new Font("Arial", Font.BOLD, 13));
        rotulo3.setForeground(Color.BLUE);
        
        //Define o estilo das caixas de texto
        texto1.setBorder(new RoundedBorder(10));
        texto1.setForeground(Color.BLACK);
        texto1.setOpaque(false);
        texto1.setBackground(new Color(0, 0, 0, 0));
        
        texto2.setBorder(new RoundedBorder(10));
        texto2.setForeground(Color.BLACK);
        texto2.setOpaque(false);
        texto2.setBackground(new Color(0, 0, 0, 0));
        
        texto3.setBorder(new RoundedBorder(10));
        texto3.setForeground(Color.BLACK);
        texto3.setOpaque(false);
        texto3.setBackground(new Color(0, 0, 0, 0));
        
        //Define estilo do botão de verificar
        verificar.setForeground(Color.blue);
        verificar.setBorder(new RoundedBorder(40));
        verificar.setOpaque(false);
        verificar.setBackground(new Color(0, 0, 0, 0));
        
        //Define estilo do botão de fechar
        fechar.setForeground(Color.red);
        fechar.setBorder(new RoundedBorder(40));
        fechar.setOpaque(false);
        fechar.setBackground(new Color(0, 0, 0, 0));
        
        //Define a função que será executada no botão verificar
        verificar.addActionListener((ActionEvent e) -> {
            //Cria variáveis
            double lado1, lado2, lado3;
            
            //Armazena os números que estão nas caixas de texto nas variáveis
            lado1 = Double.parseDouble(texto1.getText());
            lado2 = Double.parseDouble(texto2.getText());
            lado3 = Double.parseDouble(texto3.getText());
            
            //Verifica o tipo de triângulo
            String tipoTriangulo = "";
            ImageIcon icon = null;
            if (lado1 == lado2 && lado2 == lado3) {
                tipoTriangulo = "Triângulo Equilátero";
                icon = new ImageIcon("equilatero.png");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                tipoTriangulo = "Triângulo Isósceles";
                icon = new ImageIcon("isosceles.png");
            } else {
                tipoTriangulo = "Triângulo Escaleno";
                icon = new ImageIcon("escaleno.png");
            }
            
            //Exibe o resultado em um JOptionPane
            JOptionPane.showMessageDialog(null, tipoTriangulo,
                    "Resultado", 
                    JOptionPane.INFORMATION_MESSAGE, icon);
        });
        
        //Define a função que será executada no botão fechar
        fechar.addActionListener((ActionEvent e) -> {
            //Fecha o programa
            System.exit(0);
        });
        
        //Adiciona os rótulos na tela
        tela.add(rotulo1); 
        tela.add(rotulo2);
        tela.add(rotulo3);
        
        //Adiciona as caixas de texto na tela
        tela.add(texto1); 
        tela.add(texto2);
        tela.add(texto3);
        
        //Adiciona os botões de operação na tela
        tela.add(verificar); 
        
        //Adiciona o botão de fechar programa na tela
        tela.add(fechar);
        
        //Define a dimensão da janela quando ela for aberta
        setSize(400, 350);
        
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
        VerificarTriangulo app = new VerificarTriangulo();
        
        //Executa o objeto app e define a operação para fechar(botões no canto)
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//------------------------------------------------------------------------------
