package ga_lai_lap_trinh;

import java.util.Arrays;
import java.util.Scanner;

public class viDu_array {
    // viết chương trình tạo 1 mảng 1 chiều gồm các phần tử là số nguyên có n
    // phần tử, n do người nhập từ bàn phím
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("mời nhập n: ");
        int n = sc.nextInt();
        // tạo mảng có n phần tử (cấp phát bộ nhớ cho mảng)
        int[] m = new int[n];

        // nhập dữ liệu cho từng phần tử
        for (int i = 0; i < n; i++) {
            System.out.println("m[" + i + "] = ");
            m[i] = sc.nextInt();
        }

        for (int x : m) {
            System.out.print(x + "\t");
        }

        // dùng array.tostring
        System.out.println(Arrays.toString(m));
    }

}
