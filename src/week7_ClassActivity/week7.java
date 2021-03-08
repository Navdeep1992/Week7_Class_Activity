package week7_ClassActivity;

import java.util.Arrays;
import java.util.Collections;

public class week7 {


    public static void main(String[] args) {
        Integer[] array = new Integer[]{12,34,35,23,76,98,5,17,46,94};

        System.out.println("Displaying in reverse order");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("displaying array in Descending order");
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }


}
