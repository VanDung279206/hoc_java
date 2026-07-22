package ga_lai_lap_trinh;


import java.lang.reflect.Array;
import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        // sắp xếp mảng
        int[] m = {1, 5, 7, 5, 31, 6, 75};
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));

        // đảo ngược mảng
        for (int i = 0, j = m.length - 1; i < j; i++, j--) {
            int tmp = m[i];
            m[i] = m[j];
            m[j] = tmp;
        }

        // xuất mảng
        System.out.println("mảng sau khi đảo ngược: " + Arrays.toString(m));
    }

}
