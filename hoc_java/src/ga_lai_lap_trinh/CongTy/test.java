package ga_lai_lap_trinh.CongTy;

public class test {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Nhân Viên 1", "Bắc Giang", 111111111);
        double luongNV1 = nv1.tinhLuong();
        System.out.println("lương nhân viên 1 là: " + luongNV1);

        //tạo đối tượng là nhân viên hành chính
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("Hành Chính 1", "Lạng Sơn", 222222222);
        double luongHC1 = hc1.tinhLuong();
        System.out.println("lương hành chính 1 là: " + luongHC1);

        //tạo nhân viên đi ca
        NhanVienDiCa ca1 = new NhanVienDiCa("Đi Ca 1", "Bắc Ninh", 333333333);
        double luongDC1 = ca1.tinhLuong();
        System.out.println("lương nhân viên đi ca 1 là: " + luongDC1);

    }
}
