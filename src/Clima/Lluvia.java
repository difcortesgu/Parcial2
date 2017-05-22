package Clima;

public class Lluvia extends Sensor{

    private int cantidad;
    private static int promedio;

    public Lluvia(String marca, int ref, String fecha) {
        super(marca, ref, fecha);
    }

    public Lluvia(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int calcularP() {
        return 0;
        
    }
    
    
}
