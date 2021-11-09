
class Emp {
    int eid;
    int salary;
    static String ceo = "Mario"; //STATIC VUOL DIRE CHE NON E' SPECIFICA PER OGNI VARIABILE, E' COSTANTE E UGUALE PER OGNI ISTANZA, NON SERVE SPECIFICARLO PER OGNI ISTANZA

    //ANCHE I METODI POSSONO ESSERE STATIC, IN QUESTO MODO NON AVREMO BISOGNO DI UN OGGETTO PER CHIAMARLO, ma ci basterà la classe
    //PURE UN BLOCCO PUO' ESSERE STATIC

    public void show() {
        System.out.println(this.eid + ":" + this.salary + ":" + Emp.ceo);
    }

}

public class StaticDemo {
    public static void main(String[] args) {
        Emp navin = new Emp();
        navin.eid = 8;
        navin.salary = 4000;

        Emp raul = new Emp();
        raul.eid = 9;
        raul.salary = 5000;

        navin.show();
        raul.show();
    }
}
