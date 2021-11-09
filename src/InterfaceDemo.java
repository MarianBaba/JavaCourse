//TIPI DI INTERFACCIA:
// 1. normale
// 2. Single abstract method (avrà un solo metodo) - Functional interface -> LAMBDA EXPRESSION
// 3. Marker interface (non ha metodi)

@FunctionalInterface //possiamo anche annotare questa cosa, il compilatore ti impedirà di scrivere più di un metodo
interface abc {
    void show();
}

class Implementer implements abc {
    public void show() {
        System.out.println("Nothing");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        abc obj = new Implementer(); //possiamo creare un riferimento a un'interfaccia, ma non istanziarla
        obj.show();

        abc obj1 = () -> { //in realtà possiamo fare una specie di istanza con le LAMBDA
            System.out.println("LAMBDA EXPRESSION"); //SCRIVERE QUESTE ESPRESSIONI VA BENE SOLO CON LE FUNCTIONAL INTERFACES (altrimenti ci sarebbe ambiguità, serve al massimo un metodo)
        };

    }
}
