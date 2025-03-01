package lecture_7;

public class SwitchExample_5 {
    public static void main(String[] args) {
        String day = "WEDNESDAY";

        String typeOfDay = switch (day){
            case "MONDAY" -> "Weekday";
            case "FRIDAY" -> "Weekday";
            case "SATURDAY", "SANDAY" -> "Weekend";
            case "WEDNESDAY" ->
            {
                String message = "Midweek day";
                int daysUntilWeekend = 2;

                if(daysUntilWeekend == 0){
                    message += ", and it's time to relax!";
                } else {
                    message += ", just " + daysUntilWeekend + " days until the Weekend!";
                }
                yield message;
            }
            default -> "Invalid day";
        };

        System.out.println("The day is a " + typeOfDay);
    }
}
