
class Outer {
    int a;
    public void show() {

    }
    static class Inner { //POSSIAMO SCRIVERE UNA CLASSE ALL'INTERNO DI UN'ALTRA CLASSE E POSSIAMO AVERE ANCHE UNA CLASSE STATIC -> per accedere a questa classe (o meglio al suo costruttore) ci serve solo il nome della classe esterna e non un oggetto
        public void display() {
            System.out.println("in display");
        }
    }
}

public class InnerDemo { //in questo file abbiamo 3 CLASSI
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        //Inner obj1 = new Inner(); QUESTO NON VA BENE, è fuori dal nostro scope Inner, dobbiamo trovare un altro modo per accedervi
        Outer.Inner obj1 = new Outer.Inner(); //ABBIAMO BISOGNO DELL'OGGETTO DI OUTER E POI POSSIAMO ACCEDERE ALLA CLASSE INTERNA ISTANZIANDO UN OGGETTO, o se è static possiamo scrivere solo il nome della classe esterna
        obj1.display();
    }
}
