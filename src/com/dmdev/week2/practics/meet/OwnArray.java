package com.dmdev.week2.practics.meet;

import java.util.Arrays;

public class OwnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 0;
        int element = 77;
//      System.out.println(Arrays.toString(deleteElement(array, index)));
//      addElement(array, index);
        System.out.println(Arrays.toString(addElementForIndex(array, index, element)));
    }

    private static int[] addElementForIndex(int[] array, int index, int element) {
        int[] result = new int[array.length + 1];
        int count = 0;
        for (int i = 0; i <= array.length; i++) {
            if (i == index) {
                result[count] = element;
            } else {
                result[i] = array[count];
                count++;
            }
        }
        return result;
    }

    private static int[] deleteElement(int[] array, int index) {
        int[] result = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            int count = i;
            if (i != index) {
                if (i > index) {
                    count = i - 1;
                }
                result[count] = array[i];
            }
        }
        return result;
    }
}
