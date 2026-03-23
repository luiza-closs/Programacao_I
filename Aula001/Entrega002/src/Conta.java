public class Conta {
    private int numero;
    private double saldo;
    
    public Conta(){

    }
    /**
     * Considere o trecho de código a 
     * seguir para abstração de uma classe 
     * Conta. A partir da análise dele, 
     * proponha mais um método construtor.
     */

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
}