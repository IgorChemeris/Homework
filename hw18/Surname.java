package hw18;

import java.util.*;
import java.util.stream.Collectors;

public class Surname {
    public static void main(String[] args) {
        List<String> surnames = Arrays.asList(
                "Стейніц", "Ласкер", "Капабланка", "Ейве", "Фішер",
                "Ананд", "Карлсен", "Ліжень", "Фішер", "Карлсен",
                "Капабланка", "Фішер", "Карлсен", "Карлсен", "Ласкер",
                "Музичук", "Карлсен", "Музичук", "Карлсен", "Капабланка"
        );

        Map<String, Long> surnameCountMap = surnames.stream()
                .collect(Collectors.groupingBy(
                        surname -> surname,
                        Collectors.counting()
                ));

        System.out.println(surnameCountMap);
    }
}
