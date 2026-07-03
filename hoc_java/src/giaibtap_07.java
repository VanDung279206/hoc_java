import java.util.Scanner;

public class giaibtap_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("mời nhập vào 1 tháng bất kỳ: ");
        int thang = sc.nextInt();
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            System.out.println("tháng " + thang + " có 31 ngày");
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("tháng " + thang + " có 30 ngày");
        } else if (thang == 2) {
            System.out.print("nhập vào năm: ");
            int nam = sc.nextInt();
            if ((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0)) {
                System.out.println("tháng " + thang + " năm " + nam + " có 29 ngày");
            } else {
                System.out.println("tháng " + thang + " năm " + nam + " có 28 ngày");
            }
        }
    }
}
