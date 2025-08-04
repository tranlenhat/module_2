package ss_2_mang_trong_java.bai_tap;

public class B1_Hien_Thi_Loai_Hinh {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("* * * * * * *");
        }
        System.out.println( );
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println( );
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <=5; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
