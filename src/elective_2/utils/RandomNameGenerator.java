package elective_2.utils;

import elective_2.enums.UnicornType;

import java.util.List;
import java.util.Random;

public class RandomNameGenerator {
    private static final List<String> RAINBOW_NAMES = List.of("Радужный блик", "Иридия", "Солнечный след");
    private static final List<String> CRYSTAL_NAMES = List.of("Ледяной осколок", "Алмазная пыль", "Отблеск");
    private static final List<String> GOLDEN_NAMES = List.of("Золотой блик", "Сияние", "Монетка");
    private static final List<String> SHADOW_NAMES = List.of("Сумеречный блик", "Тенек", "Ночная тень");
    private static final List<String> FOREST_NAMES = List.of("Листик", "Березка", "Лесной ветерок");

    private static final Random RANDOM = new Random();

    public static String generate(UnicornType type){
        return switch (type){
            case RAINBOW -> RAINBOW_NAMES.get(RANDOM.nextInt(RAINBOW_NAMES.size()));
            case CRYSTAL -> CRYSTAL_NAMES.get(RANDOM.nextInt(CRYSTAL_NAMES.size()));
            case GOLDEN -> GOLDEN_NAMES.get(RANDOM.nextInt(GOLDEN_NAMES.size()));
            case SHADOW -> SHADOW_NAMES.get(RANDOM.nextInt(SHADOW_NAMES.size()));
            case FOREST -> FOREST_NAMES.get(RANDOM.nextInt(FOREST_NAMES.size()));
        };
    }
}
