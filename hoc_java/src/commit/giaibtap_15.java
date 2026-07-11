package commit;

public class giaibtap_15 {
    static void main(String[] args) {
        System.out.println("các số chia hết cho 3 từ 10-50: ");
        for(int i =10; i<=50; i++){
            if((double)i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
