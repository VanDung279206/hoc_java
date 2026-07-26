package ga_lai_lap_trinh.QuanLyDiem;

public class KhoaToan extends NamHoc2026 {
    public KhoaToan(String ten, String cccd){
        super(ten, cccd);
    }

    // override
    @Override
    public void tinhDTB(){
        System.out.println("đây là phương thức của Khoa Toán");
    }
}
