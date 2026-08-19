package july_2026;

import java.util.*;
import java.util.stream.Collectors;

public class LongestString {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("Java","SpringBoot","Kafka","Microservices");

        list.stream().map(e->e.length()).forEach(System.out::println);

       String longest= list.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println(longest+"----"+longest.length());

       String a= list.stream().max(Comparator.comparing(String::length)).orElse(" ");
        System.out.println(a);
    }
}
