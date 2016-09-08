package br.com.uniderp;

import javax.swing.JOptionPane;

public class TestaConta {

    public static void main(String[] args) {
        //Instânciando um objeto com construtor titular,numero,saldo,
        Conta c1 = new Conta("Brunna surfistinha", 12345, 1000.0, 100.0);
        int i;   
        do {            
            String menu = JOptionPane.showInputDialog("1-Sacar\n2-Depositar\n3-Saldo\n4-Imprimir Dados\n0-Para Sair");
            i = Integer.parseInt(menu);
            switch (i)
            {
                case 1:
                    c1.sacar(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser sacado")));
                    break;
                case 2:
                    c1.depositar(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser depositado")));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Saldo em conta "+c1.imprimiSaldo());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Dados da conta:\n"+c1.imprimirDados());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida");
                    break;
            }
            
                
        } while (i!=0);
    }

}
