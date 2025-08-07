package ss_3_method.bai_tap;

import java.util.Scanner;

public class Them_Phan_Tu {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int n = 5;

        System.out.print("Mang Ban Dau la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị X cần chèn: ");
        int x = Integer.parseInt(scanner.nextLine();

        System.out.print("Nhập vị trí index cần chèn: ");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = n; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = x;
        n++;

        System.out.print("Mảng sau khi chèn: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
