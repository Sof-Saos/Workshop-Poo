import java.util.ArrayList;

public class Embarcacion {
    //Atributos propios de la clase
    protected Capitan capitan;
    protected double precioBase;
    protected double valorAdicional;
    protected int fechaFabricacion;
    protected int eslora;
    public String tipo;
    public static ArrayList<Velero> veleros = new ArrayList<>();
    public static ArrayList<Yate> yates = new ArrayList<>();

    protected Embarcacion(Capitan capitan, int fechaFabricacion, int eslora, double precioBase, String tipo) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = 20000;
        this.fechaFabricacion = fechaFabricacion;
        this.eslora = eslora;
        this.tipo = tipo;
    }
    public double calcularMonto() {
        if (fechaFabricacion > 2020) {
            return precioBase = precioBase + valorAdicional;
        } else {
            return precioBase;
        }
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public boolean alquilar(double bill) {
        if (bill >= precioBase) {
            return true;
        } else {
            System.out.println("Fondos insuficientes");
            return false;
        }
    }

    public static void agregarYate(Yate yate) { yates.add(yate);} //metodo para agregar yates al arraylist
    public static void agregarVelero(Velero velero) {
        veleros.add(velero);
    } //metodo para agregar veleros al arraylist

    public static void mostrarInfo() { //Metodo para mostrar todos los veleros y yates disponibles
        int indice = 1;

        System.out.println("--------------- Información de Yates ------------");
        for (Yate yate : yates) {
            System.out.println(indice + ". Yate de: " + yate.eslora + " metros.");
            System.out.println("Fabricado en el año " + yate.fechaFabricacion);
            System.out.println("Con " + yate.getCantidadCamarotes() + " camarotes.");
            System.out.println("Su valor de alquiler es: " + yate.calcularMonto());
            System.out.println("Su valor de venta es: " + yate.calcularMontoCompraYate());
            yate.comprobarTamano();
            System.out.println(" ");
            indice++;
        }

        System.out.println(" ");
        System.out.println(" ");
        indice = 1; // Reiniciamos el contador de índices

        System.out.println("----------- Información de Veleros -------------");
        for (Velero velero : veleros) {
            System.out.println(indice + ". Velero de: " + velero.eslora + " metros.");
            System.out.println("Fabricado en el año " + velero.fechaFabricacion);
            System.out.println("Tiene " + velero.getCantidadMastiles() + " mastiles");
            System.out.println("Su valor de alquiler es: " + velero.calcularMonto());
            velero.comprobarTamano();
            System.out.println(" ");
            indice++;
        }
    }


}
