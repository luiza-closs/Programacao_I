public class MovConta {
    private Conta conta;
    private String tipoMovimento; // "Depósito" ou "Saque"
    private double valor;
    private String data;

    // Construtor
    public MovConta(Conta conta, String tipoMovimento, double valor, String data) {
        this.conta = conta;
        this.tipoMovimento = tipoMovimento;
        this.valor = valor;
        this.data = data;
    }
    // Getters
    public Conta getConta() {
        return conta;
    }
    public String getTipoMovimento() {
        return tipoMovimento;
    }
    public double getValor() {
        return valor;
    }
    public String getData() {
        return data;
    }
}
