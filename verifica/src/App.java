public class App {
    public static void main(String[] args) throws Exception {
        Semaforo s = new Semaforo(1);

        Pit box = new Pit();

        Macchina m1 = new Macchina("Leclerc", 16, "Ferrari", box, s);
        Macchina m2 = new Macchina("Sainz", 55, "Ferrari", box, s);
        Macchina m3 = new Macchina("Vertappen", 1, "RedBull", box, s);
        Macchina m4 = new Macchina("Checo", 16, "RedBull", box, s);
        Macchina m5 = new Macchina("Hamilton", 44, "Mercedesi", box, s);
        Macchina m6 = new Macchina("Russel", 63, "Mercedesi", box, s);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start();

        m1.join();
        m2.join();
        m3.join();
        m4.join();
        m5.join();
        m6.join();
        System.out.println("TERMINE GARA");
    }
}
