package DataStructures.HashTables.BucketSort;

import java.util.*;

public class BucketSort {
    public static void main(String[] args) {
        Map<Integer, LinkedList<Integer>> hashMap = new HashMap<Integer, LinkedList<Integer>>();
        int[] array = {54, 46, 83, 95, 92, 43,3,21,0,100,111,6000,2000};

        for (int i = 0; i < array.length; i++) {
            int key = array[i] / 10;
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, new LinkedList<Integer>());
            }
            hashMap.get(key).add(array[i]);
        }

        int index = 0;
        for (int i = 0; i < 10 ; i++) {
            try {
                Collections.sort(hashMap.get(i));
                Iterator iterator = hashMap.get(i).iterator();
                while (iterator.hasNext()){
                    array[index++] = Integer.parseInt(iterator.next().toString());
                }
            }catch (NullPointerException ex){
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
