import java.util.Scanner;

public class bai_5 {
    /*Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím.
    Thực hiện:
    Nhập các phần tử mảng
    In thông tin mảng ra màn hình
    Liệt kê các phần tử nằm trên đường chéo chính
    Tạo thêm 1 mảng hai chiều có cùng số dòng và số cột thực hiện cộng hai mảng với nhau*/

    public static void main(String[] args) {
        int soDong, soCot;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();


        int[][] A = new int[soDong][soCot];

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
//Đường chéo chính
        System.out.println("Đường chéo chính là:");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (soDong == soCot) {
                    if (i == j || i + j == soCot - 1) {
                        System.out.print(A[i][j] + "\t");
                    } else System.out.print("\t");
                } else System.out.println("Số hàng không bằng số cột, không có đường chéo chính");
                break;
            }
            System.out.println("\n");
//Tổng ma trận
        }
        int[][] sum = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                sum[i][j] = A[i][j] + A[i][j];
            }
        }
        System.out.println("Ma trận tổnglà: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }
    }

}
