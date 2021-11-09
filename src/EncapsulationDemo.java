class Student {
    //mettiamo le variabili private per assicurarci che non siano accessibili dall'esterno
    private int rollno; //DOVREMMO ASSICURARCI CHE GLI ATTRIBUTI DI UNA CLASSE SIANO RAGGIUNGIBILI SOLAMENTE TRAMITE METODI, SIA PER CAMBIARLI SIA PER LEGGERLI (GETTERS E SETTERS)
    private String name;

    //setters (per la modifica)
    public void setRollno(int r) {
        rollno = r;
    }
    //getters (per il fetch)
    public int getRollno() {
        return rollno;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

public class EncapsulationDemo { //incapsulamento -> binding metodi e dati
    public static void main(String[] args) {
        Student s1 = new Student();

        //QUESTO CHE VEDIAMO SOTTO E' POCO CONSIGLIABILE, QUESTE VARIABILI DOVREBBERO ESSERE ACCESSIBILI SOLAMENTE TRAMITE METODI
        //s1.rollno = 2;
        //s1.name = "Marian";

        //QUESTO E' IL METODO GIUSTO, ATTRAVERSO I METODI
        s1.setRollno(10);
        System.out.println(s1.getRollno());

        s1.setName("Mario");
        System.out.println(s1.getName());
    }
}
