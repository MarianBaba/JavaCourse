
class C {
    final int I = 0; //NON POSSIAMO PIU' CAMBIARE UNA VARIABILE CHE DICHIARIAMO COME FINAL, ovvero diventa una COSTANTE
    public C() {
        //I = 10; questo è illegale, perché I ha già un valore
    }
}

final class D { //possiamo impostare anche una classe come FINAL, questo vuol dire che QUESTA CLASSE NON PUO' ESSERE PADRE DI NESSUN'ALTRA CLASSE
    public final void show() { //se impostiamo un metodo come FINAL, esso non può essere aggiornato, ovvero non si può fare overriding
        //do something
    }
}

//class A extends D -> ILLEGALE

public class FinalDemo {
    public static void main(String[] args) {
        C obj = new C();
    }
}
