package task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Day: ");
        getDay(scanner.next());



    }
    public static void getDay(String day){
        switch (day) {
            case "Duishombu", "1"-> {
                DaysOfTheWeek monday = DaysOfTheWeek.MONDAY;
                System.out.println(monday);
            }
            case "Sheishembi", "2" -> {
                DaysOfTheWeek tuesday = DaysOfTheWeek.TUESDAY;
                System.out.println(tuesday);
            }
            case "Sharshembi", "3" -> {
                DaysOfTheWeek wednesday = DaysOfTheWeek.WEDNESDAY;
                System.out.println(wednesday);
            }
            case "Beishembi", "4" -> {
                DaysOfTheWeek thursday = DaysOfTheWeek.THURSDAY;
                System.out.println(thursday);
            }
            case "Juma", "5" -> {
                DaysOfTheWeek friday = DaysOfTheWeek.FRIDAY;
                System.out.println(friday);
            }
            case "Ishembi", "6" -> {
                DaysOfTheWeek saturday = DaysOfTheWeek.SATURDAY;
                System.out.println(saturday);
            }
            case "Jekshembi", "7" -> {
                DaysOfTheWeek sunday = DaysOfTheWeek.SUNDAY;
                System.out.println(sunday);
            }
            default -> System.out.println("invalid day");
        }
    }
}