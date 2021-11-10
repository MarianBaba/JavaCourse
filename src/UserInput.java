import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in); //OGGETTO SCANNER, all'interno dobbiamo passare un oggetto che indica da DOVE RICEVIAMO INPUT (dalla tastiera -> System.in)
        n = sc.nextInt(); //in vantaggio di fare questo è che NON E' NECESSARIO GESTIRE L'ERRORE, inoltre non devi convertire l'input
        //la classe scanner ha metodi simili PER TUTTI I TIPI PRIMITIVI, che un utente può passare in input

        System.out.println(n);
    }
}
