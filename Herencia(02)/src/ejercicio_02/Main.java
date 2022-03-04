package ejercicio_02;

public class Main {

    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        Televisor televisor = new Televisor();

        lavadora.crearLavadora();
        System.out.println(lavadora);
        
        System.out.println("");
        
        televisor.crearTelevisor();
        System.out.println(televisor);

    }

}
