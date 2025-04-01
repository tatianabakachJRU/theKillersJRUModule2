package elective_2.service;

import elective_2.entity.MagicEvent;
import elective_2.entity.Unicorn;
import elective_2.enums.UnicornType;
import elective_2.factory.UnicornFactory;
import elective_2.repository.UnicornRepository;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * Сервис для управления жизненным циклом единорогов.
 * Обеспечивает создание, улучшение и обработку событий для единорогов.
 */
public class UnicornService {
    private final UnicornRepository repository;
    // Интервал между действиями (3 секунды)
    private static final long ACTIVE_DELAY_MS = 3000;
    // Вероятность появления нового единорога (50%)
    private static final double SPAWN_PROBABILITY = 0.5;

    public UnicornService(UnicornRepository repository) {
        this.repository = repository;
    }

    /**
     * Основной жизненный цикл единорогов.
     * Выполняется в отдельном потоке и управляет:
     * - созданием новых единорогов
     * - улучшением существующих
     */
    public void starLifecycle() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                // С вероятностью 50% создаем нового единорога
                if (Math.random() < SPAWN_PROBABILITY) {
                    spawnRandomUnicorn();
                }
                // Улучшаем случайного единорога
                improveRandomUnicorn();
                // Пауза между действиями (3 секунды)
                TimeUnit.MILLISECONDS.sleep(ACTIVE_DELAY_MS);
            } catch (InterruptedException e) {
                // Корректная обработка прерывания потока
                Thread.currentThread().interrupt();
            }

        }
    }
    /**
     * Улучшает случайного единорога, увеличивая его магическую силу.
     * Единороги улучшаются даже без событий, что делает мир более "живым"
     * Без этого метода магия единорогов менялась бы только при событиях.
     * Сейчас единороги постепенно становятся сильнее просто со временем(мужают со временем))).
     */
    private void improveRandomUnicorn() {

        Optional<Unicorn> randomUnicorn = repository.getRandomUnicorn();
        if (randomUnicorn.isEmpty()) {
            System.out.println("В лесу нет единорогов");
            return;
        }
        Unicorn unicorn = randomUnicorn.get();
        int improvment = 1 + (int) (Math.random() * 10);
        unicorn.adjustMagicPower(improvment);
    }

    /**
     * Создает нового единорога случайного типа и добавляет его в репозиторий.
     */
    private void spawnRandomUnicorn() {
        // Создание единорога через фабрику
        Unicorn newUnicorn = UnicornFactory.createRandomUnicorn();
        repository.addUnicorn(newUnicorn);
        System.out.println("Появился новый единорог: " + newUnicorn);
    }

    /**
     * Генерирует статистику по популяции единорогов.
     */
    public String getPopulationStatistic() {
        StringBuilder statistic = new StringBuilder("Статистика популяции:\n");
        // Для каждого типа единорогов подсчитываем количество
        for (UnicornType type : UnicornType.getAllTypes()) {
            long count = repository.getAllUnicorns()
                    .stream()
                    .filter(unicorn -> unicorn.getType() == type)
                    .count();
            statistic.append(String.format("  %s: %d единорогов%n", type, count));
        }
        statistic.append(String.format("Всего: %d единорогов%n", repository.getAllUnicorns().size()));
        return statistic.toString();
    }

    /**
     * Применяет магическое событие ко всем единорогам.
     * @param magicEvent событие для применения
     */
    public void applyEventToAll(MagicEvent magicEvent) {
        repository.getAllUnicorns()
                .forEach(magicEvent::applyTo);
    }
}
