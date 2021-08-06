package SortsAlgorithms;

public class MergeSort {
    public static void main(String[] args) {
        //int [] arrayManuel = {20,35,-15,7,55,1,-22};
        int [] arrayManuel = generarMatriz();
        long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis();
        mergeSort(arrayManuel);
        printArray(arrayManuel);
        TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);

    }

    public static void mergeSort(int[] array){
        separarElementos(array,0,array.length-1);
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

    public static void separarElementos(int[] elementos,int left,int right){
        if (left < right){
            int middle = (left + right) / 2;

            separarElementos(elementos, left, middle);
            separarElementos(elementos,middle +1 , right );

            merge(elementos, left, middle, right);
        }
    }

    public static void merge(int[] elementos, int left,int middle, int right){
        if(elementos[middle] <= elementos[middle+1]){
            return;
        }

        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] array1 = new int[n1];
        int[] array2 = new int[n2];

        for (int i=0; i<n1;i++){
            array1[i] = elementos[left + i];
        }
        for (int j=0; j < n2; j++) {
            array2[j] = elementos[j + middle + 1];
        }

        int l = 0;
        int r = 0;

        while (l != n1 && r != n2){
            if(array1[l] <  array2[r]){
                elementos[left] = array1[l];
                l++;
            }else{
                elementos[left] = array2[r];
                r++;
            }
            left++;
        }

        while(l < n1){
            elementos[left] = array1[l];
            l++;
            left++;
        }

        while(r < n2){
            elementos[left] = array2[r];
            r++;
            left++;
        }
    }
}
