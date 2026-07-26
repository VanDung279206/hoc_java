package ga_lai_lap_trinh;

public class oop_1 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien();
        sv3.hienThiThongTin();
        System.out.println(sv3.getDiem());
        System.out.println(sv3.getHoTen());
        // thay đổi tên sv3
        sv3.setHoTen("Nguyễn Văn Dũng");
        sv3.setDiem(10);
        sv3.hienThiThongTin();
        double dtbsv3 = sv3.tinhDTB(9, 10);
        System.out.println(dtbsv3);
        System.out.println(sv3);

        //support method và service method
        sv3.checkHopLeDiem();
    }
}
