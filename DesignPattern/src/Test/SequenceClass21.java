package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceClass21 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B","C"));
        //System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.addFirst("x");
        list.addLast("z");
        System.out.println(list);
        System.out.println(list.reversed());
    }
}
