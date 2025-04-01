package elective_2.service;

import elective_2.entity.MagicEvent;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Сервис управления жизненным циклом волшебного леса.
 * Координирует работу единорогов и событий, реализует игровые сутки.
 */
public class ForestService {
    private final UnicornService unicornService;
    private final EventService eventService;
    private static final long DAY_DURATION_MS = 10_000;

    public ForestService(UnicornService unicornService, EventService eventService) {
        this.unicornService = unicornService;
        this.eventService = eventService;
    }

    /**
     * Основной цикл жизни леса. Выполняется в отдельном потоке.
     * Организует последовательность: день → события → статистика.
     */
    public void startForestLife() {
        int dayCounter = 1; // Счетчик игровых дней

        // Бесконечный цикл, пока поток не будет прерван
        while (!Thread.currentThread().isInterrupted()) {
            try {
                // Начало дня
                System.out.printf("%n====== Начало дня %d ======%n", dayCounter);
                // Применяем все активные события
                applyActiveEvents();
                // Очищаем отработанные события
                eventService.cleanUpOldEvents();
                // "Спим" 10 секунд (имитация дня)
                TimeUnit.MILLISECONDS.sleep(DAY_DURATION_MS);
                // Конец дня - вывод статистики
                System.out.printf("====== Конец дня %d ======%n", dayCounter++);
                System.out.println(unicornService.getPopulationStatistic()); // Статистика единорогов
                System.out.println("Активных событий: " + eventService.getActiveEvents().size()); // Количество событий
                System.out.println("========================"); // Разделитель

            } catch (InterruptedException e) {
                // Корректная обработка прерывания потока
                Thread.currentThread().interrupt();
            }
        }
    }

    /**
     * Применяет все активные события к единорогам.
     * Выводит информацию о каждом событии.
     */
    private void applyActiveEvents() {
        List<MagicEvent> events = eventService.getActiveEvents();
        if (events.isEmpty()) {
            System.out.println("Сегодня не было магических событий");
            return;
        }
        // Для каждого события:
        events.forEach(event -> {
            // Выводим информацию о событии
            System.out.println("Произошло событие: " + event.getName());
            // Применяем эффект события ко всем единорогам
            unicornService.applyEventToAll(event);
        });
    }
}
