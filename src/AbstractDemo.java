
abstract class Human { //quando vogliamo che la classe non sia istanziabile, ma che sia solamente usata come padre, possiamo renderla astratta
    public abstract void eat(); //IN UNA CLASSE ASTRATTA SI POSSONO SOLAMENTE DICHIARARE METODI, no corpo, no implementazione
    public abstract void walk();
}

class Man extends Human {
    public void eat() {
        System.out.println("Eating..."); //DOBBIAMO NECESSARIAMENTE IMPLEMENTARE I METODI QUANDO SI ESTENDE UNA CLASSE ASTRATTA
    }
    public void walk() {
        System.out.println("Walking...");
    }
}

class Printer {
    public void show(Integer i) {
        System.out.println(i);
    }
    public void show(Double d) {
        System.out.println(d);
    }
    public void show(Number i) { //Number è una classe astratta, ci fa risparmiare molto codice
        System.out.println(i); //QUESTO METODO SUPPORTA TUTTI I TIPI DI NUMERI QUANDO CHIAMATO, E' LA CLASSE PADRE DI TUTTI I TIPI NUMERO
    }
}


interface Writer { //USIAMO LA KEYWORD INTERFACE per definire un'interfaccia, attraverso questo elemento è possibile ottenere una sorta di "ereditarietà multipla"
    void write(); //non si possono definire dei metodi in un'interfaccia, DI DEFAULT TUTTI I METODI IN UN'INTERFACCIA SONO PUBLIC ABSTRACT
}

class Pen implements Writer { //usiamo IMPLEMENTS per far usare un'interfaccia a una classe, possiamo fare anche extedends "nome" implements "interfaccia1", "interfaccia2"...
    public void write() {
        System.out.println("I'm a pen");
    }
}

class Pencil implements Writer {
    public void write() {
        System.out.println("I'm a pencil");
    }
}

class Kit {
    public void doSomething(Writer p) {
        p.write();
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        //Human obj = new Human(); QUESTO NON SI PUO' FARE PER LE CLASSI ASTRATTE
        Man obj = new Man();
        obj.eat();

        Printer newPrinter = new Printer();
        newPrinter.show(10); //SE AVESSIMO MESSO UN NUMERO DOUBLE NON AVREBBE SUPPORTATO L'INVOCAZIONE
        newPrinter.show(5.5); //INFATTI DOBBIAMO USARE QUESTO, MA... POSSIAMO USARE il metodo con Number

        Kit k = new Kit();
        Writer p = new Pen();
        Writer pc = new Pencil();

        k.doSomething(pc);
        //(non è possibile istanziare un'interfaccia ovviamente)
    }
}
