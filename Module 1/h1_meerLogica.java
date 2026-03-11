public class h1_meerLogica {
    
    public static void ggd(int x, int y) {
        int a;
        int b;
        int deler;
        if (x > y) {
            a = x;
            b = y;
            deler = a;
        } else {
            a = y;
            b = x;
            deler = a;
        }
        while (a > 0) {
            if (a%deler == 0 && b%deler == 0) {
                System.out.println("De ggd van " + x + " en " + y + " is gelijk aan " + deler);
                break;
            } else {
                deler--;
            }
        }
    }

    public static void main(String[] args) {
        ggd(50, 20);
    }
}
