public class Carro {
    private String nomeMarca;
    private String placa;
    private boolean emprestado;

    public Carro(String nomeMarca, String placa){
        this.nomeMarca = nomeMarca;
        this.placa = placa;
        this.emprestado = false;
    }

    public void alugarCarro(){
        this.emprestado = true;
    }
    public void devolverCarro(){
        this.emprestado = false;
    }

    public boolean getStatus(){
        return emprestado;
    }

    public void exibirCarro(){
        System.out.println("Nome e Marca:" + nomeMarca);
        System.out.println("Placa do Veiculo:" + placa);
        System.out.println("Status do Carro:" + (emprestado ? "Emprestado" : "Disponível"));
    }
}
