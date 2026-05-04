public class Atendente extends Pessoa{
    private String codigo;
    public Atendente(String nome, String cpf, String codigo){
        super(nome,cpf);
        this.codigo = codigo;
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Codigo de Funcionário:"+ codigo);
    }
    
}
