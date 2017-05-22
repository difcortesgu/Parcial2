 package Clima;

public class Temperatura extends Sensor{
    
    private int grados;

    public Temperatura(String marca, int ref, String fecha) {
        super(marca, ref, fecha);
    }

    public Temperatura(int g) {
        grados =g;
    }

    public int getGrados() {
        return grados;
    }

    public void setGrados(int grados) {
        this.grados = grados;
    }    

    @Override
    public int calcularP() {
        return 0;
        
    }
    
}
