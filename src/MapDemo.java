import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); //Map è un'interfaccia, i suoi elementi hanno una CHIAVE, in questo esempio l'abbiamo resa sicura attraverso <>
        //in una map possiamo RIPETERE I VALORI, MA NON LE CHIAVI, quelle sono uniche
        map.put("myName", "Marian");
        map.put("ceo", "Larry Page");
        map.put("friend", "Luke");

        //how to fetch one value? -> ATTRAVERSO LA CHIAVE
        map.get("myName");

        Set<String> keys = map.keySet(); //QUESTO METODO CI DA TUTTE LE CHIAVI IN ORDINE

        for(String key : keys) {
            System.out.println(map.get(key));
        }
    }
}
