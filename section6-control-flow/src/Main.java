public class Main {
    public static void main(String[] args) {
        String month = "APRIL";
        System.out.println("Number of season for month " + month + " is: " + getSeasonFromMonth(month));
    }
    public static String getSeasonFromMonth(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1th";
            case "APRIL", "MAY", "JUNE" -> {
                yield "2th";
            }
            case "JULY", "AUGUST", "SEPTEMBER" -> "3th";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                yield "month " + month + " is not a valid month";
            }
        };
    }
}