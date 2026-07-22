package ga_lai_lap_trinh;

public class array {
    public static void main(String[] args) {
        // khai báo mảng
        String[] mangStr;
        int[] mangNguyen;
        boolean[] mangBool;

        // khởi tạo mảng kèm theo kích thước
        String[] mangStr2 = new String[15]; // chứa được tối đa 15 phần tử
        int[] mangNguyen2 = new int[7]; // chứa được tối đa 7 phần tử

        // khởi tạo mảng kèm theo giá trị ban đầu
        String[] mangStr3 = new String[]{"chí phèo", "thị nở", "ông giáo"};
        String[] mangStr4 = {"chí phèo", "thị nở", "ông giáo"};
        int[] mangNguyen3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        //truy xuất phần tử của mảng
        System.out.println(mangNguyen3[0]);
        System.out.println(mangNguyen3[1]);
        System.out.println(mangNguyen3[2]);
        System.out.println(mangNguyen3[3]);
        System.out.println(mangNguyen3[4]);
        System.out.println(mangNguyen3[5]);
        System.out.println(mangNguyen3[6]);
        System.out.println(mangNguyen3[7]);
        System.out.println(mangNguyen3[8]);

        // length: trả về số phần tử của mảng
        System.out.println("số phần tử trong mangNguyen3: " + mangNguyen3.length);

        //duyệt mảng for
        for (int x : mangNguyen3) {
            System.out.print(x);
        }
        System.out.println();
        for (int i = 0; i < mangNguyen3.length; i++) {
            System.out.print(mangNguyen3[i] + "\t");
        }
        System.out.println();

        //thay đổi giá trị cho mảng
        mangNguyen3[0] = 100;
        for (int x : mangNguyen3) {
            System.out.print(x + "\t");
        }
    }
}
