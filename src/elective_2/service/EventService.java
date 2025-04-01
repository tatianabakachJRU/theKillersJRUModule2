package elective_2.service;

import elective_2.entity.MagicEvent;
import elective_2.enums.EventImpact;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
/**
 * Сервис для управления магическими событиями в волшебном лесу.
 * Обеспечивает потокобезопасную генерацию и обработку событий.
 */
public class EventService {
    // Потокобезопасный список активных событий.
    // CopyOnWriteArrayList гарантирует безопасность при одновременном чтении/записи.
    private final CopyOnWriteArrayList<MagicEvent> activeEvents = new CopyOnWriteArrayList<>();

    private static final String[] EVENT_NAMES = {
            "Радужный дождь",
            "Звездопад",
            "Лунное затмение",
            "Появление фей"
    };
    private static final long EVENT_GENERATION_DELAY_MS = 4000;

    // Добавила этот метод
    //Генерирует новые события через фиксированные интервалы (EVENT_GENERATION_DELAY_MS).
    //Работает параллельно с другими потоками (единорогами и основным циклом леса).
    public void startEventGeneration() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                generateEvent();
                TimeUnit.MILLISECONDS.sleep(EVENT_GENERATION_DELAY_MS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /**
     * Генерирует новое магическое событие.
     * Автоматически проверяет лимит активных событий (максимум 5).
     */
    public void generateEvent() {
        if (activeEvents.size() >= 5) {
            System.out.println("Достигнут лимит активных событий");
            return;
        }
        String name = EVENT_NAMES[(int) (Math.random() * EVENT_NAMES.length)];
        EventImpact impact = EventImpact.getRandomImpact();
        activeEvents.add(new MagicEvent(name, impact));
        System.out.println("Сгенерировано новое событие: " + name);
    }

    public List<MagicEvent> getActiveEvents() {
        // Возвращаем неизменяемую копию для безопасности
        return List.copyOf(activeEvents);
    }

    /**
     * Удаляет самое старое событие из списка активных.
     * Используется для очистки устаревших событий.
     */
    public void cleanUpOldEvents() {
        if (!activeEvents.isEmpty()) {
            MagicEvent removed = activeEvents.remove(0);
            System.out.println("Событие завершено: " + removed.getName());
        }
    }
}
