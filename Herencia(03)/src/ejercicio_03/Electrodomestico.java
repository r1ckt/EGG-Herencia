package ejercicio_03;

import java.util.Locale;
import java.util.Scanner;

public abstract class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        
        if (letra < 65 || letra > 70) {
            this.consumoEnergetico = 'F';
        }else{
            this.consumoEnergetico = Character.toUpperCase(letra);
        }
    }

    private void comprobarColor(String color) {
        boolean bandera = false;
        
        for (Colores aux : Colores.values()) {
            if (color.equalsIgnoreCase(aux.toString())) {
                bandera = true;
            }
        }
        
        if(bandera){
            this.color = color;
        } else {
            this.color = Colores.BLANCO.toString();
        }
        
    }

    protected void crearElectrodomestico() {
        this.precio = 1000;
        
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el color: ");
        String colorElectr = scan.next();
        comprobarColor(colorElectr);

        System.out.println("Ingrese el consumo energetico: ");
        char consumo = scan.next().charAt(0);
        comprobarConsumoEnergetico(consumo);

        System.out.println("Ingrese el peso:");
        this.peso = scan.nextDouble();
        
        precioFinal();

    }

    protected void precioFinal() {

        switch (this.consumoEnergetico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }

        if (this.peso >= 1 && this.peso <= 18) {
            this.precio += 100;
            
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precio += 500;
            
        } else if (this.peso >= 50 && this.peso <= 79) {       
            this.precio += 800;
            
        } else {
            this.precio += 1000;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoEnergetico;
    }

    public void setConsumoElectrico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Precio: $" + precio + "\nColor: " + color + "\nConsumo energético: " + consumoEnergetico + "\nPeso:" + peso + " Kg";
    }

}
