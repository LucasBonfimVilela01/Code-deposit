
import javax.swing.JOptionPane;

public class testarlampada {
    public static void main(String[] args) {
        lampada Lampada = new lampada();
        Lampada.potencia = 100;
        Lampada.cor = "Verde";
        Lampada.formato = "Oval";
        int loop = 0;
        int option = 0;
        boolean estadoLamp = false;
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções: "
                    + "\n1-Acender lâmpada "
                    + "\n2-Apagar lampâda "
                    + "\n3-Apagar Potência "
                    + "\n4-Verificar Cor "
                    + "\n5-Verificar Formato "
                    + "\n6-Sair do programa"));
            switch(option){
                case 1:
                    estadoLamp = true;
                break;
                case 2:
                    estadoLamp = false;
                break;
                case 3:
                    System.out.println("A potência da lâmpada é: "+Lampada.potencia);
                break;    
                case 4:
                    System.out.println("A cor da lâmpada é: "+Lampada.cor);
                break;
                case 5:
                    System.out.println("O formato da lâmpada é: "+Lampada.formato);
                break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Saindo...");
                    loop++;
                break;    
                default:
                    JOptionPane.showMessageDialog(null,"Valor inválido");
                break;    
            }        
            if(estadoLamp == true){
            Lampada.acender();
            }
            else{
            Lampada.apagar();
            }
        }while(loop<1);
    }
}
