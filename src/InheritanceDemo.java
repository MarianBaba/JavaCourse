class Calculat {
    public int add(int i, int j) {
        return i + j;
    }
}

//immaginiamo di volere introdurre una nuova operazione, ma di non avere accesso al source code, solamente al file classe
class CalcAdvanced extends Calculat { //USIAMO EXTENDS PER DIRE CHE UNA CLASSE E' FIGLIA DI UN'ALTRA
    public int sub(int i, int j) {
        return i - j;
    }
}

//POSSIAMO ANDARE AVANTI COSI' E CREARE CLASSI CHE EREDITA LE CARATTERISTICHE DELLE CLASSI PADRI
//JAVA NON SUPPORTA EREDITARIETA' MULTIPLA

public class InheritanceDemo {
    public static void main(String[] args) {
        CalcAdvanced c2 = new CalcAdvanced();
        System.out.println(c2.add(10,200)); //vediamo che il metodo add FUNZIONA ANCORA, il metodo proviene da Calculat
        System.out.println(c2.sub(200,10));
    }
}
