
package modelo;

import java.util.Date;

public class Evento {
    private String nombre;
    private Date fecha;

    public Evento(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public void buscarZona(){
        
    }
}
