package Java.h_w_3;

    import java.util.Comparator;
    import java.util.List;
    import java.util.Map;
    import java.util.stream.Collectors;
    
    public class h_w_3 {

        /*
        Пусть дан произвольный список целых чисел,
        удалить из него четные числа (в языке уже есть что-то готовое для этого).
        */

        static List task1(List<Integer> input) {
           return input.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        }

        /*
        Задан целочисленный список ArrayList.
        Найти минимальное, максимальное и среднее арифметическое из этого списка.
        */

        static Map task2(List<Integer> input) {
            Integer min = input.stream().min(Comparator.comparing(Integer::valueOf)).get();
            Integer max = input.stream().max(Comparator.comparing(Integer::valueOf)).get();
            Double average = input.stream().mapToInt(Integer::intValue).average().getAsDouble();
    
            Map<String, String> outputMap = Map.ofEntries(
                    Map.entry("min", Integer.toString(min)),
                    Map.entry("max", Integer.toString(max)),
                    Map.entry("average", Double.toString(average))
            );
            return outputMap;
        }
    }
    





