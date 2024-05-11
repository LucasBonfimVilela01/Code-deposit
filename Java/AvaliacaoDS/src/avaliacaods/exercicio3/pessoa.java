package avaliacaods.exercicio3;

import javax.swing.JOptionPane;

public class pessoa {
    public String nome;
    public int idade;
    public boolean sexo;
    public String faixa;
    
    public void LerValores(){
        boolean valido = false;
        do{
            nome = JOptionPane.showInputDialog("Insira seu nome");
            
            if(nome==" "){
                JOptionPane.showMessageDialog(null,"Insira alguma coisa!");
            }else{
                valido = true;
            }
        }while(valido==false);
        valido=false;
        do{
            idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade"));
            
            if(idade==0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser maior que zero");
            }else if(idade<0){
                JOptionPane.showMessageDialog(null,"O valor tem que ser positivo");
            }else{
                valido = true;
            }
        }while(valido==false);
        valido=false;
        do{
            int sex;
            sex = Integer.parseInt(JOptionPane.showInputDialog("Seu sexo é: \n 1-Masculino \n 2-Feminino"));
            
            switch(sex){
                case 1:
                    sexo=true;
                break;
                case 2:
                    sexo=false;
                break;
                default:
                break;
            }
            
            if(sex>2){
                JOptionPane.showMessageDialog(null,"Valor inválido");
            }else if(sex<1){
                JOptionPane.showMessageDialog(null,"Valor inválido");
            }else{
                valido = true;
            } 
        }while(valido==false);     
    }
    public void Classificar(){
        if(idade<=0){
            faixa="Recém nascido";
        }
        else if(idade<=2){
            faixa="Bêbe";
        }
        else if(idade<=11){
            faixa="Criança";
        }
        else if(idade<=19){
            faixa="Adolescente";
        }
        else if(idade<=30){
            faixa="Jovem";
        }
        else if(idade<=60){
            faixa="Adulto";
        }
        else{
            faixa="Idoso";
        }
        JOptionPane.showMessageDialog(null,"Sua faixa é: "+faixa);
    }
    
    public void Imprimir(){
        String s;
        if(sexo==true){
            s = "Masculino";
        }else{
            s = "Feminino";
        }
        JOptionPane.showMessageDialog(null,"nome: "+nome
                                          +"\n Idade: "+idade
                                          +"\n Sexo: "+s
                                          +"\n Faixa: "+faixa);
    }
}
