/**
 * Exercício 1: Declaração de Classe
 * Crie uma classe chamada Carro. 
 * A classe deve ter um atributo marca do tipo String.
*/

public class Carro {
    private String marca;
    /**
     * Exercício 2: Atributos
     * Adicione à classe Carro os atributos modelo (String) e ano (int).
     */
    private String modelo;
    private int ano;

    /**
     * Exercício 3: Métodos Simples
     * Na classe Carro, crie um método exibirDetalhes que imprime os valores dos atributos marca, modelo e ano.
     */
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    /**
     * Exercício 4: Construtor
     * Adicione um construtor à classe Carro que inicializa os atributos marca, modelo e ano.
     */
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    /**
     * Exercício 5: Métodos com Parâmetros
     * Crie um método atualizarAno na classe Carro que recebe um parâmetro novoAno e atualiza o atributo ano.
     */
    public void atualizarAno(int novoAno) {
        this.ano = novoAno;
    }

    /**
     * Exercício 6: Classe com Atributos Privados
     * Modifique os atributos da classe Carro para serem privados e crie métodos get e set para cada atributo.
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Exercício 7: Classe com Métodos de Validação
     * Adicione um método validarAno na classe Carro que verifica se o ano é maior que 1885 (ano do primeiro carro) e menor ou igual ao ano atual.
     */
    public boolean validarAno(int ano) {
        return ano > 1885 && ano <= 2024; // Supondo que o ano atual seja 2024
    }
}

