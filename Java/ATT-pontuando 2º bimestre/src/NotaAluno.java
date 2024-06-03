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
public class NotaAluno extends JFrame{
    
    //Criar variáveis de JLabel
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, maiorNota, menorNota, mediaNota;
    
    //Criar variáveis de JTextField
    JTextField texto1, texto2, texto3, texto4;
    
    //Criar variáveis de JButton
    JButton calcular, limpar, fechar;
 //-----------------------------------------------------------------------------    
    //Método construtor
    public NotaAluno(){
               
        //Define o título da janela
        super("Média dos alunos");
        
        //Cria o container tela 
        Container tela = getContentPane();
        
        //Define o layout como nulo
        setLayout(null);
        
        // Define a cor de background para o container tela
        tela.setBackground(Color.WHITE);
     //-------------------------------------------------------------------------     
        //Armazena novos JLabel dentro das variáveis de rótulo, com texto
        rotulo1 = new JLabel("Nota 1: ");
        rotulo2 = new JLabel("Nota 2: ");
        rotulo3 = new JLabel("Nota 3: ");
        rotulo4 = new JLabel("Nota 4: ");
        
        /*Armazena novos JTextField dentro das variáveis de caixa e texto, 
        5 colunas*/
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        texto4 = new JTextField(5);
        
        //Armazena novo JLabel dentro da variável de exibição de resultado
        maiorNota = new JLabel("");
        menorNota = new JLabel("");
        mediaNota= new JLabel("");
                
        //Armazena novos JButton dentro das variáveis de botões
        calcular = new JButton("Calcular");
        limpar = new JButton("Limpar");
        fechar = new JButton("fechar");
        
     //-------------------------------------------------------------------------       
        //Define dimensão e posição dos rótulos
        rotulo1.setBounds(50,30,60,20); 
        rotulo2.setBounds(50,80,60,20);
        rotulo3.setBounds(50,130,60,20);
        rotulo4.setBounds(50,180,60,20);
        
        //Define dimensão e posição das caixas de texto
        texto1.setBounds(120,20,200,40); 
        texto2.setBounds(120,70,200,40);
        texto3.setBounds(120,120,200,40);
        texto4.setBounds(120,170,200,40);
        
        //Define dimensão e posição do texto de resultado
        maiorNota.setBounds(330,30,200,20);
        menorNota.setBounds(330,80,200,20);
        mediaNota.setBounds(330,130,250,20);
        
        //Define dimensão e posição do botão
        calcular.setBounds(125,240,150,35);
        
        //Define dimensão e posição do botão
        limpar.setBounds(125,280,150,35);
        
        //Define dimensão e posição do botão de fechar programa e cor do texto
        fechar.setBounds(125,320,150,30);
     //-------------------------------------------------------------------------
     //Definindo o estilo dos rótulos
     rotulo1.setForeground(Color.BLUE);
     rotulo1.setFont(new Font("Arial",Font.BOLD,13));
     
     rotulo2.setForeground(Color.BLUE);
     rotulo2.setFont(new Font("Arial",Font.BOLD,13));
     
     rotulo3.setForeground(Color.BLUE);
     rotulo3.setFont(new Font("Arial",Font.BOLD,13));
     
     rotulo4.setForeground(Color.BLUE);
     rotulo4.setFont(new Font("Arial",Font.BOLD,13));
     
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
     
     //Define o estilo da caixa de texto 4
     texto4.setBorder(new RoundedBorder(10));
     texto4.setForeground(Color.BLACK);
     texto4.setOpaque(false);
     texto4.setBackground(new Color(0, 0, 0, 0));
     
     //Define estilo do botão de calcular
     calcular.setForeground(Color.blue);
     calcular.setBorder(new RoundedBorder(40));
     calcular.setOpaque(false);
     calcular.setBackground(new Color(0, 0, 0, 0));
     
     //Define estilo do botão de limpar
     limpar.setForeground(Color.blue);
     limpar.setBorder(new RoundedBorder(40));
     limpar.setOpaque(false);
     limpar.setBackground(new Color(0, 0, 0, 0));
     
     //Define estilo do botão de fechar
     fechar.setForeground(Color.red);
     fechar.setBorder(new RoundedBorder(40));
     fechar.setOpaque(false);
     fechar.setBackground(new Color(0, 0, 0, 0));
     //-------------------------------------------------------------------------    
        //Define a função que será executada no botão calcular
        calcular.addActionListener((ActionEvent e) -> {
            // Cria 7 variáveis
            double n1, n2, n3, n4, min, max, med;
    
            // Inicializa variáveis
            min = 0;
            max = 0;
            med = 0;
    
            // Armazena os números que estão na caixa de texto nas variáveis
            n1 = Double.parseDouble(texto1.getText());
            n2 = Double.parseDouble(texto2.getText());
            n3 = Double.parseDouble(texto3.getText());
            n4 = Double.parseDouble(texto4.getText());
    
            // Calcula a média
            med = (n1 + n2 + n3 + n4) / 4;
    
            // Faz que o resultado seja visível
            maiorNota.setVisible(true);
            menorNota.setVisible(true);
            mediaNota.setVisible(true);
    
            // Cria um array com as notas
            double[] notas = {n1, n2, n3, n4};
    
            // Inicializa max e min com o primeiro valor do array
            max = notas[0];
            min = notas[0];
    
            // Encontra o valor máximo e mínimo no array
            for (double nota : notas) {
                if (nota > max) {
                    max = nota;
                }
                if (nota < min) {
                    min = nota;
                }
            }
    
            // Define os textos das labels
            maiorNota.setText("Sua maior nota é: " + max);
            menorNota.setText("Sua menor nota é: " + min);
            if(med<7){
                mediaNota.setText("Sua média é: " +String.format("%.2f", med) + " Você foi reprovado");
            }else{
                mediaNota.setText("Sua média é: " +String.format("%.2f", med) + " Você foi aprovado");
            }
        }
);
        //Define a função que será executada no botão limpar
        limpar.addActionListener((ActionEvent e) -> {
            
            //Limpa as caixas de texto
            texto1.setText(null); 
            texto2.setText(null);
            texto3.setText(null); 
            texto4.setText(null);
        });
        
        //Define a função que será executada no botão fechar
        fechar.addActionListener((ActionEvent e) -> {
            
            //Fecha o programa
            System.exit(0);
        });
     //-------------------------------------------------------------------------       
        //Deixa o texto de resultado invisível
        maiorNota.setVisible(false);
        menorNota.setVisible(false);
        mediaNota.setVisible(false);
        
        JLabel[] rotulosTela = {rotulo1, rotulo2, rotulo3, rotulo4, maiorNota, menorNota, mediaNota};
        for(JLabel i: rotulosTela){tela.add(i);}
        
        JTextField[] caixasTextoTela = {texto1, texto2, texto3, texto4};
        for(JTextField i: caixasTextoTela){tela.add(i);}
        
        JButton[] botoesTela = {calcular, limpar, fechar};
        for(JButton i: botoesTela){tela.add(i);}

     //-------------------------------------------------------------------------       
     //Define a dimensão da janela quando ela for aberta
     setSize(600, 400);
     
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
    NotaAluno app = new NotaAluno();
        
    //Executa o objeto app e define a operação para fechar(botões no canto)
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//------------------------------------------------------------------------------   

