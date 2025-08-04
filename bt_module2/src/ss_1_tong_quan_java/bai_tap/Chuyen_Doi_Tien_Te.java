package ss_1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Chuyen_Doi_Tien_Te {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap So Tien USD: ");
        double usd = Double.parseDouble(scanner.nextLine());

        double quyDoi = usd * vnd;
        System.out.println("Gia Tri VND:" + quyDoi);
    }
}
