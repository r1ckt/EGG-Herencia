package ejercicio_03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Electrodomestico> electrodomesticos = new ArrayList<>();
        int i=0;
        
        do{
            Lavadora lavadora = new Lavadora();
            Televisor televisor = new Televisor();
            
            System.out.println("INGRESE DATOS DEL LAVARROPAS " + (i+1));
            lavadora.crearLavadora();
            System.out.println("INGRESE DATOS DEL TELEVISOR " + (i+1));
            televisor.crearTelevisor();
            
            electrodomesticos.add(lavadora);
            electrodomesticos.add(televisor);
            i++;
        }while(i<2);
        
        
        double total = 0;
        double totalLavadoras = 0;
        double totalTelevisores = 0;
 
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if(electrodomestico instanceof Lavadora){
                total += electrodomestico.getPrecio();
                totalLavadoras += electrodomestico.getPrecio();
            } else {
                total += electrodomestico.getPrecio();
                totalTelevisores += electrodomestico.getPrecio();
            }
            
        }
        
        System.out.println("*** PRECIOS TOTALES ***");
        System.out.printf("%-25s$%.2f\n","TOTAL LAVADORAS", totalLavadoras);
        System.out.printf("%-25s$%.2f\n", "TOTAL TELEVISORES", totalTelevisores);
        System.out.printf("%-25s$%.2f\n","TOTAL ELECTRODOMESTICOS", total);

    }

}
