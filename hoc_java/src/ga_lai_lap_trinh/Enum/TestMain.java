package ga_lai_lap_trinh.Enum;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(XepLoai.kha.ordinal());
        System.out.println(XepLoai.yeu.ordinal());

        //tạo list danh sách
        ArrayList<SinhVien> ds = new ArrayList<>();

        //tạo đôi tượng sinh viên
        SinhVien sv1 = new SinhVien(1, "Nguyễn Văn Dũng", 10);
        SinhVien sv2 = new SinhVien(2, "Hoàng Tuất", 5);
        SinhVien sv3 = new SinhVien(3, "hải tuất", 1);

        //add các sinh viên vào ds list
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);

        //duyệt danh sách
        for (SinhVien x : ds) {
            System.out.println(x);
        }
    }
}
