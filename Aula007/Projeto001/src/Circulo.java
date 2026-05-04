public class Circulo extends FormaBidimensional {
    private double raio;

    public Circulo(double raio) {
        super("Círculo", "Circunferência de um círculo");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
}
