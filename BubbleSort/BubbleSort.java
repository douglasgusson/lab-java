import javax.swing.JOptionPane;

/**
 * Bubble Sort
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        int i;

        for (i=0; i<10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i+1) +"º numero inteiro: "));
        }

        BubbleSort bubbleSort = new BubbleSort();

        System.out.println("Sequencia digitada: ");
        bubbleSort.imprimirVetor(numeros);

        numeros = bubbleSort.ordenarVetor(numeros);

        System.out.println("Vetor ordenado: ");
        bubbleSort.imprimirVetor(numeros);


    }

    /**
     * Exibe os valores do vetor no console
     */
    private void imprimirVetor(int[] array) {
        for (int x : array) {
            System.out.print(x +" ");
        }
        System.out.print("\n");
    }

    /**
     * Ordena o vetor
     */
     private int[] ordenarVetor(int[] array) {
         int swap, i, j;
         for (i=0; i<array.length; i++) {
             for (j=0; j<(array.length-1); j++) {
                 if (array[j] > array[j+1]) {
                     swap = array[j];
                     array[j] = array[j+1];
                     array[j+1] = swap;
                 }
             }
         }
         return array;
     }

}
