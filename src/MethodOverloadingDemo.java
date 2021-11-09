
class Casio {

    int num1;
    int num2;
    String operation;

    public Casio() { //POSSIAMO FARE OVERLOADING ANCHE DI COSTRUTTORI, IN BASE A QUELLO CHE VOGLIAMO
        num1 = 0;
        num2 = 0;
        operation = "nothing";
    }
    public Casio(int i) {

    }
    public Casio(int i, int j) {

    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
    public void add(int a, int b, int c) { //VEDIAMO CHE ABBIAMO DUPLICATO UN METODO PERO' ABBIAMO CAMBIATO LA SUA SIGNATURE, possiamo farlo quante volte vogliamo
        System.out.println(a + b + c);
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Casio obj = new Casio();
        obj.add(4, 3, 5); //JAVA CAPISCE DA SOLO QUALE METOOD CHIAMARE IN BASE A QUALI E QUANTI SONO I PARAMETRI PASSATI IN INPUT
    }
}
