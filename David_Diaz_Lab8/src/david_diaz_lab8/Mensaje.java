package david_diaz_lab8;

import java.util.Date;

public class Mensaje {
    private Contacto emisor;
    private Contacto receptor;
    private Date fecha;
    private String contendo;

    public Mensaje() {
    }

    public Mensaje(Contacto emisor, Contacto receptor, Date fecha, String contendo) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
        this.contendo = contendo;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getContendo() {
        return contendo;
    }

    public void setContendo(String contendo) {
        this.contendo = contendo;
    }

    @Override
    public String toString() {
        return contendo;
    }
    
}
