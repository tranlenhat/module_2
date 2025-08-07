package ss_3_method.bai_tap;

import java.util.Scanner;

public class Gop_Mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng a: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        System.out.print("Nhập số phần tử mảng b: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            c[n + i] = b[i];
        }
        System.out.println("Mảng c sau khi nối 2 mảng:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
