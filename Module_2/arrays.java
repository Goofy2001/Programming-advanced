package Module_2;

public class arrays {
    public static void gemiddelde(int[] array,int grootte) {
        int som = 0;
        for (int getal : array) {
            som += getal;
        }
        int gemiddelde = som / grootte;
        System.out.println("Het gemiddelde is " + gemiddelde);
    } 

    public static void main(String[] args) {
        int[] studentenScores = {12, 8, 13, 18, 15, 6, 12};
        int grootte = studentenScores.length;
        gemiddelde(studentenScores, grootte);
    }
}
