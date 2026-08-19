package july_2026;

public class ReverseString {
    public static void main(String[] args) {
        String sentence = "I love india";
        String s2 = "";

        char[] ch = sentence.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            s2 = s2 + ch[i];
        }

        System.out.println(s2);
    }
}
