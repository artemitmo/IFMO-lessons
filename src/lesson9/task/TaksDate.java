package lesson9.task;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TaksDate {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy/HH/mm");
        LocalDateTime localDateTime = LocalDateTime.of(2019,12,31,19,0);
        ZonedDateTime sydney = localDateTime.atZone(ZoneId.of("Australia/Sydney"));
        ZonedDateTime fly = sydney.plusHours(15).plusMinutes(35).withZoneSameInstant(ZoneId.of("America/Chicago"));
        System.out.println(formatter.format(fly) + " Хьюстон");
        ZonedDateTime waiting1 = fly.plusHours(1).plusMinutes(45);
        System.out.println(formatter.format(waiting1) + " вылет из Хьюстона");
        ZonedDateTime washington = waiting1.plusHours(2).plusMinutes(49).withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(formatter.format(washington) + " Вашингтон");
        ZonedDateTime waiting3 = washington.plusHours(1).plusMinutes(6);
        ZonedDateTime ottava = waiting3.plusHours(1).plusMinutes(39).withZoneSameInstant(ZoneId.of("America/Toronto"));
        System.out.println(formatter.format(ottava) + " Оттава");
        long result = ChronoUnit.MINUTES.between(sydney, ottava);
        ZonedDateTime christmas = LocalDateTime.of(2019, 12,31,23,59).atZone(ZoneId.of("America/Toronto"));
        System.out.println(christmas.minusMinutes(result).withZoneSameInstant(ZoneId.of("Australia/Sydney")));
    }
}
