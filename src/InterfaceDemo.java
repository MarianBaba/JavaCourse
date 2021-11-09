//TIPI DI INTERFACCIA:
// 1. normale
// 2. Single abstract method (avrà un solo metodo) - Functional interface -> LAMBDA EXPRESSION
// 3. Marker interface (non ha metodi)

@FunctionalInterface //VEDIAMO CHE NON CI DA UN ERRORE ANCHE SE CI SONO DUE METODI: l'importante è che ci sia un metodo astratto, solo uno di quello, mentre possiamo averne altri default
interface Demo { //vediamo come possiamo definire un metodo in un'interfaccia
    void abc();
    default void show() { //E' DEFAULT LA KEYWORD IMPORTANTE CHE CI PERMETTE DI FARE QUESTO
        System.out.println("In show");
    }
    static void hello() {
        System.out.println("Hello"); //POSSIAMO ANCHE SCRIVERE METODI STATIC, A CUI POSSIAMO ACCEDERE TRAMITE SOLO IL NOME DELL'INTERFACCIA
    }
}

@FunctionalInterface //possiamo anche annotare questa cosa, il compilatore ti impedirà di scrivere più di un metodo
interface abc {
    void show();
}

class Implementer implements abc {
    public void show() {
        System.out.println("Nothing");
    }
}

class DemoImp implements Demo {
    public void abc() {
        System.out.println("");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        abc obj = new Implementer(); //possiamo creare un riferimento a un'interfaccia, ma non istanziarla
        obj.show();

        abc obj1 = () -> { //in realtà possiamo fare una specie di istanza con le LAMBDA
            System.out.println("LAMBDA EXPRESSION"); //SCRIVERE QUESTE ESPRESSIONI VA BENE SOLO CON LE FUNCTIONAL INTERFACES (altrimenti ci sarebbe ambiguità, serve al massimo un metodo)
        };

        Demo obj2 = new DemoImp();
        obj2.abc();
        obj2.show(); //POSSIAMO DEFINIRE METODI NELLE INTERFACCE CON JAVA.8 ATTRAVERSO LA KEYWORD DEFAULT

        Demo.hello(); //possiamo accedere a un metodo dell'interfaccia
    }
}
