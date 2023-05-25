

public class Macchina extends Thread{
    private int numero;
    private String scuderia;
    private Pit box;
    private Semaforo semaforo;

    
    public Macchina(String nome, int numero, String scuderia, Pit box, Semaforo semaforo) {
        super(nome);
        this.numero = numero;
        this.scuderia = scuderia;
        this.box = box;
        this.semaforo = semaforo;
    }

    @Override
    public void run(){
        for(int i = 1; i<= 10; i++){
            int tempo = (int)(Math.random()*4000+1);
            try {
                sleep(tempo);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("GIRO "+ i+" completato "+ super.getName());
            if(i%3 == 0){
                semaforo.P();
                box.entra(i);
                box.usa();
                box.esce();
                semaforo.V();           
            }
        }
    }


}
