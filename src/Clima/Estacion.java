package Clima;

import java.util.ArrayList;

public class Estacion {

    private String nombre;
    private String ubicacion;
    private String fecha;
    private Ciudad ciudad;
    private ArrayList<Sensor> sensores;

    public Estacion(String nombre, String ubicacion, String fecha, Ciudad ciudad) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.ciudad = ciudad;
        sensores = new ArrayList();
    }

    public Estacion(String nombre) {
        this.nombre = nombre;
        sensores = new ArrayList();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }
    
    public void addSensorT(int grados){
        sensores.add(new Temperatura(grados));
    }
    
    public void addSensorL(int c){
        sensores.add(new Lluvia(c));
    }
    
    public void addSensorC(int c){
        sensores.add(new CargaElectrica(c));
    }
    
    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }
    
}
