package SortsAlgorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CountingSort {
    public static void main(String[] args) {
        int[] arrayManuel = generarMatriz(40);
        int[] countingArr = getBigger(arrayManuel);
        countingSort(arrayManuel,countingArr);
        //Arrays.sort(arrayManuel);
        printArray(arrayManuel);

    }

    static public void countingSort(int[] array, int[] countingArr){
        int valor_actual = 0;
        for (int i = 0; i < array.length; i++) {
            countingArr[array[i]-1]++;
        }
        for (int i = 0; i < countingArr.length; i++) {
            if(countingArr[i] > 0){
                for (int j = 0; j < countingArr[i] ; j++) {
                    array[valor_actual++] = i+1;
                }
            }
        }
    }

    static public int[] getBigger(int [] array){
        int bigger = 0;
        for (int i = 0; i < array.length; i++) {
            bigger = array[i] > bigger? array[i] : bigger;
        }
        return new int[bigger];
    }


    static public void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    static public int[] generarMatriz(int tam){
        int [] arrayManuel = new int[tam];
        for (int k=0; k<tam; k++){
            arrayManuel[k] = (int)(Math.random()*100+1);
        }
        return arrayManuel;
    }
}
