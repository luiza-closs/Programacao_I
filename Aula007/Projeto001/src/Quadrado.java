public class Quadrado extends FormaBidimensional {
    private double lado;

    public Quadrado(double lado) {
        super("Quadrado", "Forma geométrica de dois dimensões com quatro lados iguais");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
    
}
