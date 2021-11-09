public class IterationDemo {
    public static void main(String[] args) {

        int n = 10;
        while(n >= 1) { //UN ESEMPIO DI WHILE LOOP: viene valutata una condizione iniziale e in base a quella viene eseguito il codice all'interno del blocco
                        // importante -> il ciclo while potrebbe non essere eseguito nemmeno una volta, se vogliamo essere sicuri che il ciclo venga eseguito almeno una volta usiamo il ciclo DO-WHILE
            System.out.println(n);
            n--; //IMPORTANTISSIMO MODIFICARE IL VALORE DEL CONTATORE PER IMPEDIRE CICLI INFINITI, dobbiamo per forza modificare la variabile che viene valutata
        }

        int y = 0;
        do { //DO-WHILE VIENE USATO NEL CASO IN CUI SI VOGLIA ESSERE SICURI DI ESEGUIRE IL CORPO DEL CICLO ALMENO UNA VOLTA
            System.out.println("Ciao " + y);
            y++; //anche qui è necessario modificare la variabile contatore, altrimenti si ricade nel ciclo infinito
        } while(y <= 10); //la condizione è verificata solamente dopo la prima esecuzione, se è falsa uscirà subito ma il ciclo sarà eseguito almeno una volta

        for(int i = 0; i < 10; i++) { //ESEMPIO DI FOR LOOP, qui tutte le condizioni sono condensate in una linea: dichiarazione contatore, condizione e aggiornamento
            System.out.println("Ciclo for " + i);
        }

        //quando conosciamo il punto di inizio e il punto di fine -> SEMPRE USARE FOR LOOP
        //non sappiamo quando finirà il ciclo (ad esempio se prendiamo input da user) -> SEMPRE USARE WHILE
        //se vogliamo che il ciclo venga eseguito almeno una volta -> USARE DO-WHILE

        for(int x = 0; x < 4; x++) { //ESEMPIO DI NESTED LOOPS: CICLI ANNIDATI, qui c'è il ciclo più esterno
            for(int z = 0; z < 4; z++) { //qui c'è il ciclo più interno, stampiamo un quadrato in questo modo
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
