package com.learing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) throws Exception { //QUI VEDIAMO UN UTILIZZO CONCRETO DI TRY-CATCH-FINALLY CON UNA RISORSA CHE LEGGE INPUT
        int n = 0;
        System.out.println("Enter a number");

        BufferedReader br = null;
        try { //prima di tutto, apriamo la risorsa dichiarandola e dando la possibilità di immettere input
            br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
        } catch(Exception e) { //nel caso in cui l'input fornito non sia valido, il programma dà un'eccezione
            System.out.println("Errore: " + e);
        } finally { //alla fine, quando il processo è terminato, LA RISORSA VIENE CHIUSA
            br.close();
        }
        //questa è la struttura standard
    }
}
