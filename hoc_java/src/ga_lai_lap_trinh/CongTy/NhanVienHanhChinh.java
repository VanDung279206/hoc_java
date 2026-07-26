package ga_lai_lap_trinh.CongTy;

public class NhanVienHanhChinh extends NhanVien {
    public NhanVienHanhChinh(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan*1.05;  // cao hơn 5% so với nv hành chính
    }
}
