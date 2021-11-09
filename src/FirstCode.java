public class FirstCode {
    public static void main(String[] args) {

        int num = 5; //LE VARIABILI POSSONO COMINCIARE SOLO CON LETTERE, $ E _, E BASTA, ASSOLUTAMENTE NO NUMERI, poi devono essere descrittive
        num = 10; //OGNI TIPO HA UNA DETERMINATA DIMENSIONE, ad esempio int ha 4 byte
        num = 1_000_999_000; //POSSIAMO USARE UNDERSCORE _ PER FAR LEGGERE MEGLIO I NUMERI
        float flt = 5.5F; //BISOGNA METTERE F ALLA FINE DI UN FLOAT PER FARLO SAPERE AL COMPILATORE
        double newnum = 7.6; //DOUBLE E' IL TIPO PRIMITIVO DI DEFAULT PER SALVARE NUMERI CON LA VIRGOLA
        short small = 1; //SHORT SI USA PER NUMERI MOLTO PICCOLI PER RISPARMIARE MEMORIA
        byte smaller = 1; //BYTE USA ANCORA MENO MEMORIA PERCHE' CONTIENE NUMERI ANCORA PIU' PICCOLI
        long big = 834290324374892L; //ANCHE CON LONG DOBBIAMO METTERE LA LETTERA ALLA FINE

        char a = 'A'; //IMPORTANTE: NON USARE "" MA USA '' PER SINGOLI CARATTERI
        a = 66; //QUESTO VA ANCORA BENE PERCHE' LE LETTERE SONO CODIFICATE IN ASCII VALUES

        //NAMING CONVENTIONS: variabili -> devono essere molto espressive, devono esprimere ciò che rappresentano, prima lettera minuscola /
        // classi -> anche questi devono essere espressivi, dovrebbero essere nomi, prima lettera dovrebbe essere maiuscola / interfacce -> dovrebbe essere un aggettivo (-able alla fine), prima lettera maiuscola /
        // metodi -> dovrebbero essere verbi, dovrebbero definire un'azione, prima lettera minuscola / costanti -> devono ESSERE MAISCOLE /
        // inoltre bisognerebbe usare CamelCase, a parte packages e costanti, nelle costanti bisogna usare _ / vantaggi -> codice più leggibile

        System.out.println(num);

    }
}
