public class Pit {

    public Pit() {
    }
    
    public void entra(int giro){
        System.out.println("PIT_STOP al GIRO "+ giro+ " "+ Thread.currentThread().getName()+" e' entrato");
    }
    public void usa(){
        System.out.println("PIT-STOP "+ Thread.currentThread().getName()+" cambio gomme in corso");
        int tempo = (int)Math.random()*4+1;
        try {
            Thread.sleep(tempo*1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void esce(){
        System.out.println("PIT_STOP "+ Thread.currentThread().getName()+" sta uscendo");
    }

}
