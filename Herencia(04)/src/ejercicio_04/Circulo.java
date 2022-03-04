
package ejercicio_04;

public class Circulo implements calculosFormas {
    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "CIRCULO" + "\nRadio:" + radio + "\nDiametro:" + diametro;
    }

    @Override
    public double calcularPerimetro() {
        return calculosFormas.PI_CONST * diametro;
    }

    @Override
    public double calcularArea() {
        return calculosFormas.PI_CONST * Math.pow(radio, 2);
    }
    
    
    
    
}
