package ga_lai_lap_trinh;

public class oop_1 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Teo", 1);
        sv3.hienThiThongTin();
    }
}
