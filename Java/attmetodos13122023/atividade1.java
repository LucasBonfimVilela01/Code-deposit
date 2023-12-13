package com.mycompany.attmetodos13122023;

import javax.swing.JOptionPane;

public class atividade1 {
      public static void main(String[] args) {
        int nota1Aluno1 = 0, nota2Aluno1=0, nota1Aluno2=0, nota2Aluno2=0;
        String nomeAluno1=" ", nomeAluno2=" ";
        nomeAluno1 = JOptionPane.showInputDialog("Digite o nome do primeiro aluno");
        nomeAluno2 = JOptionPane.showInputDialog("Digite o nome do segundo aluno");
        
        JOptionPane.showMessageDialog(null, "Insira as notas do Primeiro aluno");
        nota1Aluno1=lerNota(nota1Aluno1);
        nota2Aluno1=lerNota(nota2Aluno1);
        
        JOptionPane.showMessageDialog(null, "Insira as notas do Segundo aluno");
        nota1Aluno2=lerNota(nota1Aluno2);
        nota2Aluno2=lerNota(nota2Aluno2);
                
        int med1 = calcularMedia(nota1Aluno1, nota2Aluno1);
        int med2 = calcularMedia(nota1Aluno2, nota2Aluno2);
        
       if(med1>=7){
           JOptionPane.showMessageDialog(null, "O aluno: "+nomeAluno1+"\n foi aprovado! \nCom uma média de: "+med1);
       }
       else{
           JOptionPane.showMessageDialog(null, "O aluno: "+nomeAluno1+"\n foi reprovado! \nCom uma média de: "+med1);
       }
       if(med2>=7){
           JOptionPane.showMessageDialog(null, "O aluno: "+nomeAluno2+"\n foi aprovado! \nCom uma média de: "+med2);
       }
       else{
           JOptionPane.showMessageDialog(null, "O aluno: "+nomeAluno2+"\n foi reprovado! \nCom uma média de: "+med2);
       }
    }
    static int lerNota(int a){
        return 
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: "));
    }
    static int calcularMedia(int n1, int n2){
        int med = (n1+n2)/2;
        return med;
    }
}
