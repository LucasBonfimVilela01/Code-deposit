import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.text.SimpleDateFormat;
import java.util.Date;

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

public class CadastroCliente extends JFrame {

    JLabel lblCodigoCliente, lblNomeCompleto, lblEndereco, lblBairro, lblCidade, lblEstado, lblCEP, lblCelular, lblTelefone, lblDataAniversario, lblDataCadastro;
    JTextField txtNomeCompleto, txtEndereco, txtBairro, txtCidade, txtEstado, txtCEP, txtCelular, txtTelefone, txtDataAniversario, txtDataCadastro;
    JButton btnIncluir, btnLimpar;

    public CadastroCliente() {

        super("Cadastro de Cliente");

        Container tela = getContentPane();
        setLayout(null);

        lblCodigoCliente = new JLabel("Código de Cliente: 12345");
        lblNomeCompleto = new JLabel("Nome completo:");
        lblEndereco = new JLabel("Endereço:");
        lblBairro = new JLabel("Bairro:");
        lblCidade = new JLabel("Cidade:");
        lblEstado = new JLabel("Estado:");
        lblCEP = new JLabel("CEP:");
        lblCelular = new JLabel("Celular:");
        lblTelefone = new JLabel("Telefone:");
        lblDataAniversario = new JLabel("Data de Aniversário:");
        lblDataCadastro = new JLabel("Data de Cadastro:");

        txtNomeCompleto = new JTextField(5);
        txtEndereco = new JTextField(5);
        txtBairro = new JTextField(5);
        txtCidade = new JTextField(5);
        txtEstado = new JTextField(5);
        txtCEP = new JTextField(5);
        txtCelular = new JTextField(5);
        txtTelefone = new JTextField(5);
        txtDataAniversario = new JTextField(5);
        txtDataCadastro = new JTextField(5);
        txtDataCadastro.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        txtDataCadastro.setEditable(false);

        btnIncluir = new JButton("Incluir");
        btnLimpar = new JButton("Limpar");

        lblCodigoCliente.setBounds(30, 30, 200, 20);
        lblNomeCompleto.setBounds(30, 60, 150, 20);
        lblEndereco.setBounds(30, 90, 150, 20);
        lblBairro.setBounds(30, 120, 150, 20);
        lblCidade.setBounds(30, 150, 150, 20);
        lblEstado.setBounds(30, 180, 150, 20);
        lblCEP.setBounds(30, 210, 150, 20);
        lblCelular.setBounds(30, 240, 150, 20);
        lblTelefone.setBounds(30, 270, 150, 20);
        lblDataAniversario.setBounds(30, 300, 150, 20);
        lblDataCadastro.setBounds(30, 330, 150, 20);

        txtNomeCompleto.setBounds(180, 60, 200, 25);
        txtEndereco.setBounds(180, 90, 200, 25);
        txtBairro.setBounds(180, 120, 200, 25);
        txtCidade.setBounds(180, 150, 200, 25);
        txtEstado.setBounds(180, 180, 200, 25);
        txtCEP.setBounds(180, 210, 200, 25);
        txtCelular.setBounds(180, 240, 200, 25);
        txtTelefone.setBounds(180, 270, 200, 25);
        txtDataAniversario.setBounds(180, 300, 200, 25);
        txtDataCadastro.setBounds(180, 330, 200, 25);

        btnIncluir.setBounds(60, 370, 100, 30);
        btnLimpar.setBounds(180, 370, 100, 30);

        btnIncluir.addActionListener((ActionEvent e) -> {
            String info = String.format(
                "Código de Cliente: 12345"
                        + "\nNome completo: %s"
                        + "\nEndereço: %s"
                        + "\nBairro: %s"
                        + "\nCidade: %s"
                        + "\nEstado: %s"
                        + "\nCEP: %s"
                        + "\nCelular: %s"
                        + "\nTelefone: %s"
                        + "\nData de Aniversário: %s"
                        + "\nData de Cadastro: %s",
                txtNomeCompleto.getText(), txtEndereco.getText(), txtBairro.getText(), txtCidade.getText(),
                txtEstado.getText(), txtCEP.getText(), txtCelular.getText(), txtTelefone.getText(),
                txtDataAniversario.getText(), txtDataCadastro.getText()
            );
            JOptionPane.showMessageDialog(null, info, "Informações do Cliente", JOptionPane.INFORMATION_MESSAGE);
        });

        btnLimpar.addActionListener((ActionEvent e) -> {
            txtNomeCompleto.setText(null);
            txtEndereco.setText(null);
            txtBairro.setText(null);
            txtCidade.setText(null);
            txtEstado.setText(null);
            txtCEP.setText(null);
            txtCelular.setText(null);
            txtTelefone.setText(null);
            txtDataAniversario.setText(null);
        });

        tela.add(lblCodigoCliente);
        tela.add(lblNomeCompleto);
        tela.add(lblEndereco);
        tela.add(lblBairro);
        tela.add(lblCidade);
        tela.add(lblEstado);
        tela.add(lblCEP);
        tela.add(lblCelular);
        tela.add(lblTelefone);
        tela.add(lblDataAniversario);
        tela.add(lblDataCadastro);

        tela.add(txtNomeCompleto);
        tela.add(txtEndereco);
        tela.add(txtBairro);
        tela.add(txtCidade);
        tela.add(txtEstado);
        tela.add(txtCEP);
        tela.add(txtCelular);
        tela.add(txtTelefone);
        tela.add(txtDataAniversario);
        tela.add(txtDataCadastro);

        tela.add(btnIncluir);
        tela.add(btnLimpar);

        setSize(450, 450);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        tela.setBackground(Color.LIGHT_GRAY);
    }

    public static void main(String[] args) {
        CadastroCliente app = new CadastroCliente();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
