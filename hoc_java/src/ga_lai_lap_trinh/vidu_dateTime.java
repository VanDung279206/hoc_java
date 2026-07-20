package ga_lai_lap_trinh;

import java.util.Calendar;
import java.util.Scanner;

public class vidu_dateTime {
    public static void main(String[] args) {
        int day, month, year, tuoi;
        //nhập liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào ngày sinh");
        day = sc.nextInt();
        System.out.println("mời nhập vào tháng sinh");
        month = sc.nextInt();
        System.out.println("mời nhập vào năm sinh");
        year = sc.nextInt();

        //khởi tạo
        Calendar cal = Calendar.getInstance();
        //set ngày tháng năm sinh do người dùng nhâjp vào
        cal.set(year, month - 1, day);
        //xuất ngày tháng năm sinh
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        int thangSinh = cal.get(Calendar.MONTH);
        int namSinh = cal.get(Calendar.YEAR);
        System.out.println("Bạn sinh ngày " + ngaySinh + " tháng " + (thangSinh + 1) + " năm " + namSinh);

        //tính tuổi
        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);
        tuoi = namHienTai - namSinh;
        System.out.println("tuổi của bạn là: " + tuoi);
    }
}
