import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        System.out.println("Nhập số bất kỳ: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (true) {
            while (a <= 0) {
                System.out.println("Nhập lại a, a > 0");
                a = sc.nextInt();
            }
            System.out.println("Nhập đúng a= " + a);
            int uoc = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0)
                    uoc++;
            }
            if (uoc == 2)
                System.out.println(a + " là số nguyên tố");
            else System.out.println(a + " ko là số nguyên tố");
            break;
        }
    }
}
