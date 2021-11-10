
//POSSIAMO ANCHE FARE A MENO DI QUESTA CLASSE USANDO CLASSI ANONIME E LAMBDA
//class Hi implements Runnable { //così abbiamo la possibilità di CREARE il thread, essendo la classe un thread, runnable è un'interfaccia funzionale con un solo metodo: run
//    public void run() {
//        for(int i = 1; i <= 5; i++) {
//            System.out.println("Hi");
//            try { Thread.sleep(1000); } catch(Exception e) { } //IN QUESTO MODO POSSIAMO IMPOSTARE UNA PAUSA TRA UNA STAMPA E L'ALTRA
//            //questo potrebbe essere un problema, se eseguiamo una cosa alla volta, il secondo metodo dovrà aspettare 5 secondi prima di essere eseguito
//        }
//    }
//}

class Hello implements Runnable {
    public void run() { //POSSIAMO PROVARE AD ESEGUIRE QUESTO METODO PARALLELAMENTE AL PRIMO
        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try { Thread.sleep(1000); } catch(Exception e) { }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws Exception {

        Runnable obj = () -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try { Thread.sleep(1000); } catch(Exception e) { } //IN QUESTO MODO POSSIAMO IMPOSTARE UNA PAUSA TRA UNA STAMPA E L'ALTRA
                //questo potrebbe essere un problema, se eseguiamo una cosa alla volta, il secondo metodo dovrà aspettare 5 secondi prima di essere eseguito

                Thread.currentThread().getPriority(); //ALL'INTERNO DEL THREAD POSSIAMO RIFERIRCI A ESSO, mediante currentThread()
            }
        };
        Hello obj2 = new Hello();

        Thread t1 = new Thread(obj, "Hi Thread"); //dobbiamo esplicitare l'oggetto da linkare con Thread, possiamo passare il riferimento oppure IL NOME DEL THREAD, E POSSIAMO ANCHE DARE UN NOME AL THREAD SE VOGLIAMO AGGIORNARLO
        Thread t2 = new Thread(obj2);

        t1.getName(); //vediamo che i thread hanno un nome, se non li impostiamo il nome è thread-n (dove n è il numero del thread)
        t1.setName("Hi"); //POSSIAMO ANCHE DARE UN NOME AL THREAD

        t1.getPriority(); //ogni thread normalmente ha la default priority, ovvero 5. La priority va da 1 a 10. (dal meno al più)
        t1.setPriority(10); //POSSIAMO IMPOSTARE LA PRIORITA'




        t1.start(); //possiamo usare questo metodo quando si tratta di Thread
        try { Thread.sleep(10); } catch(Exception e) { }
        t2.start();

        //obj.start(); questo metodo va bene quando usiamo extends Thread, ma non quando usiamo implements Runnable //QUESTO E' UN METODO DI THREAD, CHIAMARE START CHIAMA AUTOMATICAMENTE RUN, NON SERVE CHIAMARLO A PARTE
        //try { Thread.sleep(10); } catch(Exception e) { } //CON QUESTO DELAY TUTTO FUNZIONA COME DOVREBBE, altrimenti overlad nello scheduler
        //obj2.start();

        //questo fa in modo che i due thread precedenti finiscano prima di partire con qualcosa di nuovo
        t1.join();
        t2.join();

        t1.isAlive(); //questo darà FALSE, perché una volta che il thread finisce è DEAD

        System.out.println("Bye");
    }
}
