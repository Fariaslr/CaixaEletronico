package caixaEletronico;

public class CaixaEletronico {

    private double valorCaixa;
    private boolean status;
    private double limiteTransacao;

    public CaixaEletronico() {
        this.valorCaixa = 5000;
        this.status = false;
        this.limiteTransacao = 1000;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    public double getLimiteTransacao() {
        return limiteTransacao;
    }

    public void setLimiteTransacao(double limiteTransacao) {
        this.limiteTransacao = limiteTransacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void mudarStatus() {
        this.status = !status;
    }

    public double sacar(double saque) {
        if (saque <= this.valorCaixa && saque <= limiteTransacao) {
            System.out.println("Caixa sem saldo");
            return valorCaixa = -saque;
        } else {
            System.out.println("Caixa sem saldo");
            return valorCaixa;
        }

    }

    public double deposito(double deposito) {
        if (deposito <= limiteTransacao) {
            return valorCaixa = +deposito;
        } else {
            System.out.println("Valor invalido");

            return valorCaixa;
        }
    }

}
