
package modelo;

import java.time.LocalDate;
import java.util.Date;

public class Tarjeta {
    private String nombre;
    private String numero;
    private Date vencimiento;
    private String cvv;

    public Tarjeta(String nombre, String numero, Date vencimiento, String cvv) {
        this.nombre = nombre;
        this.numero = numero;
        this.vencimiento = vencimiento;
        this.cvv = cvv;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public String getCvv() {
        return cvv;
    }
    
    /*public boolean validarTarjeta (Date vencimiento){
       
    }*/
}
