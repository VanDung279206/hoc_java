package ga_lai_lap_trinh.QuanLyDiem;

public class KhoaVan extends NamHoc2026{
    public KhoaVan(String ten, String cccd){
        super(ten, cccd);
    }

    //override
    @Override
    public void tinhDTB(){
        System.out.println("đây là phương thức của khoa toán");
    }
}
