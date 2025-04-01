package elective_2;

import elective_2.repository.UnicornRepository;
import elective_2.service.EventService;
import elective_2.service.ForestService;
import elective_2.service.UnicornService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UnicornApp {
    private static final int THREAD_POOL_SIZE = 3;
    private static final long RUN_DURATION_MINUTES = 1;

    public static void main(String[] args) {
        UnicornRepository unicornRepository = new UnicornRepository();
        EventService eventService = new EventService();
        UnicornService unicornService = new UnicornService(unicornRepository);
        ForestService forestService = new ForestService(unicornService, eventService);

        // Создаем пул потоков для параллельного выполнения задач
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        // Запускаем три основных потока:
        // Поток 1: Жизненный цикл единорогов (спавн и улучшение)
        executorService.execute(unicornService::starLifecycle);
        // Поток 2: Генерация случайных событий
        executorService.execute(eventService::startEventGeneration);
        // Поток 3: Основной цикл леса (смена дней, статистика)
        executorService.execute(forestService::startForestLife);

        // Альтернативный вариант завершения через shutdown hook
        // Если вы захотите остановить приложение на Runtime через кнопку остановки в IDEA
//        Runtime.getRuntime().addShutdownHook(new Thread(() ->{
//            System.out.println("Завершение работы леса...");
//            executorService.shutdownNow();
//        }));


        try {
            // Даем приложению работать 1 минуту
            TimeUnit.MINUTES.sleep(RUN_DURATION_MINUTES);
            System.out.println("Завершение работы леса...");
            executorService.shutdownNow(); // Прерываем все потоки
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        try {
            // Ждем завершения всех потоков (максимум 5 секунд)
            if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                // Если потоки не завершились за 5 секунд
                System.out.println("Некоторые потоки не завершились корректно");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
