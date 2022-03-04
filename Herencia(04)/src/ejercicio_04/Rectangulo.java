package ejercicio_04;

public class Rectangulo implements calculosFormas {

    private double altura;
    private double base;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "RECTANGULO" + "\nAltura:" + altura + "\nBase:" + base;
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }

    @Override
    public double calcularArea() {
        return base * altura;

    }

}
