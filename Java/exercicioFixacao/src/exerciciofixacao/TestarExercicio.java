
package exerciciofixacao;
import javax.swing.*;
import java.awt.*;

public class TestarExercicio extends JFrame{
    /* Parâmetros */
    // Titulo do programa
    JLabel titulo1;
    // Rotulo das caixas de texto
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7;
    // Caixas de texto
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;
    // Botões e icones
    JButton botao1, botao2;
    ImageIcon icone1;
    ImageIcon icone2;
    //Método construtor
    public TestarExercicio(){
         
        // Rotulo da janela
        super("Cadastro de cliente");
        
        // Cria um container para mostrar elementos
        Container tela = getContentPane();
        
        // É feito para o setBounds e os objetos funcionarem, precisa ser "null"
        setLayout(null);
        //----------------------------------------------------------------------
        // Definição de objetos em valores
        
        /*Parâmetro rotulo agora tem o método JLabel armazenado, e passa o 
        texto do titulo*/
        titulo1 = new JLabel ("Cadastro de Cliente");
        //Atributos visuais do título são modificados
        titulo1.setFont(new Font("Arial", Font.BOLD, 20));
        titulo1.setForeground(Color.red);
        /* Parâmetros rotulo agora tem o método JLabel armazenado, e passa o 
        texto do rotulo*/
        rotulo1 = new JLabel ("Nome");
        rotulo2 = new JLabel ("CPF");
        rotulo3 = new JLabel ("RG");
        rotulo4 = new JLabel ("Endereço");
        rotulo5 = new JLabel ("Cidade");
        rotulo6 = new JLabel ("Estado");
        rotulo7 = new JLabel ("CEP:");
        /* Parâmetros texto agora tem o método JtextField armazenado, e passa a 
        quantidade de caracteres de cada campo*/
        texto1 = new JTextField (50);
        texto2 = new JTextField (11);
        texto3 = new JTextField (10);
        texto4 = new JTextField (50);
        texto5 = new JTextField (30);
        texto6 = new JTextField (15);
        texto7 = new JTextField (10);
        /* Parâmetro icone agora tem o método ImageIcon armazenado, e passa o 
        endereço de arquivo das imagens*/
        icone1 = new ImageIcon("abrir-cadeado.png");
        icone2 = new ImageIcon("logout_1828479.png");
        //icone2.paintIcon(null, null, 10, 10);
        /* Parâmetro botão agora tem o método JButton armazenado e passa texto e
        icones*/
        botao1 = new JButton("Enviar", icone1);
        botao2 = new JButton("Cancelar", icone2);
        //----------------------------------------------------------------------
        // Define posição e escala do título
        titulo1.setBounds(150,10,200,20);
        // Define posição e escala dos elementos rotulo
        rotulo1.setBounds(50,40,80,20);
        rotulo2.setBounds(50,80,80,20);
        rotulo3.setBounds(50,120,80,20);
        rotulo4.setBounds(50,160,80,20);
        rotulo5.setBounds(50,200,80,20);
        rotulo6.setBounds(50,240,80,20);
        rotulo7.setBounds(50,280,80,20);
        // Define posição e escala dos elementos texto
        texto1.setBounds(50,60,300,20);
        texto2.setBounds(50,100,150,20);
        texto3.setBounds(50,140,120,20);
        texto4.setBounds(50,180,300,20);
        texto5.setBounds(50,220,250,20);
        texto6.setBounds(50,260,200,20);
        texto7.setBounds(50,300,120,20);
        // Define posição e escala dos elementos botao
        botao1.setBounds(75,350,150,40);
        botao2.setBounds(275,350,150,40);
        //----------------------------------------------------------------------
        //Adiciona o elemento título ao objeto tela
        tela.add(titulo1);
        //Adiciona os elementos rotulo ao objeto tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);       
        //Adiciona os elementos de campo de texto ao objeto tela
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        //Adiciona os elementos botao ao objeto tela
        tela.add(botao1);
        tela.add(botao2);
        //----------------------------------------------------------------------
        setSize(500,450);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
