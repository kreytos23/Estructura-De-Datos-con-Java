package SortsAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arrayManuel = generarMatriz();
        //int [] arrayManuel = {5,10,-85,6,4,22,-3};
        bubbleSort(arrayManuel);
        printArray(arrayManuel);
    }

    static public void bubbleSort(int [] array){
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j<i ; j++) {
                int aux = 0;
                if(array[j] > array[j+1]){
                    aux = array[j+1];
                    array[j+1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    static public void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static public int[] generarMatriz(){
        int [] arrayManuel = new int[1000000];
        for (int k=0; k<1000000; k++){
            arrayManuel[k] = -1000 + (int) (Math.random() * ((2000 - (-1000)) + 1));
        }
        return arrayManuel;
    }
}
