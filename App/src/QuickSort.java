public class QuickSort {
    public static int[] quickSort(int inicio, int fim, int[] numeros) {
        if(inicio < fim) {
            int menores = inicio;
            int auxNum;
            for (int i = inicio; i <= fim - 1; i++) {

                if (numeros[i] < numeros[fim]) {
                    auxNum = numeros[menores];
                    numeros[menores] = numeros[i];
                    numeros[i] = auxNum;
                    menores++;
                }
            }
            auxNum = numeros[menores];
            numeros[menores] = numeros[fim];
            numeros[fim] = auxNum;
            quickSort(inicio, menores - 1, numeros);
            quickSort(menores + 1, fim, numeros);
        }
        return numeros;
    }
}
