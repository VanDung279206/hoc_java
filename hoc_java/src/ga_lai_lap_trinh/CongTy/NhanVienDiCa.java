package ga_lai_lap_trinh.CongTy;

public class NhanVienDiCa extends NhanVien {
    public NhanVienDiCa(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * 1.1; // cao hơn 10% so với nhân viên bth
    }
}
