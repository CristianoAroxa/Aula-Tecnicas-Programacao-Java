
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box cx = new Box();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: " 
                 + "\n 1-Depositar \n 2-Sacar \n 3-Consultar Saldo \n 0-Sair"));
            
            switch(op){
                case 1:
                    cx.depositar();
                    break;
                case 2:
                    cx.sacar();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Saldo Atual " + cx.getSaldo());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o Programa");
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida, tente outra vez");
            }
            
        }while(op != 0);
    }
    
    
    
    
}
