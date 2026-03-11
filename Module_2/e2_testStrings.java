package Module_2;

public class e2_testStrings {
    public static void main(String[] args) {
        String first = "the quick brown fox";
        String second = "Jumps over the lazy dog";
        String fullString = first.concat(" ").concat(second);
        System.out.println(fullString);
        String replacedFullString = fullString.replace("fox", "cat");
        System.out.println(replacedFullString);
    }
}