package elective_2.repository;

import elective_2.entity.Unicorn;
import elective_2.enums.UnicornType;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 * Репозиторий для хранения и управления единорогами.
 * Обеспечивает потокобезопасные операции с данными.
 */
public class UnicornRepository {
    // Потокобезопасное хранилище:
    // ConcurrentHashMap - для быстрого доступа по типу
    // CopyOnWriteArrayList - для безопасного хранения списков единорогов
    private final ConcurrentHashMap<UnicornType, CopyOnWriteArrayList<Unicorn>> storage;

    public UnicornRepository() {
        this.storage = new ConcurrentHashMap<>();
        for (UnicornType type : UnicornType.getAllTypes()) {
            storage.put(type, new CopyOnWriteArrayList<>());
        }
    }

    // Добавляет единорога в хранилище
    public void addUnicorn(Unicorn unicorn){
        if(unicorn == null){
            throw new IllegalArgumentException("Единорог не может быть null");
        }
        // Получаем список единорогов соответствующего типа
        CopyOnWriteArrayList<Unicorn> unicorns = storage.get(unicorn.getType());
        // Добавляем нового единорога (операция потокобезопасна)
        unicorns.add(unicorn);
    }

    /**
     * Возвращает случайного единорога из хранилища.
     * @return Optional с единорогом или пустой, если хранилище пустое
     */
    public Optional<Unicorn> getRandomUnicorn(){
        List<Unicorn> all = getAllUnicorns();
        // Возвращаем Optional.empty() если список пустой,
        // либо случайного единорога в противном случае
        return all.isEmpty()
                ? Optional.empty()
                : Optional.of(all.get((int) (Math.random() * all.size())));
    }

    /**
     * Возвращает всех единорогов из хранилища.
     * @return неизменяемый список всех единорогов
     */
    public List<Unicorn> getAllUnicorns() {
        // Используем parallelStream для параллельной обработки:
        // 1. Получаем все значения из ConcurrentHashMap
        // 2. "Разворачиваем" списки через flatMap
        // 3. Собираем в единый неизменяемый список
        return storage.values()
                .parallelStream()
                .flatMap(List::stream)
                .toList();
    }

}

