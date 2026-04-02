public class Funcionario {
    private String nome;
    private String sobrenome;
    private int idade;
    private String cracha;

    public Funcionario(String nome, String sobrenome, int idade, String cracha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getCracha() {
        return cracha;
    }
}
