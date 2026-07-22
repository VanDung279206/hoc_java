package ga_lai_lap_trinh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class collecttion {
    public static void main(String[] args) {
        // khai báo list
        ArrayList<Integer> lst = new ArrayList<>();

        // khai báo phần tử ban đầu
        ArrayList<Integer> lst2 = new ArrayList<>(5);

        // khởi tạo các phẩn tử sẵn có
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1, 2, 4, 6, 6));
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);

        //  CÁC PHƯƠNG THỨC
        // add(index, element) : thêm 1 phần tử
        // size() : trả về số phần tử của list
        // get(int index) : trả về giá trị list tahi vị trí index
        // remove(int index) : xóa theo vị trí index chỉ định
        // ...

        ArrayList<Integer> lst4 = new ArrayList<>();
        lst4.add(8);
        lst4.add(12);
        lst4.add(13);
        lst4.add(1, 13);
        System.out.println("lst4 mới add là: " + lst4);


        // duyệt list
        for (int x : lst3) {
            System.out.print(x + "\t");
        }

        for (int i = 0; i < lst3.size(); i++) {
            int x = lst3.get(i);
            System.out.print(x + "\t");
        }
    }
}
