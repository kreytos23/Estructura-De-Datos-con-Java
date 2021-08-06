package SortsAlgorithms;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int [] arrayManuel = {20,35,-15,7,55,1,-22};
        recursiveInsertionSort(arrayManuel,1);
        printArray(arrayManuel);
    }

    static public void recursiveInsertionSort(int[] array,int ordenado){
        if ( ordenado > array.length -1 || ordenado == 0) {
            return;
        }
        if(array[ordenado] < array[ordenado - 1]){
            int aux = array[ordenado];
            array[ordenado] = array[ordenado - 1];
            array[ordenado - 1] = aux;
            recursiveInsertionSort(array, ordenado-1);
        }
        recursiveInsertionSort(array,ordenado+1);
    }

    static public void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
