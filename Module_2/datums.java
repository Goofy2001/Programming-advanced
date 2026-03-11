package Module_2;

import java.time.LocalDate;

public class datums {

    public static void leverdatum(LocalDate datum) {
        LocalDate leverdatum = datum.plusDays(4);
        System.out.println("De geschatte leverdatum is : " + leverdatum);
    }
    
    public static void main(String[] args) {
        leverdatum(LocalDate.now());
    }
}
