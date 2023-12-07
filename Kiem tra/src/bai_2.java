import java.util.Scanner;

public class bai_2 {
    /*Câu 2
    Viết phương thức truyền vào 1 chuỗi bất kỳ
    Thực hiện:
    Đếm số từ trong chuỗi
    Đếm và in ra index của các ký tự o trong chuỗi*/

    public static void main(String[] args) {
        char kyTu = 'o';
        int soDem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ");
        String chuoiNhap = sc.nextLine();
        System.out.println("Số ký tự o trong chuỗi là: " + chuoiNhap.length());
        for (int i = 0; i < chuoiNhap.length(); i++) {
            if (chuoiNhap.charAt(i) == kyTu) {
                soDem++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự o trong chuỗi = " + soDem);
    }
}
