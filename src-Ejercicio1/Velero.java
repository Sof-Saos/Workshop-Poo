public class Velero extends Embarcacion {
    private int cantidadMastiles;

    public Velero(Capitan capitan, int fechaFabricacion, int eslora, int cantidadMastiles) {
        super(capitan, fechaFabricacion, eslora, 0, "Velero"); // Llamada a la superclase con precioBase temporal
        this.cantidadMastiles = cantidadMastiles;
        this.precioBase = comprobarTamanoPrecio();
    }

    public double comprobarTamanoPrecio() {
        if (cantidadMastiles > 4) {
            return 4000000;
        } else {
            return 2000000;
        }
    }
    public void comprobarTamano(){
        if (cantidadMastiles > 4) {
            System.out.println("El velero es grande");
        } else {
            System.out.println("El velero es pequeño");
        }
    }

    public int getCantidadMastiles() {
        return cantidadMastiles;
    }
}

