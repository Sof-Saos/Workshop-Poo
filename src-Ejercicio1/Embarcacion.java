
public abstract class Embarcacion {
    protected Capitan capitan;
    protected double precioBase;
    protected double valorAdicional;
    protected int fechaFabricacion;
    protected int eslora;
    private String tipo;

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
        if (bill > precioBase) {
            return true;
        } else {
            System.out.println("Fondos insuficientes");
            return false;
        }
    }

}
