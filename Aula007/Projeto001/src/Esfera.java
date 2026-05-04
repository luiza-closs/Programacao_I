public class Esfera extends FormaTridimensional {
    private double raio;

    public Esfera(double raio) {
        super("Esfera", "Forma geométrica de um sólido tridimensional perfeitamente redonda");
        this.raio = raio;
    }

    @Override
    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    public double calcularArea() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }
    
}
