public class BubbleSort {
    public static int[] bubbleSort(int tamanho, int[] numeros) {
        for(int i = 0; i < tamanho - 1; i++) {
            if(numeros[i] > numeros[i + 1]) {
                int antigo = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = antigo;
            }
        }
        if(tamanho - 1 > 0) {
            numeros = bubbleSort(tamanho - 1, numeros);
            return numeros;
        } else {
            return numeros;
        }
    }
}
