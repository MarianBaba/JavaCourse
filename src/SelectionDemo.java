public class SelectionDemo {
    public static void main(String[] args) {
        int n = 5;

        if (n == 0) {   //cosa importante, ma basilare, è meglio sempre costruire un BLOCCO quando abbiamo un condizionamento, ovvero un if-else, altrimenti viene eseguita
                        // solamente la prima istruzione sotto l'if e non le altre, quelle verranno eseguite comunque
            System.out.println("nothing");
        } else if((n % 2) == 0) {
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }

        String answer = ((n%2) == 0) ? "even number" : "odd number"; //questo è un esempio di OPERATORE TERNARIO
        System.out.println(answer);

        int binary = 0;

        switch (binary) { //esempio di costrutto switch -> viene valutata una variabile e il flusso viene indirizzato al caso dove viene trovata una corrispondenza
            case 0: {
                System.out.println("Zero");
                break; // importante: se non scriviamo il break, verranno eseguite tutte le istruzioni sottostanti
            }
            case 1: {
                System.out.println("One");
                break;
            }
            default: { //caso default, COMPLETAMENTE OPZIONALE, questo viene eseguito se non viene trovata nessuna corrispondenza. Se non c'è verrà saltato il costrutto intero
                System.out.println("Il numero non è binario");
                break;
            }
        }
    }
}
