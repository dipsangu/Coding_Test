package Java21;

public class PatterCase {
    public static void main(String[] args) {
        Object obj =10;

        String result = switch (obj){
            case Integer i -> "Intiger " +i;
            case String s -> "String " +s;
            default -> "Unknown";
        };
        System.out.println(result);
    }
}
