package ejercicio_03;

import java.util.Locale;
import java.util.Scanner;

public final class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
        super();
    }

    public Lavadora(int precio, String color, char consumoEnergetico, int peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese la carga:");
        this.carga = scan.nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if (this.carga > 30) {
            this.precio += 500;
        }

    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora\n" + "Carga:" + carga + "Kg" + super.toString();
    }

}
