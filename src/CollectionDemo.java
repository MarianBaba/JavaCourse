import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection values = new ArrayList(); //POSSIAMO CREARE IL RIFERIMENTO A COLLECTION, ovvero un'interfaccia e istanziare un oggetto ArrayList che implementa tale interfaccia
        values.add(5);
        values.add(7);
        values.add(9);

        System.out.println(values);

        Iterator it = values.iterator();
        System.out.println(it.next()); //possiamo usare questo per scorrere gli elementi di values, visto che non funziona con gli index

        while(it.hasNext()) { //per sapere fin dove iterare,
            System.out.println(it.next()); //un costrutto facile per iterare tutti gli elementi in collection
        }

        List values1 = new ArrayList();
        values1.add(1);
        values1.add(2);
        values1.add(1, 5);

        List<Integer> specific = new ArrayList<>(); //cosi possiamo definire che vogliamo una lista di INTERI
        specific.add(10);
        specific.add(9);
        specific.add(8);
        specific.add(7);
        specific.add(1);

        Collections.sort(specific); //METTERE IN ORDINE GLI ELEMENTI
        for(Integer i : specific) {
            System.out.println(i);
        }

        Collections.reverse(specific); //RIMETTERE COM'ERANO INIZIALMENTE GLI ELEMENTI
        for(Integer i : specific) {
            System.out.println(i);
        }
    }
}
