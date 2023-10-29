/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;

public class Desafio_Java_Votação {
    public static void main(String[] args) {
        int v1 = 0, v2=0, v3=0, v4=0, escolha=0, voto=0, loop = 0;
        
        while (loop == 0){
             voto = Integer.parseInt(JOptionPane.showInputDialog("insira um número de 1 a 4 para votar em um dos candidados para a presidencia da torcida organizada \n"  +
                   "candidato 1: joão "+"\n"+
                   "candidato 2: Pedro"+"\n"+
                   "candidato 3: Felipe"+"\n"+
                   "candidato 4: Leandro" ));
             switch(voto){
            case 1:
                v1++;
                break;
            case 2:            
                v2++;
                break;
            case 3:    
                v3++;
                break;
            case 4:    
                v4++;
                break;        
            default:    
                JOptionPane.showMessageDialog(null,"Número inválido");
                break;
        }
            escolha = Integer.parseInt(JOptionPane.showInputDialog("digite 1 para continuar votando, digite outro número para parar"));
            if (escolha == 1){
             loop = 0;   
            }
            else{
             loop = 1;
            } 
                
            }
        if ((v1>v2 && v1>v3 && v1>v3 && v1>v4)){
           JOptionPane.showMessageDialog(null, "João 1 ganhou com: "+v1+" votos\n"+
                   "--------\n"+
                   "João: "+v1+"\n"+
                   "Pedro: "+v2+"\n"+
                   "Felipe: "+v3+"\n"+
                   "Leandro: "+v4+"\n");
        }
        else if ((v2>v1 && v2>v3 && v2>v4)){
            JOptionPane.showMessageDialog(null, "Pedro 2 ganhou com: "+v2+" votos\n"+
                   "--------\n"+
                   "João: "+v1+"\n"+
                   "Pedro: "+v2+"\n"+
                   "Felipe: "+v3+"\n"+
                   "Leandro: "+v4+"\n");
                }
             else if ((v3>v1 && v3>v2 && v3>v4)){
            JOptionPane.showMessageDialog(null, "Felipe 3 ganhou com: "+v3+" votos\n"+
                    "--------\n"+
                   "João: "+v1+"\n"+
                   "Pedro: "+v2+"\n"+
                   "Felipe: "+v3+"\n"+
                   "Leandro: "+v4+"\n");
                  }
                  else if ((v4>v1 && v4>v2 && v4>v3)){
            JOptionPane.showMessageDialog(null, "Leandro 4 ganhou com: "+v4+" votos\n"+
                    "--------\n"+
                   "João: "+v1+"\n"+
                   "Pedro: "+v2+"\n"+
                   "Felipe: "+v3+"\n"+
                   "Leandro: "+v4+"\n");
                       }
        }
    }


