import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
    static Logger logger = (Logger) LogManager.getLogger(Run.class.getName());

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("and", "any", "air", "aroma", "andy");
        logger.info("List " + strings + " was filtered: " + Run.filterList(strings));

        List<Integer> numbers = Arrays.asList(26, 63, 88, 94, 876, 1055);
        logger.info("List " + numbers + " was separated: " + Run.separateNumberList(numbers));

        List<Integer> numbers2 = Arrays.asList(-99, -55, -28, -13, -2, 26, 63, 88, 94);
        logger.info("Numbers " + numbers2 + " which MODULE more than 50 were counted: " + Run.countNumbersMoreFifty(numbers2));
    }

    //Third task
    private static long countNumbersMoreFifty(List<Integer> numbers) {
        return numbers.stream().
                filter(num -> Math.abs(num) > 50).
                count();
    }

    //Second task
    private static String separateNumberList(List<Integer> numbers) {
        return numbers.stream().
                map(num -> (num % 2) == 0 ? "e" + num : "o" + num).
                collect(Collectors.joining(", "));
    }

    //First task
    private static List<String> filterList(List<String> strings) {
        return strings.stream().
                filter(str -> str.startsWith("a") && str.length() == 3).
                collect(Collectors.toList());
    }


}
