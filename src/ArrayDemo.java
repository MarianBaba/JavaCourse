public class ArrayDemo {
    public static void main(String[] args) {
        int nums[] = new int[4]; //quando definisci la dimensione di un array, diventa FISSA

        nums[0] = 1;
        nums[1] = 56;
        nums[2] = 89;
        nums[3] = 23;

        for(int number : nums) {
            System.out.println(number);
        }

        //possiamo crare array di qualsiasi tipo, anche array di oggetti

        int a[] = {1,2,3,4};
        int b[] = {2,4,6,8};
        int c[] = {5,3,2,6};
        //invece di crare tre array, posso crearne uno bidimensionale: un array che contiene array

        int d[][] = {
                {1,2,3,4},
                {2,4,5,6},
                {3,4,6,7}
        };

        System.out.println(d[0][1]); //primo array, secondo elemento

        for(int i = 0; i < d.length; i++) { //è possibile scorrere array multidimensionali attraverso cicli for annidati
            for(int j = 0; j < d[i].length; j++){ //IMPORTANTISSIMO USARE LENGHT QUANDO NON SI SA QUANTO E' GRANDE L'ARRAY CHE SI VUOLE SCORRERE OPPURE ALL'INTERNO DELL'ARRAY CI SONO ARRAY DI VARIE DIMENSIONI
                System.out.print(" " + d[i][j]);
            }
            System.out.println("");
        }

        //possiamo usare for-each per array bidimensionali? CERTO CHE SI, MA BISOGNA METTERNE DUE, OVVERO UNO ESTERNO E UNO ANNIDATO
        for(int number[]: d) { //inizialmente il ciclo non scandisce interi, ma array, bisogna specificarlo
            for(int l : number) {
                System.out.print(" " + l);
            }
            System.out.println("");
        }
    }
}
