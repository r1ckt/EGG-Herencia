package ejercicio_04;

public class Main {

    public static void main(String[] args) {
        Circulo circ = new Circulo(3d, 6d);
        Rectangulo rect = new Rectangulo(5d, 3d);

        double areaCirculo = circ.calcularArea();
        double perimetroCirculo = circ.calcularPerimetro();
        
        
        double areaRectangulo = rect.calcularArea();
        double perimetroRectangulo = rect.calcularPerimetro();
        
        System.out.println("*** CIRCULO ***");
        System.out.printf("%-15s%.2f\n", "AREA", areaCirculo);
        System.out.printf("%-15s%.2f\n", "PERIMETRO", perimetroCirculo);
        System.out.println();
        System.out.println("*** RECTANGULO ***");
        System.out.printf("%-15s%.2f\n", "AREA", areaRectangulo);
        System.out.printf("%-15s%.2f\n", "PERIMETRO", perimetroRectangulo);

    }

}
