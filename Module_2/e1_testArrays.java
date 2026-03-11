package Module_2;

import java.util.Arrays;

public class e1_testArrays {
    
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 5;
        }
        System.out.println(Arrays.toString(array));
        array[1] = 23;
        System.out.println(Arrays.toString(array));
        // array[2] = 1.5; not possible because is no integer
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " = " + array[i]);
        }
    }
}
