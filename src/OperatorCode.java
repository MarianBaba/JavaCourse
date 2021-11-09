public class OperatorCode {
    public static void main(String[] args) {

        int m = 6, n = 4;
        int r1 = m + n;
        int r2 = m - n;
        int r3 = m * n;
        double r4 = (double) m / n; //IMPORTANTE -> di default questa operazione ci dovrebbe dare un int pari a 1, se cambiamo il tipo della variabile otteniamo 1.0, per ottenere il vero
                                    // valore DOBBIAMO FARE IL CASTING DEL RISULTATO
        int r5 = m % n; //operatore modulo, 6 mod 4 = 2

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

        //operatori di assegnamento e assegnamento composto
        int num1 = 5;
        int num2 = 10;

        num2 += num1; //QUESTO E' UGUALE A num2 = num2 + num1, importantissimo conoscere questo, si può fare con tutti gli operatori aritmetici elementari visti sopra
        num2++; //anche questo è molto importante: è l'operatore di POST INCREMENTO
        num2--; //operatore di POST decremento

        int num3 = 0;
        ++num3; //operatore di PRE incremento

        int num4 = 0;
        int num5 = ++num4; //num4 PRIMA VIENE INCREMENTATO E POI IL VALORE AGGIORNATO VIENE ASSEGNATO A num5, mentre se fosse num4++ PRIMA VERREBBE ASSEGNATO IL VALORE E POI INCREMENTATO
        System.out.println("num5: " + num5);
    }
}
