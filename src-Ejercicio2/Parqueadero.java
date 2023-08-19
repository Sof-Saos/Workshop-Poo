import java.util.ArrayList;

public class Parqueadero {
    private Carro[][] espaciosEstacionamiento;
    private double tarifaHora;

    public Parqueadero(double tarifaHora) {
        this.espaciosEstacionamiento = new Carro[5][10];
        this.tarifaHora = tarifaHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        fila -= 1; //Le restamos uno a ambas variables por que los indices de la matriz empiezan desde 0
        columna -= 1;
        if (fila >= 0 && fila < 5 && columna >= 0 && columna < 10) {
            if (espaciosEstacionamiento[fila][columna] == null) {
                espaciosEstacionamiento[fila][columna] = carro;
                System.out.println("Carro estacionado con éxito en la fila " + (fila+1) + ", columna " + (columna+1));
                return true;
            }
        }
        System.out.println();
        System.out.println("Su auto no se puedo estacionar.");
        System.out.println("Espacio en la fila " + (fila+1) + ", columna " + (columna+1) + ", ocupado.");
        return false;
    }
    public void retirarCarro(String placa){
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                Carro carro = espaciosEstacionamiento[fila][columna];
                if (carro != null && carro.getPlaca().equals(placa)) {
                    espaciosEstacionamiento[fila][columna] = null;
                    System.out.println("Carro con placa " + placa + " retirado con éxito.");
                    return;
                }
            }
        }
        System.out.println("No se encontró un carro con la placa " + placa);
    }

    public double cobrarPorTiempo(Carro carro, int horas){
        return 0.0;
    }

    public void mostrarParqueadero() {
        System.out.print("  ");
        for (int e = 0; e < 10; e++) {
            System.out.print( " " + (e + 1)); //Muestra los numeros de las filas
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " "); //Muestra los numeros de las columnas
            for (int j = 0; j < 10; j++) {
                if (espaciosEstacionamiento[i][j] != null) {
                    System.out.print("|x");
                } else {
                    System.out.print("| ");
                }
            }
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
        System.out.println("Tarifa cambiada con éxito, la tarifa por hora ahora es: " + tarifaHora);
    }
}
