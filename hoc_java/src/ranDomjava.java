import java.util.Random;

public class ranDomjava {
    public static void main(String[] args) {
        //khởi tạo 1 đối tượng ngẫu nhiên
        Random rd = new Random();
        //lấy ngẫu nhiên 1 số nguyên
        int soNguyen = rd.nextInt(-50, 51); //chạy từ -51 đến < 51
        System.out.println(soNguyen);

        //chạy ngẫu nhiên số thực:
        double x = rd.nextDouble(-100, 101);
        System.out.println(x);
    }
}
