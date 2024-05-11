import javax.swing.JOptionPane;

public class Testa_Funcionário {
    
    public static void main(String[] args) {
        int loop=1;
        int menu=0;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n 1-Verificar Helena \n 2-Verificar Mário \n 3-Sair"));            
            switch(menu){
                case 1:
                    Funcionário funcionario = new Funcionário("Helena Reis", 1965, 4000);
                    funcionario.Informar_Salário();
                    funcionario.CalcularIdade();
                break;
                case 2:
                    Funcionário funcionario2 = new Funcionário("Mário Sá", 1970, 3000);
                    funcionario2.Informar_Salário();
                    funcionario2.CalcularIdade();
                break;
                case 3:
                    loop++;
                default:
                    JOptionPane.showMessageDialog(null,"Valor inválido");
                break;
            }
        } while (loop==1);
    }
}
