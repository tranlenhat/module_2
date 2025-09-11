package ss_1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        int cout = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == c){
                cout++;
            }
        }
        System.out.println(cout);
    }
}
