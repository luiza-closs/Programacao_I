public abstract class Forma {
    private String nome;
    private String descricao;

    public Forma(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract double calcularArea();
}