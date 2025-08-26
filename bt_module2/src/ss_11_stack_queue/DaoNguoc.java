package ss_11_stack_queue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<>();

        for (int num : arr){
            stack.push(num);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Mảng sau khi đảo ngược");
        System.out.println(Arrays.toString(arr));
    }
}
