public class bai_4 {
    /*Viết chương trình thực hiện:
    Liệt kê 10 số nguyên tố đầu tiên
    Liệt kê các số nguyên tố nhỏ hơn 10*/
    public static void main(String[] args) {

        int a = 0;
        int uoc = 0;
        System.out.println("10 số nguyên tố đầu tiên là:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= a; j++)
                if (a % i == 0)
                    uoc++;
            a++;
        }
        if (uoc == 2) {

        }

    }
}
