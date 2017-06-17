package david_diaz_lab8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Duracion_Llamada extends Thread {
    private JLabel hora;
    public Duracion_Llamada(JLabel hora){
        this.hora = hora;
    }
    
    @Override
    public void run(){
        while(true){
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("mm:ss");
            hora.setText(f.format(h));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }
}
