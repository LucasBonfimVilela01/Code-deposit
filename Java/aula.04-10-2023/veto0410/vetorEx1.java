
import javax.swing.JOptionPane;


public class vetorEx1 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        
        for (int i = 0; i < 10; i++) {
             nomes[i]=JOptionPane.showInputDialog("Digite o "+(i+1)+"° nome:");
             
        }
        for (int i = 0; i < 10; i++) {
             JOptionPane.showMessageDialog(null, "o "+(i+1)+"° nome é: "+nomes[i]);
             
        }
    }
}
