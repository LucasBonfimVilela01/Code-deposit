
import javax.swing.JOptionPane;

public class testarCarro {
    public static void main(String[] args) {
        carro Carro = new carro();
        Carro.cor = "Preto";
        Carro.modelo = "Hatch";
        Carro.marca = "Fiat";
        Carro.chassi = 112233;
        Carro.ano = 2006;
        int loop = 0;
        int menu;
        boolean estadoCarro = false;
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog
                    ("""
                     Selecione uma das opções:
                     1-Ligar Carro
                     2-Desligar Carro
                     3-Verificar cor
                     4-Verificar modelo
                     5-Verificar marca
                     6-Verificar chassi
                     7-Verificar ano
                     8-Freiar Carro
                     9-Acelerar Carro
                     10-Mudar de marcha
                     11-Sair do programa"""));
            switch(menu){
                case 1 -> estadoCarro = true;
                case 2 -> estadoCarro = false;
                case 3 -> System.out.println("A Cor do carro é: "+Carro.cor+"\n");
                case 4 -> System.out.println("A modelo do carro é: "+Carro.modelo+"\n");
                case 5 -> System.out.println("A marca do carro é: "+Carro.marca+"\n");
                case 6 -> System.out.println("O número do chassi do carro é: "+Carro.chassi+"\n");
                case 7 -> System.out.println("O carro é do ano: "+Carro.ano+"\n");
                case 8 ->   {
                    if(estadoCarro == true){ 
                        Carro.freiar();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Ligue o carro antes de usar essa opção");
                    }           
                }
                case 9 ->   {
                    if(estadoCarro == true){ 
                        Carro.acelerar();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Ligue o carro antes de usar essa opção");
                    }       
                }
                case 10 ->  {
                    if(estadoCarro == true){ 
                        Carro.mudarMarcha();
                    }
                    else{
                    JOptionPane.showMessageDialog(null,"Ligue o carro antes de usar essa opção");
                    }       
                }
                case 11 ->  { 
                    JOptionPane.showMessageDialog(null,"Saindo...");
                    loop++; }
                default -> JOptionPane.showMessageDialog(null,"Valor inválido");
            }
            if(estadoCarro == true){
                carro Carro = new carro();
                Carro.ligar();
            }
            else{
                Carro.parar();
            }
        }while(loop<1);
    }
}
