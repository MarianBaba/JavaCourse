public class JumpDemo {
    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++) {
           if(i == 7) {
             continue; //nel momento in cui il ciclo arriva a 7, salta questa iterazione e passa alla prossima, non viene eseguita nessuna istruzione
        }
            System.out.println(i);
        }

        for(int i = 0; i <= 10; i++) {
            if(i == 5) {
                break; //break fa uscire completamente dal ciclo, quando incontra questa keyword, si esce dal ciclo senza fare altre iterazioni
            }
            System.out.println(i);
        }

        //ESERCIZIO
        int counter = 1;
        for(int i = 1; i <= 6; i++) {
            for(int j = 1; j <= counter; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
            counter++;
        }

    }
}
