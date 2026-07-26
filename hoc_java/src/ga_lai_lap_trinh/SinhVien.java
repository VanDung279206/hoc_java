package ga_lai_lap_trinh;

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
}
