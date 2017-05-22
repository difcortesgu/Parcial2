package Clima;

public abstract class Sensor {

    protected String marca;
    protected int ref;
    protected String fecha;

    public Sensor(String marca, int ref, String fecha) {
        this.marca = marca;
        this.ref = ref;
        this.fecha = fecha;
    }

    public Sensor() {
    }
    
    
    public abstract int calcularP();
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}

