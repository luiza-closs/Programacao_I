public class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(double lado) {
        super("Cubo", "Forma geométrica de um sólido tridimensional com seis faces quadradas");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }
    
}
