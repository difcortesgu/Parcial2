package Clima;

import java.util.ArrayList;

public class Ciudad {

    private ArrayList<Estacion> estaciones;
    private String nombre;

    public Ciudad(String nombre) {
        estaciones = new ArrayList();
        this.nombre = nombre;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }
    
    public Estacion getEstacion(int i){
        return this.estaciones.get(i);
    }

    public void addEstacion(Estacion e){
        estaciones.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
