class A {
    public A() {
        System.out.println("In A");
    }
    public A(int i) {
        System.out.println("In A int");
    }
}

class B extends A { //ORA B E' UNA SOTTOCLASSE MENTRE A E' UNA SUPERCLASSE
    public B() {
        super(); //ANCHE SE NON LO SI SPECIFICA VIENE MESSA AUTOMATICAMENTE QUESTA CHIAMATA AL COSTRUTTORE DELLA SUPERCLASSE
        System.out.println("In B");
    }
    public B(int i) {
        super(i); //se non metti nessun parametro, si può anche chiamare un diverso costruttore, in questo modo chiamiamo i due costruttori che hanno come parametro int
        System.out.println("In B int");
    }
}


public class SuperDemo {
    public static void main(String[] args) {
        B obj1 = new B(5); //VEDIAMO CHE QUANDO CHIAMIAMO IL COSTRUTTORE DI B, ESSO CHIAMA ANCHE IL COSTRUTTORE DELLA SUPERCLASSE A
    }
}
