package commit;

import java.util.Scanner;

public class giaibtap_11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("mời bấm số để chọn:\n1. tìm theo tên\n2. tìm theo tác giả\n3. tìm theo nhà xuất bản\n4. tìm theo tiêu đề\n");
        int so = sc.nextInt();
        switch (so){
            case 1:
                System.out.println("tìm theo tên");
                break;
            case 2:
                System.out.println("tìm theo tác giả");
                break;
            case 3:
                System.out.println("tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println("tìm theo tiêu đề");
                break;
            default:
                System.out.println("phìm bấm không hợp lệ");
        }
    }
}
