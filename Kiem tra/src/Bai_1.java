public class Bai_1 {
    public static void main(String[] args) {
        System.out.println("Hình 1 là:");
        hinh1();
        System.out.println("Hình 2 là:");
        hinh2();
    }

    static void hinh1() {
        String[][] hinhMot = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println("\n");
        }
    }

    static void hinh2() {
        String[][] hinhBon = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i >= j) {
                    System.out.print("*" + "\t");
                } else System.out.print("\t");
            }
            System.out.println("\n");
        }
    }
}
