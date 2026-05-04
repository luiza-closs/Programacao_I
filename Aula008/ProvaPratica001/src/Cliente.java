/**
 * a.2) Implemente uma classe Cliente, que representa as pessoas ( classe 
 * Pessoa) que alugam carros na locadora; cada cliente pode fazer a
 * locação de um(1) carro;
 */

public class Cliente extends Pessoa {
    private Carro carroAlugado;

    public Cliente(String nome, String cpf){
        super(nome, cpf);
    }

    public void alugarCarro(Carro carro){
        this.carroAlugado = carro;
        carro.alugarCarro();
    }

    public void devolverCarro(){
        if(carroAlugado != null){
            carroAlugado.devolverCarro();
            carroAlugado = null;
            
        }
    }

    public void exibirDados(){
        System.out.println("Dados do Cliente:");
        super.exibirDados();
        if(carroAlugado != null){
            System.out.println("Carro Alugado:");
            carroAlugado.exibirCarro();
        } else {
            System.out.println("Nenhum carro alugado.");
        }
    }
    
}
