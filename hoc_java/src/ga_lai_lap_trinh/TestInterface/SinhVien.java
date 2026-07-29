package ga_lai_lap_trinh.TestInterface;

public class SinhVien {
    //thuoc tinh (giong voi cac bien)
    private String hoTen;
    private double diem;

    // constructor mac dinh
    //khoi tao cac gia tri mac dinh ngay khi doi tuong vua duoc tao ra
    public SinhVien() {
        hoTen = "Nguyen Van Dung";
        diem = 10;
    }

    //constructor co doi so
    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    // method - phuong thuc (cac ham)
    // method khong co kieu tra ve
    public void hienThiThongTin() {
        System.out.println(hoTen + " : " + diem);
    }

    //phương thức có kiểu trả về
    public double tinhDTB(double diemToan, double diemVan) {
        return (diemToan + diemVan) / 2;
    }

    //pt2
    public double tinhDTB(double diemToan, double diemVan, double diemAnh) {
        return (diemToan + diemAnh + diemVan) / 3;
    }

    //pt3
    public double tinhDTB(String abc, double diemToan, double diemVan) {
        return diemToan + diemVan;
    }

    //get, set

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    //toString

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }

    //support method
    private boolean checkDiem() {
        return this.diem >= 24;
    }

    //service method có thể gọi từ chương trình chính
    public void checkHopLeDiem() {
        if (checkDiem()) {
            System.out.println("diem hop le");
        } else {
            System.out.println("điểm không hợp lệ");
        }
    }

    //parametter list
    public double tongDiem(double ... arr){
        double tong = 0;
        for(double x : arr){
            tong += x;
        }
        return tong;
    }
}
