package commit;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date_time {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        //lấy ngày tháng năm (get)
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        int thang = cal.get(Calendar.MONTH);//
        int nam = cal.get(Calendar.YEAR);
        System.out.println(ngay);
        System.out.println(thang+1);
        System.out.println(nam);


        //đặt ngày tháng năm theo ý muốn (set)
        cal.set(Calendar.DAY_OF_MONTH,27);
        cal.set(Calendar.MONTH,8); // tháng chỉ chạy từ 0-11
        cal.set(Calendar.YEAR,2006);

        //ktra ngày sau khi thiết lập
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        int thangSinh = cal.get(Calendar.MONTH);
        int namSinh = cal.get(Calendar.YEAR);
        System.out.println(ngaySinh);
        System.out.println(thangSinh+1);
        System.out.println(namSinh);

        //xuất theo định dạng ngày tháng năm
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        //tạo 1 đối tượng date để get time trong đối tượng cal
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);
    }
}
