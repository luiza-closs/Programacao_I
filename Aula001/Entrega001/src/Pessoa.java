/**
 * Exercício 8: Classe com Métodos de Cálculo
 * Crie uma classe Pessoa com os atributos nome (String) e 
 * anoNascimento (int). 
 * Adicione um método calcularIdade que retorna a idade da pessoa com 
 * base no ano atual.
 */

public class Pessoa {
    private String nome;
    private int anoNascimento;

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public int calcularIdade() {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - this.anoNascimento;
    }

    /**
     * Exercício 9: Métodos de Formatação
     * Na classe Pessoa, adicione um método exibirNomeFormatado que 
     * retorna o nome da pessoa em letras maiúsculas.
     */
    public String exibirNomeFormatado() {
        return this.nome.toUpperCase();
    }

    /**
     * Exercício 10: Getters e Setters
     * Modifique os atributos da classe Pessoa para serem privados e 
     * crie métodos get e set para cada atributo. 
     * Adicione um método exibirDetalhes que imprime os valores dos 
     * atributos nome e anoNascimento.
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano de Nascimento: " + this.anoNascimento);
    }
}
