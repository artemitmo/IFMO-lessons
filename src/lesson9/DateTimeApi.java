package lesson9;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class DateTimeApi {
    public static void main(String[] args) {
        // DateTime Api начиная с 8 версии
        // потокобезопасны

        // работа с датой
        // текущая дата
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        LocalDate someDate = LocalDate.of(2018, Month.OCTOBER, 20);

            /*8 -d 08 - dd /
            MMMM - месяц(октября) MM - месяц (10) /
            yyyy - 2017 yy - 17*/
        String strDate = "14 октября 2017"; // 2017-05-14
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d MMMM yyyy");

        LocalDate parseDate = LocalDate.parse(strDate, dtf);
        System.out.println(parseDate);

        System.out.println(parseDate.minusYears(-1));
        System.out.println(parseDate.minusMonths(2));
        System.out.println(parseDate.minusDays(400));

        System.out.println(parseDate.plusDays(23));
        System.out.println(parseDate.plusWeeks(2));
        System.out.println(parseDate.plusMonths(7));
        System.out.println(parseDate.plusYears(-4));

        DayOfWeek dayOfWeek = parseDate.getDayOfWeek();
        System.out.println(dayOfWeek);

        LocalDate ld = LocalDate.parse(strDate, dtf);

        boolean isAfter = parseDate.isAfter(dateNow);
        System.out.println(isAfter);

        boolean isBefore = parseDate.isBefore(dateNow);
        System.out.println(isBefore);

        boolean isEqual = parseDate.isEqual(dateNow);
        System.out.println(isEqual);

        /*List<LocalDate> dates =
                dateNow.datesUntil(LocalDate.parse("2020-03-01"))
                        .collect(Collectors.toList());
        for (LocalDate date: dates){
            System.out.println(date);
            System.out.println(date.getDayOfWeek());
        }*/

        long between = ChronoUnit.YEARS.between(parseDate, dateNow);
        System.out.println(between);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime localTime1 = LocalTime.of(7, 20);
        LocalTime localTime2 = LocalTime.of(22, 20);

        long btn1 = ChronoUnit.HOURS.between(localTime1, localTime2);
        System.out.println(btn1);

        long btn2 = Duration.between(localTime1, localTime2).toMinutes();
        System.out.println(btn2);

        Set<String> allZone = ZoneId.getAvailableZoneIds();
        System.out.println(allZone);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd MMMM yyyy / HH:mm");

        LocalDateTime localDateTime =
                LocalDateTime.of(2019, Month.NOVEMBER, 15,
                        16, 20);
        System.out.println(formatter.format(localDateTime));

        ZonedDateTime msk = localDateTime.atZone(ZoneId.of("Europe/Moscow"));
        System.out.println(formatter.format(msk));

        ZonedDateTime ny =
                msk.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(formatter.format(ny));
        System.out.println(formatter.format(ny.plusHours(4).plusMinutes(20)));

        Date date = new Date();
        System.out.println(date);
        Date other = new Date();

        SimpleDateFormat sdf =
                new SimpleDateFormat("dd MM yyyy HH:mm");
        System.out.println(sdf.format(date));
        System.out.println(date.before(other));
        System.out.println(date.after(other));
        System.out.println(date.compareTo(other));

        Calendar calendar1 = new GregorianCalendar();
        Calendar calendar2 = new GregorianCalendar(
                2016,
                Calendar.OCTOBER,
                12);
        calendar2.add(Calendar.DAY_OF_MONTH, 4);
        calendar2.add(Calendar.DAY_OF_MONTH, -90);

        System.out.println(calendar1.get(Calendar.MONTH));
        System.out.println(calendar1.getTime()); // return Date
        LocalDate localDate = calendar1.getTime()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        // TODO: обратно




    }
}
