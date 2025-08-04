package ss_2_mang_trong_java.bai_tap;

public class Hien_Thi_20_SNT {
    public static void main(String[] args) {
        int couts = 0;
        int number = 2;
        while (couts < 20){
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if(number % i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(number);
                couts++;
            }
            number++;
        }
    }
}
