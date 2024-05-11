package Exercício3;

import javax.swing.JOptionPane;

class TestarLâmpada extends Object{
    public Boolean estado;
    public void LerEstado(){
    int escolha = 2;
        do{
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Você quer ligar ou desligar a lâmpada?\n 1-Ligar \n 2-Desligar"));
        switch (escolha) {
            case 1:
                estado = true;
                break;
            case 2:
                estado = false;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Valor inválido");
                break;
        }
    }while(escolha>2||escolha<1);
}
public void MostrarEstado(){
    if(estado == true){
        JOptionPane.showMessageDialog(null,"A lâmpada esta ligada");
    }else{
        JOptionPane.showMessageDialog(null,"A lâmpada esta desligada");
    }
}
}
