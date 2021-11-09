package com.learing;

public class ExceptionDemo {
    public static void main(String[] args) {
        //per gestire le eccezioni usiamo il costrutto try/catch
        try {
            int i = 1 / 0;
        } catch(ArrayIndexOutOfBoundsException | ArithmeticException e){ //possiamo prendere più eccezioni, basta separarle con | (per prenderne una generica -> Exception)
            System.out.println("Errore: " + e);
        }
        System.out.println("Bye"); //è importantissimo vedere come il costrutto try/catch ci permette di far andare avanti l'esecuzione nonostante l'errore, se non ci fosse SI FERMEREBBE

        //per alcune situazioni, il compilatore sa che ci potrebbe essere un'eccezione (checked exceptions) e ti invita a gestire l'eccezioni, alcune eccezioni non sono checked

        //POSSIAMO ANCHE DEFINIRE LE NOSTRE ECCEZIONI, ad esempio
        int j, z;
        j = 8;
        z = 9;

        try {
            int k = j / z;

            if(k == 0) {
                throw new PersonalException("This is not possibile"); // POSSIAMO DEFINIRE COSI' ECCEZIONI COME VOGLIAMO: THROWS, dobbiamo però creare una nuova classe
            }
        } catch (Exception e) {
            System.out.println("Errore personale" + e); //GESTIAMO L'ECCEZIONE GENERALE, PERCHE' IN OGNI CASO LA NOSTRA E' FIGLIA DELLA CLASSE EXCEPTION
        }
    }
}
