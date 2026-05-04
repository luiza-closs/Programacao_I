/**
 * a) Ajuste o código para que na relação de herança com a classe Pessoa,
 * apenas Atendentes possam ser instanciados no sistema.
 */
public abstract class Pessoa {
    protected String nome;
    protected String cpf;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirDados(){
        System.out.println("Nome:" + nome);
        System.out.println("CPF:" + cpf);
    }
    
}
