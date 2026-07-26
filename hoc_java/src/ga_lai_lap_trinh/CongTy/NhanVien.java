package ga_lai_lap_trinh.CongTy;

public class NhanVien {
    protected String ten;
    protected String que;
    protected int cccd;
    protected double luongCoBan = 850; // 850$

    // constructor alt + insert
    public NhanVien(String ten, String que, int cccd) {
        this.ten = ten;
        this.que = que;
        this.cccd = cccd;
    }

    public double tinhLuong(){
        return luongCoBan;
    }
}
