public class App {
    public static void main(String[] args) throws Exception {
        Forma[] formas = {
                new Circulo(2),
                new Quadrado(4),
                new Triangulo(3, 5),
                new Cubo(2),
                new Esfera(3)
        };

        for (Forma f : formas) {
            System.out.println(f.getNome());
            System.out.println(f.getDescricao());
            System.out.println("Área: " + f.calcularArea());

            if (f instanceof FormaTridimensional) {
                FormaTridimensional tridimensional = (FormaTridimensional) f;
                System.out.println("Volume: " + tridimensional.calcularVolume());
            }

            System.out.println();
        }
    }
}
