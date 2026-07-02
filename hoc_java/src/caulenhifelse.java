import java.util.Scanner;

public class caulenhifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào dtb: ");
        double dtb = sc.nextDouble();

        // kiểm tra điều kiện
        if (dtb > 8 && dtb < 10) {
            System.out.println("bạn xếp loại giỏi");
        } else if (dtb >= 7) {
            System.out.println("bạn xếp loại khá");
        } else {
            System.out.println("bạn xếp loại trung bình");
        }
    }
}
