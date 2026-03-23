public class Correntista {
    private String nome;
    private String endereco;
    private String cpf;
    private Conta conta;

    // Construtor
    public Correntista(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public Conta getConta() {
        return conta;
    }

    // Setter para conta
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    //Atualizar Endereço
    public void atualizarEndereco (String novoEndereco) {
        this.endereco = novoEndereco;
    }
    
}
