package ga_lai_lap_trinh;

public class String_2 {
    public static void main(String[] args) {
        StringBuilder chuoi = new StringBuilder();

        String s7 = " toi di tim toi";
        System.out.println(s7.indexOf("toi")); // kiểm tra vị trí đầu tiên xuất hiện nếu không có trả về -1
        System.out.println(s7.lastIndexOf("toi")); // kiểm tra vị trí cuối cùng xuất hiện nếu không có trả về -1
        String s9 = ".mp3";
        String s10 = "tuhoc.mp3";
        // kiểm tra s10 có chứa cụm string của s9 không?
        boolean check = s10.contains(s9);
        if (check) {
            System.out.println("có .mp3 trong chuỗi");
        } else {
            System.out.println("không có .mp3 trong chuỗi");
        }

        String s11 = "abcdefgh";
        String s12 = s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);
        String s13 = s11.substring(4, 7);
        System.out.println(s13);
    }
}
