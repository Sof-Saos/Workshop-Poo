public class Yate extends Embarcacion{
    private int cantidadCamarotes;

    public Yate(Capitan capitan, int fechaFabricacion, int eslora, int cantidadCamarotes) {
        super(capitan, fechaFabricacion, eslora, 0, "Yate");
        this.cantidadCamarotes = cantidadCamarotes;
        this.precioBase = comprobarTamanoPrecio();
    }

    public double comprobarTamanoPrecio() {
        if (cantidadCamarotes > 7) {
            return 4000000;
        } else {
            return 2000000;
        }
    }
    public void comprobarTamano(){
        if (cantidadCamarotes > 7) {
            System.out.println("El yate tiene mayor lujp");
        } else {
            System.out.println("El yate no es tan lujoso");
        }
    }

    public double calcularMontoCompraYate(){
        double valorCompraYate; //Con este metodo, si desea comprar un yate, se cobrara 50 millones más
        valorCompraYate = calcularMonto() + 50000000; //Aviso: precios subrealistas, ignorar
        return valorCompraYate;
    }
    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public boolean comprar(double bill){
        if (bill > calcularMontoCompraYate()) {
            return true;
        } else {
            System.out.println("Fondos insuficientes");
            return false;
        }
    }

}
