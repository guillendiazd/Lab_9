package david_diaz_lab8;

import java.util.Date;

public class Llamada {
    private Contacto emisor;
    private Contacto receptor;
    private int duracion;
    private Date fecha;

    public Llamada() {
    }

    public Llamada(Contacto emisor, Contacto receptor, int duracion, Date fecha) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.duracion = duracion;
        this.fecha = fecha;
    }

    public Contacto getEmisor() {
        return emisor;
    }

    public void setEmisor(Contacto emisor) {
        this.emisor = emisor;
    }

    public Contacto getReceptor() {
        return receptor;
    }

    public void setReceptor(Contacto receptor) {
        this.receptor = receptor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Llamada " + duracion;
    }
    
}
