package july_2026;

public class StringReverseUsingBuoder {
    public static void main(String[] args) {
        String sentence = "I love india";

        String a = new  StringBuilder(sentence).reverse().toString();
        System.out.println(a);
    }
}
