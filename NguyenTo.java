package NguyenTo100;

public class NguyenTo {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (laSoNguyenTo(i)) {
                System.out.println("So nguyen to: " + i);
            }
        }
    }

    public static boolean laSoNguyenTo(int so) {
        for (int j = 2; j <= Math.sqrt(so); j++) {
            if (so % j == 0) {
                return false;
            }
        }
        return true;
    }
}

