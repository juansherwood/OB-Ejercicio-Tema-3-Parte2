public class Coche {

    int num_puertas = 4;

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementar_puertas();
        miCoche.incrementar_puertas();
        System.out.println("El coche tiene " + miCoche.num_puertas + " puertas.");
    }

    public void incrementar_puertas() {
        this.num_puertas++;
        System.out.println("Se ha incrementado el número de puertas del coche.");
    }
}
