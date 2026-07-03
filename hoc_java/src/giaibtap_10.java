import java.util.Scanner;

public class giaibtap_10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào điểm trung bình: ");
        double dtb = sc.nextDouble();
        String traloi = (dtb >= 8) ? "giỏi" : (dtb >= 6.5) ? "khá" : (dtb >= 5) ? "trung bình" : "yếu";
        System.out.println("điểm " + dtb + " là điểm " + traloi);
    }
}
