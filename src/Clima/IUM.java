package Clima;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IUM {

    private ArrayList<Ciudad> ciudades;
    private Scanner s;
    private File f;

    public IUM() throws IOException{
        ciudades = new ArrayList();
        f = new File("datos.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        s = new Scanner(f);
        this.LeerDatos();
                
    }

    public IUM(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
    
    public void addCiudad(Ciudad c){
        ciudades.add(c);
    }
    
    public void LeerDatos(){
        s.useDelimiter(",");
        while(s.hasNext()){
            ciudades.add(new Ciudad(s.next()));
            s.nextLine();
            for(int i=0;i<s.nextInt();i++){
                s.nextLine();
                ciudades.get(ciudades.size()-1).addEstacion(new Estacion(s.next()));
                s.nextLine();
                for(int j=0;j<s.nextInt();j++){
                    s.nextLine();
                    ciudades.get(ciudades.size()-1).getEstacion(i).setFecha(s.next());
                    ciudades.get(ciudades.size()-1).getEstacion(i).addSensorT(s.nextInt());
                    ciudades.get(ciudades.size()-1).getEstacion(i).addSensorL(s.nextInt());
                    ciudades.get(ciudades.size()-1).getEstacion(i).addSensorC(s.nextInt());
                }
            }
            s.nextLine();
        }
    }
    
}
