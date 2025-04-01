package elective_2.entity;

import elective_2.enums.UnicornType;

import java.util.concurrent.atomic.AtomicInteger;

public class Unicorn {
    private static final AtomicInteger idGenerator = new AtomicInteger(1);

    private final int id;
    private final String name;
    private final UnicornType type;
    private final AtomicInteger magicPower;

    public Unicorn(String name, UnicornType type, int initialPower) {
        this.id = idGenerator.getAndIncrement();
        this.name = name;
        this.type = type;
        // присваивает значение магии от 0 до 100
        this.magicPower = new AtomicInteger(Math.max(0, Math.min(100, initialPower)));
    }

    // вычисляет новое значение магии, ограничивает минимум 0, ограничивает максимум 100
    public void adjustMagicPower(int delta){
        magicPower.updateAndGet(current -> Math.max(0, Math.min(100, current + delta)));
    }

    public String getName() {
        return name;
    }

    public UnicornType getType() {
        return type;
    }

    public AtomicInteger getMagicPower() {
        return magicPower;
    }

    @Override
    public String toString() {
        return String.format("%s (%s, ID: %d, Магия: %d)", name, type, id, magicPower.get());
    }
}
