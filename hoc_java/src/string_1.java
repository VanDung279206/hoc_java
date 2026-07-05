public class string_1 {
    public static void main(String[] args) {
        String s = "Hồi đó tôi chê mồm e rộng" +
                "\nkhông tin hai đứa chập mồm đo";
        System.out.println(s);

        StringBuilder chuoi = new StringBuilder();
        //append: thêm vào cuối chuỗi
        chuoi.append("xin chào.");
        chuoi.append("mình mới học lập trình");
        chuoi.append("rất vui được làm quen các bạn");
        System.out.println(chuoi);

        //insert(vị trí index, chuỗi cần chèn)
        chuoi.insert(2, "obama");
        System.out.println(chuoi);

        //delete(start, end)
        chuoi.delete(2, 7);
        System.out.println(chuoi);

        //length: trả về độ dài của chuỗi
        System.out.println(chuoi.length());
    }
}
