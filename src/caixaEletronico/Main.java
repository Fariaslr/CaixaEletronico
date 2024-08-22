package caixaEletronico;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        CaixaEletronico caixa = new CaixaEletronico();
        String opcoes[] = {"Saque", "Depósito", "Sair"};
        int escolha = 0;
        
        while (escolha == 2) {
            escolha = JOptionPane.showOptionDialog(null, "Escolha as opções", "Banco da alegria", 0, 3, null, opcoes, 0);
            
        }
        switch (escolha) {
            case 0:
                caixa.sacar(Double.parseDouble(JOptionPane.showInputDialog("Valor do saque")));
                break;
            default:
                throw new AssertionError();
        }
    }
}
