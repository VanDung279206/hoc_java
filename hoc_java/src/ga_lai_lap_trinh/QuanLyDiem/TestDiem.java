package ga_lai_lap_trinh.QuanLyDiem;

public class TestDiem {
    public static void main(String[] args) {
        //khởi tạo dt khoa toán
        KhoaToan toan1 = new KhoaToan("Nguyễn Văn Dũng", "123456");
        toan1.tinhDTB();

        KhoaAnh anh1 = new KhoaAnh("Tuất Hoàng", "1123124");
        anh1.tinhDTB();

        KhoaVan van1 = new KhoaVan("hải Tộp", "87135");
        van1.tinhDTB();
    }
}
