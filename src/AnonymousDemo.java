interface abcd {
    void walk();
}

class E {
    public void show() {
        System.out.println("in A show");
    }
}

public class AnonymousDemo {
    public static void main(String[] args) {
        E obj = new E() { //quando mettiamo un blocco di codice dopo una dichiarazione del genere, tale classe diventa una classe anonima, in questo modo possiamo
                            // riscrivere metodi che vogliamo cambiare, usata per scrivere classi usate UNA SOLA VOLTA
          public void show() {
              System.out.println("Best");
          }
        };
        obj.show(); //questo metodo è il nuovo metodo nella classe anonima, darà "Best" come output

        //la tecnica sopra illustrata può essere usata per istanziare un'interfaccia

        abcd obj2 = new abcd() { //in questo modo abbiamo, in un certo senso, istanziato un'interfaccia usando una classe anonima per implementare il suo metodo
            public void walk() {
                System.out.println("Walking...");
            }
        };
        obj2.walk();
    }
}
