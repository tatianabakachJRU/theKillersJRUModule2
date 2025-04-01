package elective_2.enums;

// определяет возможное воздействие магических событий на единорогов
public enum EventImpact {
    POSITIVE(5, "усиливается магия"),
    NEGATIVE(-3, "ослабевает магия"),
    NEUTRAL(0, "никак не влияет");

    private final int powerDelta;
    private final String reactionDescription;

    EventImpact(int powerDelta, String reactionDescription) {
        this.powerDelta = powerDelta;
        this.reactionDescription = reactionDescription;
    }

    public int getPowerDelta() {
        return powerDelta;
    }

    public String getReactionDescription() {
        return reactionDescription;
    }

    public static EventImpact getRandomImpact(){
        return values()[(int) (Math.random() * values().length)];
    }
}
