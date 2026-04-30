package Module_7;

/**
 * Abstracte basisklasse voor alle boeken in de boekhandel
 */
abstract class Boek {
    private static long isbnCounter = 1000000;
    private String titel;
    private long isbn;

    public Boek(String titel) {
        this.titel = titel;
        this.isbn = isbnCounter++;
    }

    public String getTitel() {
        return titel;
    }

    public long getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return String.format("ISBN: %d, Titel: %s", isbn, titel);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Boek)) return false;
        
        Boek other = (Boek) obj;
        return this.isbn == other.isbn && 
               this.titel.equals(other.titel);
    }
}

/**
 * Klasse voor fictie boeken
 */
class FictieBoek extends Boek {
    public FictieBoek(String titel) {
        super(titel);
    }

    @Override
    public String toString() {
        return "Fictie - " + super.toString();
    }
}

/**
 * Abstracte basisklasse voor non-fictie boeken
 */
abstract class NonFictieBoek extends Boek {
    public NonFictieBoek(String titel) {
        super(titel);
    }
}

/**
 * Klasse voor kookboeken
 */
class Kookboek extends NonFictieBoek {
    public Kookboek(String titel) {
        super(titel);
    }

    @Override
    public String toString() {
        return "Kookboek - " + super.toString();
    }
}

/**
 * Klasse voor biografieën
 */
class Biografie extends NonFictieBoek {
    public Biografie(String titel) {
        super(titel);
    }

    @Override
    public String toString() {
        return "Biografie - " + super.toString();
    }
}

/**
 * Test klasse om de boekhandel applicatie te demonstreren
 */
class BoekhandelTest {
    public static void main(String[] args) {
        // Fictie boeken aanmaken
        FictieBoek roman1 = new FictieBoek("De Hobbit");
        FictieBoek roman2 = new FictieBoek("De Hobbit");
        FictieBoek roman3 = new FictieBoek("Harry Potter");

        // Non-fictie boeken aanmaken
        Kookboek kook1 = new Kookboek("Recepten van de Wereld");
        Kookboek kook2 = new Kookboek("Recepten van de Wereld");
        
        Biografie bio1 = new Biografie("Het Leven van Steve Jobs");
        Biografie bio2 = new Biografie("Het Leven van Steve Jobs");

        System.out.println("=== BOEKHANDEL INVENTARIS ===\n");
        System.out.println(roman1);
        System.out.println(roman2);
        System.out.println(roman3);
        System.out.println(kook1);
        System.out.println(kook2);
        System.out.println(bio1);
        System.out.println(bio2);

        System.out.println("\n=== EQUALS() TEST ===\n");
        System.out.println("roman1.equals(roman2) (beide 'De Hobbit'): " + roman1.equals(roman2));
        System.out.println("roman1.equals(roman3) ('De Hobbit' vs 'Harry Potter'): " + roman1.equals(roman3));
        System.out.println("kook1.equals(kook2) (beide 'Recepten van de Wereld'): " + kook1.equals(kook2));
        System.out.println("bio1.equals(bio2) (beide 'Het Leven van Steve Jobs'): " + bio1.equals(bio2));
        System.out.println("roman1.equals(kook1) (Fictie vs Kookboek): " + roman1.equals(kook1));
    }
}
