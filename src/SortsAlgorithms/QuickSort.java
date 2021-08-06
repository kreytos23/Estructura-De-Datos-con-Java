package SortsAlgorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] arrayManuel = generarMatriz();
        //int [] arrayManuel = {5,10,-85,6,4,22,3,11,14,9,15,7};
        quickSort(arrayManuel,0,arrayManuel.length-1);
        printArray(arrayManuel);
    }

    public static void quickSort(int[] array,int left, int right){
        if(left >= right){
            return;
        }
        int pivot = array[right],i=left-1;
        for (int j=left; j<right ; j++) {
            if (array[j] <= pivot) {
                i = swap(array,j,i);
            }
        }
        i = swap(array,right,i);
        quickSort(array, left, i-1);
        quickSort(array,i+1,right);
    }

    static public int swap(int[] array, int j, int i){
        int aux = array[j];
        array[j] = array[++i];
        array[i] = aux;
        return i;
    }

    static public void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static public int[] generarMatriz(){
        int [] arrayManuel = new int[40];
        for (int k=0; k<40; k++){
            arrayManuel[k] = -1000 + (int) (Math.random() * ((2000 - (-1000)) + 1));
        }
        return arrayManuel;
    }
}
