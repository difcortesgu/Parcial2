package Clima;

public class CargaElectrica extends Sensor{

    private String clasificacion;
    private int Nclasificacion;

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getNclasificacion() {
        return Nclasificacion;
    }

    public void setNclasificacion(int Nclasificacion) {
        this.Nclasificacion = Nclasificacion;
    }

    public CargaElectrica(int Nclasificacion, String marca, int ref, String fecha) {
        super(marca, ref, fecha);
        this.Nclasificacion = Nclasificacion;
        switch(Nclasificacion){
            case 1: clasificacion="Tormenta Electrica";break;
            case 2: clasificacion="Rayos";break;
            case 3: clasificacion="Truenos";break;
            case 4: clasificacion="Normal";break;
        }
    }

    public CargaElectrica(int Nclasificacion) {
        this.Nclasificacion = Nclasificacion;
        switch(Nclasificacion){
            case 1: clasificacion="Tormenta Electrica";break;
            case 2: clasificacion="Rayos";break;
            case 3: clasificacion="Truenos";break;
            case 4: clasificacion="Normal";break;
        }
    }
    
    
    
    @Override
    public int calcularP() {
        return 0;
    }
   
}
