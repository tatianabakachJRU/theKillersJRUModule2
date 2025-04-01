package elective_2.entity;

import elective_2.enums.EventImpact;

public class MagicEvent {
    private final String name;
    private final EventImpact impact;

    public MagicEvent(String name, EventImpact impact) {
        this.name = name;
        this.impact = impact;
    }

    // поменяла этот метод, что бы задействовать reactionDescription
    // этот метод применяет эффект события к единорогу
    public void applyTo(Unicorn unicorn) {
        int oldPower = unicorn.getMagicPower().get();
        unicorn.adjustMagicPower(impact.getPowerDelta());
        System.out.printf(
                "%s: %s. Магия изменена с %d до %d%n",
                unicorn.getName(),
                impact.getReactionDescription(),
                oldPower,
                unicorn.getMagicPower().get()
        );
    }

    public String getName() {
        return name;
    }

    public EventImpact getImpact() {
        return impact;
    }
}
