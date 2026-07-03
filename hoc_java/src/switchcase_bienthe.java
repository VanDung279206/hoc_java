import java.util.Scanner;

public class switchcase_bienthe {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 tháng: ");
        int thang = sc.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng " + thang + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng " + thang + " có 30 ngày");
                break;
            case 2:
                System.out.println("mời nhập năm: ");
                int nam = sc.nextInt();
                if ((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0))
                    System.out.println("tháng " + thang + " năm " + nam + " có 29 ngày");
                else
                    System.out.println("tháng " + thang + " năm " + nam + " có 28 ngày");
                break;
            default:
                System.out.println("làm méo gì có tháng này:)))");
        }
    }
}
