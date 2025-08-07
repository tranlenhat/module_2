package ss_3_method.bai_tap;

import java.util.Scanner;

public class Xoa_Phan_Tu_Khoi_Mang {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int n = 8;

        System.out.println("Mang Ban Dau La:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Gia Tri Can Xoa: ");
        int v = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (array[i] == v) {
                for (int j = i; j < n - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[n - 1] = 0;
                n--;
            }
        }
        System.out.print("Mang sau khi xoa gia tri la :" );
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

