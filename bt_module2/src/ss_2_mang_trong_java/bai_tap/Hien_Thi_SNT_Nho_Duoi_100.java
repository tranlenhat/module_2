package ss_2_mang_trong_java.bai_tap;

public class Hien_Thi_SNT_Nho_Duoi_100 {
    public static void main(String[] args) {
        for (int number = 2; number < 100; number++) {
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
