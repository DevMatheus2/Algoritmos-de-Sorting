import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Application {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int tamanho; // = 8000;
    static int max = 10000;
    static int[] numeros;

    public static void run() {

        numeros = gerarArrayAleatorio(tamanho, max, random);
        //String filePath = "../Algoritmos de Sorting/resources/decrecente_10000.csv";
        //try {
        //    List<String> lines = Files.readAllLines(Paths.get(filePath));
        //    numeros = lines.stream().skip(1).mapToInt(Integer::parseInt).toArray();
        //} catch (IOException e) {
        //    System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        //}
        tamanho = numeros.length;
        int[] sortedNumeros = new int[]{0};
        int opcaoSort = 0;
        long inicio = 0;
        long fim = 0;

        while (opcaoSort < 1 || opcaoSort > 3) {

            System.out.println("Escolha a sua opção de sorting:\n1 - Bubble Sort\n2 - Insertion Sort\n3 - Quick Sort\nOpção:");
            opcaoSort = scanner.nextInt();

            switch (opcaoSort) {
                case 1 -> {
                    inicio = System.nanoTime();
                    sortedNumeros = BubbleSort.bubbleSort(tamanho, numeros);
                    fim = System.nanoTime();
                }
                case 2 -> {
                    inicio = System.nanoTime();
                    sortedNumeros = InsertionSort.insertionSort(numeros);
                    fim = System.nanoTime();
                }
                case 3 -> {
                    inicio = System.nanoTime();
                    sortedNumeros = QuickSort.quickSort(0, tamanho - 1, numeros);
                    fim = System.nanoTime();
                }
                default -> System.out.println("Opção inválida, por favor, digite uma das opções abaixo...");
            }
        }

        long tempoExecucao = fim - inicio;

        for (int num : sortedNumeros) {
            System.out.println(num);
        }

        System.out.println("Tempo de execução em nanosegundos: " + tempoExecucao);
    }

    public static int[] gerarArrayAleatorio(int tamanho, int max, Random random) {
        int[] numeros = new int[tamanho];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(max) + 1; // Gera números entre 1 e 1000
        }

        return numeros;
    }
}
