package ss_11_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KiemTraChuoiQueue {

    public static String cleanString(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    public static boolean isPalindrome(String input) {
        String cleaned = cleanString(input);

        Queue<Character> queue = new LinkedList<>();
        for (char c : cleaned.toCharArray()) {
            queue.offer(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!queue.isEmpty()) {
            reversed.insert(0, queue.poll());
        }

        return cleaned.equals(reversed.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Chuỗi trên là Palindrome!");
        } else {
            System.out.println("Chuỗi trên KHÔNG phải Palindrome!");
        }
    }
}
