import java.util.ArrayList;
import java.util.List;

public class Conta {
    
    private int numero;
    private double saldo;
    private Correntista correntista;
    private List<MovConta> movimentos;

    // Construtor
    public Conta(int numero, double saldo, Correntista correntista) {
        this.numero = numero;
        this.saldo = saldo;
        this.movimentos = new ArrayList<>();
        this.correntista = correntista;
        correntista.setConta(this);
    }
    // Getters e Setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //Depositos e Saques

    public void depositar(double valor) {
        if (valor > 0) {
            MovConta movimento = new MovConta(this, "Depósito", valor, java.time.LocalDate.now().toString());
            saldo += movimento.getValor();
            movimentos.add(movimento);
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            MovConta movimento = new MovConta(this, "Saque", valor, java.time.LocalDate.now().toString());
            saldo -= movimento.getValor();
            movimentos.add(movimento);
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    //Extrato

    public void extratoResumo() {
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Correntista: " + correntista.getNome());
    }

    public void extratoCompleto() {
        for (MovConta movimento : movimentos) {
            System.out.println(movimento.getData() + " - " + movimento.getTipoMovimento() + ": R$ " + movimento.getValor());
        }

        System.out.println("Saldo Atual: R$ " + saldo);
    }
}
