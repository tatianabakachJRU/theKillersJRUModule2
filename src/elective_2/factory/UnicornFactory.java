package elective_2.factory;

import elective_2.entity.Unicorn;
import elective_2.enums.UnicornType;
import elective_2.utils.RandomNameGenerator;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Фабрика для создания объектов единорогов.
 * Реализует паттерн "Фабричный метод".
 */
public class UnicornFactory {

    // Приватный конструктор предотвращает создание экземпляров фабрики
    private UnicornFactory() {

    }

    // Создание нового единорога указанного типа с параметрами:
    // 1. Сгенерированное имя (через RandomNameGenerator)
    // 2. Указанный тип
    // 3. Случайный уровень магии от 30 до 59 (30 + random[0-29])
    public static Unicorn createUnicorn(UnicornType type) {
        if (type == null) {
            throw new IllegalArgumentException("Тип единорога не может быть null");
        }
        return new Unicorn(
                RandomNameGenerator.generate(type),
                type,
                30 + (int) (Math.random() * 30)
        );
    }

    //Создает единорога случайного типа.
    public static Unicorn createRandomUnicorn(){
        UnicornType[] types = UnicornType.getAllTypes();
        return createUnicorn(types[(int) (Math.random() * types.length)]);
    }
}
