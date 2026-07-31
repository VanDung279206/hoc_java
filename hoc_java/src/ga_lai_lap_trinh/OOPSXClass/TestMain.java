package ga_lai_lap_trinh.OOPSXClass;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain {
    public static void main(String[] args) {
        //tạo list
        ArrayList<SanPham> ds = new ArrayList<>();

        //khởi tạo đối tượng sản phẩm
        SanPham sp1 = new SanPham(1, "SamSung", 1050);
        SanPham sp2 = new SanPham(2, "Iphone", 500);
        SanPham sp3 = new SanPham(3, "HauWei", 800);

        //add sản phẩm vào list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);

        //xem ds sản phẩm trong list
        for(SanPham x : ds){
            System.out.println(x);
        }

        //gọi phương thức sắp xếp
        Collections.sort(ds);
        System.out.println("danh sách sau sắp sếp là: ");
        for(SanPham x : ds){
            System.out.println(x);
        }
    }
}
