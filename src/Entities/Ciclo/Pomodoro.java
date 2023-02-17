package Entities.Ciclo;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pomodoro extends Thread{
    
    private ArrayList<Ciclo> ciclos;
    
    public Pomodoro(ArrayList<Ciclo> ciclos) {
        this.ciclos = ciclos;
    }
    
    
    @Override
    public void run() {
        //Mientras que no se terminen todos los ciclos el hilo va a seguir corriendo.
        while (this.ciclos.size() > 0) {
            
            try {
                
                reducirVidaCiclo(this.ciclos.get(0));
                this.ciclos.remove(0);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Pomodoro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
    public static boolean reducirVidaCiclo(Ciclo actual) throws InterruptedException {
        try {
            Ciclo ciclo = actual;
            //Mientras que el ciclo siga con vida.
            while (ciclo.getCiclo() > 0) {

                System.out.println(ciclo.getCiclo());
                if (ciclo.gettEstudio() > 0) {
                    //Se reduce 1 segundo el tiempo de estudio y se descansa el hilo 1000ms.
                    ciclo.reducirTiempoEstudio();
                    ciclo.reducirVidaCiclo();
                    sleep(1000);
                }
                else if (ciclo.gettDescanso() > 0) {
                    ciclo.reducirTiempoDescanso();
                    ciclo.reducirVidaCiclo();
                    sleep(1000);
                }
                else {
                    return true;
                }

            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
