public class e1_loopsEnSelecties {

    public static void metForLoop() {
        for (int i = 36; i <= 60; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void metWhileLoop() {
        int i = 36;
        while (i<=60) {
            if (i%2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        metForLoop();
        metWhileLoop();
    }
}