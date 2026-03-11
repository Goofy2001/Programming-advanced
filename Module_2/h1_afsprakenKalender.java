package Module_2;

import java.time.LocalDate;
import java.util.Arrays;

public class h1_afsprakenKalender {
    public static void main(String[] args) {
        LocalDate[] doktersafspraken = new LocalDate[5];
        for (int i = 0; i < doktersafspraken.length; i++) {
            if (i == 0) {
                doktersafspraken[i] = LocalDate.now();
            } else {
                doktersafspraken[i] = doktersafspraken[i - 1].plusDays(15); 
            }
        }
        System.out.println(Arrays.toString(doktersafspraken));
    }
}
