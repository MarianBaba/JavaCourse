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
    }
}
