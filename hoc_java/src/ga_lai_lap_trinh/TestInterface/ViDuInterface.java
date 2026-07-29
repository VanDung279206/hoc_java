package ga_lai_lap_trinh.TestInterface;

public interface ViDuInterface {
    //tập cáo thuộc tính (chỉ được phép là hằng số)
    static final double phuCap = 15;
    //các phương thức là trừu tượng - abstruct
    public abstract void thongTin(String ten, String cccd, int namSinh);
    public abstract double tinhLuong(double luongNgay, int soNgayCong);
}
