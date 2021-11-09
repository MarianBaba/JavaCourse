class Calculator {
    public int add(int ... i) { //IL NUMERO DI PARAMETRI E' VARIABILE E JAVA LO TRASFORMERA' IN UN ARRAY
        int result = 0;
        for(int n : i) { //visto che non sappiamo quanti sono usiamo un for-each per scandirli tutti
            result += n;
        }
        return result;
    }
}

public class VarargsDemo {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(10, 10,123,123,45354,545,2,4,6,2,21,33));
    }
}
