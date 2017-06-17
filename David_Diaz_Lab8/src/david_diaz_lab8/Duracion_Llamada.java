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
            int conts = 0, contm = 0;
            if (conts != 59) {
                conts ++;
            } else {
                if (contm != 59) {
                    conts = 0;
                    contm ++;
                }
            }
            hora.setText(contm + " : " +conts);
            try {
                Thread.sleep(999);
            } catch (InterruptedException e) {
            }
        }
    }
}
