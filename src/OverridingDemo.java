class Aa {
    public void show() {
        System.out.println("In A");
    }
    public void config() {

    }
}

class Bb extends Aa {
    @Override
    public void show() {
        super.show(); //COSI POSSIAMO CHIAMARE ENTRAMBI GLI SHOW, SIA QUELLO DI AA SIA QUELLO DI BB, nel caso li volessimo usare entrambi, si può fare anche con le variabili ovviamente
        System.out.println("In B"); //SE RISCRIVIAMO UN METODO EREDITATO DA UNA CLASSE PADRE, STIAMO PRATICANDO OVERRIDING DI METODO
    }
    public void method3() {

    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Bb obj1 = new Bb();
        obj1.show(); //chiamiamo il metodo di Bb, ovvero quello nuovo

        //possiamo fare una cosa strana: creare un riferimento di tipo Aa abbinato a un oggetto di tipo bb, questo si può fare perché sono imparentate
        Aa obj2 = new Bb();
        obj2.show(); //questo chiamerà IL METODO DI BB PERCHE' L'OGGETTO E' BB, AA E' SOLAMENTE UN RIFERIMENTO, però possiamo chiamare solamente metodi in Aa, se vengono aggiornati da Bb verrà chiamata quella versione
        obj2.config();

        //se alla stessa variabile si assegna un nuovo oggetto, e quello stesso oggetto è imparentato con l'oggetto precedente e ha un metodo uguale, verrò chiamato il
        // metodo del nuovo oggetto, questo si chiama DYNAMIC METHOD DISPATCH

    }
}
