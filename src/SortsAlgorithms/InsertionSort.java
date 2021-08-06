package SortsAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arrayManuel = {20,35,-15,7,55,1,-22};
        insertionSort(arrayManuel);
        printArray(arrayManuel);
    }

    static public void insertionSort(int[] array){
        for (int i = 1; i < array.length ; i++) {
            if(array[i-1] > array[i]){
                for (int j = i-1; j >= 0; j--) {
                    if(array[j] > array[j+1]){
                        int aux = array[j];
                        array[j] = array[j+1];
                        array[j+1] = aux;
                    }else{
                        break;
                    }
                }
            }
        }
    }

    static public void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
