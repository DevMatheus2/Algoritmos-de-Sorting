public class InsertionSort {

    public static int[] insertionSort(int[] numeros) {
        for(int i = 1; i < numeros.length; i++) {
            for(int ii = i; ii > 0; ii--){
                if(numeros[ii] < numeros[ii - 1]) {
                    int anterior = numeros[ii - 1];
                    numeros[ii - 1] = numeros[ii];
                    numeros[ii] = anterior;
                }
            }
        }
        return numeros;
    }
}
