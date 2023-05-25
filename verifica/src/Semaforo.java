/**
 * semaforo di Djkistra
 * @author SamueleTaiti
 */
public class Semaforo {
    /**
     * valore del semaforo
     */
    private int value;

    /**
     * valore all'inizio del semaforo
     * @param value
     */
    public Semaforo(int value) {
        this.value = value;
    }

    /**
     * imposta il semaforo a rosso e blocca i thread quando il semaforo e' a rosso
     */
    public synchronized void P(){
        while(value == 0){
            System.out.println("-----"+Thread.currentThread().getName()+" Attende ai box-----");
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        value--;

    }
    /**
     * imposta il semaforo a verde e sveglai i thread
     */
    public synchronized void V(){
        value++;
        notifyAll();
    }
}
