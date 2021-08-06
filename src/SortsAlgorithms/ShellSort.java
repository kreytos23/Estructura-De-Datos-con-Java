package SortsAlgorithms;

public class ShellSort {
    public static void main(String[] args) {
        //int [] arrayManuel = {20,35,-15,7,55,1,-22};
        int [] arrayManuel = generarMatriz();
        shellSort(arrayManuel);
        printArray(arrayManuel);
    }

    static public void shellSort(int [] array){
        int gap = (int) Math.floor(array.length/2);
        while (gap > 0) {
            for (int i = gap; i < array.length; i++) {
                if (array[i - gap] > array[i]) {
                    for (int j = i - gap; j >= 0; j -= gap) {
                        if (array[j] > array[j + gap]) {
                            int aux = array[j];
                            array[j] = array[j + gap];
                            array[j + gap] = aux;
                        } else {
                            break;
                        }
                    }
                }
            }
            gap = (int) Math.floor(gap/2);
        }
    }

    static public void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static public int[] generarMatriz(){
        int [] arrayManuel = new int[10];
        for (int k=0; k<10; k++){
            arrayManuel[k] = -1000 + (int) (Math.random() * ((2000 - (-1000)) + 1));
        }
        return arrayManuel;
    }
}
