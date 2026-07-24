package ga_lai_lap_trinh;

import java.util.HashMap;

public class hasMap {
    public static void main(String[] args) {
        // khai bao
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Float> map2 = new HashMap<>();

        //Thêm các phần tử vào hashmap
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "cherry");

        // lấy giá trị của một phần tử
        String value = map.get(1);
        String value2 = map.get(2);
        String value3 = map.get(2);
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);

        // Xóa phần tử khỏi hash map
        map.remove(2);
        System.out.println(map.get(2));

        // kiểm tra xem một phhaafn tử có tồn tại trong map hay không
        boolean check = map.containsKey(3);
        System.out.println(check);

        // kiểm tra xem một giá trị có tồn tại trong map hay không
        boolean check2 = map.containsValue("cherry");
        System.out.println(check2);

        // kiểm tra xem hashMap có rỗng hay không
        boolean bien = map.isEmpty();
        System.out.println(bien);

        //lấy số lượng phần tử trong hashmap
        int soluong = map.size();
        System.out.println(soluong);

        //duyệt hashmap
        for (Integer x : map.keySet()) {
            String vl = map.get(x);
            System.out.println(x + " : " + vl);
        }

    }
}
