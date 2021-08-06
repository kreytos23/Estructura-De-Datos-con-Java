package SortsAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arrayManuel = {5,10,-85,6,4,22,-3};
        selectionSort(arrayManuel);
        printArray(arrayManuel);
    }

    static public void selectionSort(int[] array){
        for (int i = array.length - 1; i > 0 ; i--) {
            int largestIndex = 0;
            for (int j = 1; j <= i; j++) {
                if(array[largestIndex] < array[j]){
                    largestIndex = j;
                }
            }
            int aux = array[i];
            array[i] = array[largestIndex];
            array[largestIndex] = aux;
        }
    }

    static public void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
