package br.com.uniderp;

import javax.swing.JOptionPane;

public class Conta {

    private String titular;
    private Integer numero;
    private Double saldo;
    private Double limite;

    public Conta(String titular, Integer numero, Double saldo, Double limite) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    //Criando o método de saque com condiçao de sacar
    //valor == a variavél local que será passada como parametro que recebera o valor a ser sacado
    public Double sacar(double valor) {
        //this indica que o saldo é o saldo da classe
        if ((this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
        return this.saldo;
    }

    //Criando o metodo depositar 
    //valorASerDepositado == variavel local que será passada como parametro com o valor do deposito
    public Double depositar(double valorASerDepositado) {
        this.saldo += valorASerDepositado;
        return this.saldo;
    }

    public String imprimirDados() {
        return "Número da conta :" + numero + " \ntitular da conta : " + titular
                + " saldo da conta " + saldo + "  limite da conta " + limite;
    }

    public String imprimiSaldo() {
        return "Saldo atual :" + saldo;
    }

}
