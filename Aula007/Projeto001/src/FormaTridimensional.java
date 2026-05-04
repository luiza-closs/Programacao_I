public abstract class FormaTridimensional extends Forma {
    public FormaTridimensional(String nome, String descricao) {
        super(nome, descricao);
    }
    
    public abstract double calcularVolume();
}
