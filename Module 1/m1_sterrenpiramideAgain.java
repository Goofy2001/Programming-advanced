public class m1_sterrenpiramideAgain {

    public static void piramide(short hoogte) {
        if (hoogte <= 0) {
            return;
        }
        for (int i = 1; i <= hoogte; i++) {
            String lijn = "";
            for (int j = 1; j <= i; j++) {
                lijn = lijn + "*";
            }
            System.out.println(lijn);
        }
    }

    public static void main(String[] args) {
        piramide((short)20);
    }
    
}
