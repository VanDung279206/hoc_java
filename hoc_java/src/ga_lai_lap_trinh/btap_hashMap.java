package ga_lai_lap_trinh;

import java.util.HashMap;
import java.util.Scanner;

public class btap_hashMap {
    public static void main(String[] args) {
        HashMap<String, String> user = new HashMap<>();
        user.put("user1", "123456");
        user.put("user2", "123456");
        user.put("user3", "123456");
        user.put("user4", "123456");
        user.put("user5", "123456");
        user.put("user6", "123456");
        user.put("user7", "123456");
        user.put("user8", "123456");
        user.put("user9", "123456");
        user.put("user10", "123456");

        Scanner sc = new Scanner(System.in);
        System.out.print("nhap user name: ");
        String username = sc.nextLine();
        System.out.print("nhap mat khau: ");
        String pass = sc.nextLine();

        // ktra
        if (!user.containsKey(username)) {
            // neu khong co key trong hashmap thif dong nghia la user kong ton tai
            System.out.println("user khong ton tai");
        } else if (!user.get(username).equals(pass)) {
            System.out.println("mat khau sai");
        } else {
            System.out.println("ban da dang nhap thanh cong");
        }
    }
}
