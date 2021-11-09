class Calc {

    //questo è ciò che l'oggetto CONOSCE, ovvero i suoi attributi, i dati
    int num1;
    int num2;
    int result;

    //DI DEFAULT JAVA DA UN COSTRUTTORE, CHE ALLORA SEMPLICEMENTE LA MEMORIA, ma possiamo definirne uno nostro
    public Calc() { //I COSTRUTTORI HANNO LO STESSO NOME DELLA CLASSE E NON HANNO UN TIPO DI RITORNO, se mettiamo un tipo di ritorno diventa un semplice metodo
        num1 = 5;
        num2 = 5;
        System.out.println("In costruttore");
    }
    //possiamo avere due costruttori, o più, MA DEVONO AVERE LA LISTA DI PARAMETRI DIVERSA, LA SIGNATURE DEVE CAMBIARE QUINDI
    public Calc(int num1, int num2) {
        this.num1 = num1; //THIS SI RIFERISCE ALL'OGGETTO CORRENTE (vuol dire che this.num1 NON E' LOCALE, il suo scope è maggiore)
        this.num2 = num2;
    }
    public Calc(int a, float b) {
        num1 = a;
        num2 = (int)b;
    }

}

public class ObjectDemo {
    public static void main(String[] args) {
        Calc obj; //QUESTO E' UN RIFERIMENTO
        obj = new Calc(); //PER ISTANZIARE UN OGGETTO, OVVERO fare in modo che il riferimento punti a quell'oggetto in memoria dobbiamo usare la new e invocare il costruttore


    }
}
