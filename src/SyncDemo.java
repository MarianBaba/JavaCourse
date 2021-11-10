
class Counter {
    int count;
    public synchronized void increment() { //SYNCHRONIZED PERMETTE A UN SOLO THREAD DI LAVORARE CON QUESTO METODO, GLI ALTRI THREAD DEVONO ASPETTARE, per rendere un metodo o una classe THREAD SAFE, dobbiamo impostare syncrhronized
        count++;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        //PER DUE THREAD CHE FANNO LA STESSA COSA E' NECESSARIO SINCRONIZZARLI, altrimenti ci sarà un overlap delle operazioni, dobbiamo modificare il metodo

        Thread t1 = new Thread(new Runnable() {
                public void run() {
                    for(int i = 1; i <= 10000; i++) {
                        c.increment();
                    }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for(int i = 1; i <= 10000; i++) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
