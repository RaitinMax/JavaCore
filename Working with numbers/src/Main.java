import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        list.stream()
                .filter(number->number>0)
                .filter(number->number%2==0)
                .sorted(Comparator.naturalOrder())
                .forEach(result -> System.out.print(result+" "));
    }
}
