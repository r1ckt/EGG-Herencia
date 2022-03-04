package ejercicio_02;

import java.util.Locale;
import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private int pulgadas;
    private boolean tdt;

    public Televisor() {
        super();
    }

    public Televisor(int pulgadas, boolean tdt, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingresar pulgadas:");
        this.pulgadas = scan.nextInt();

        String respuesta;
        do {
            System.out.println("Tiene sintonizador TDT incorporado? S/N");
            respuesta = scan.next();
        } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));

        tdt = respuesta.equalsIgnoreCase("S");

    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if (pulgadas > 40 && tdt) {
            this.precio += this.precio * 1.30 + 500;
        } else if (pulgadas > 40) {
            this.precio += this.precio * 1.30;
        }
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Televisor \n" + "Pulgadas: " + pulgadas + "\nTDT: " + tdt + "\n" + super.toString();
    }

}
