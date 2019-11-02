package lesson9;


import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class DateTimeApi {
    public static void main(String[] args) {
        //DateTime Api начиная с 8 версии
        // потокобезопасны
        //только работа с датой (число, месяц, год), текущая дата
        LocalDate dateNow = LocalDate.now(); //возвращается текущая дата
        System.out.println(dateNow);

        LocalDate someData = LocalDate.of(2018, Month.OCTOBER, 20);
        String strDate = "14/05/2017";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate parseDate = LocalDate.parse(strDate, dtf); //берет строчку и парсит ее по формату дтф
        // 8 - d 08 -dd / MMMM - месяц (октября) ММ - месяц (10) / уууу - 2017 уу - 17*/
        System.out.println(parseDate);
        System.out.println(parseDate.minusYears(1));
        System.out.println(parseDate.minusMonths(1));
        System.out.println(parseDate.minusDays(400));//отнимает дни
        System.out.println(parseDate.plusWeeks(40));//прибавляет недели, если число с минусом, то обратка работает

        DayOfWeek dayOfWeek = parseDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        boolean isAfter = parseDate.isAfter(dateNow); // аналогично isBefore
        System.out.println(isAfter);

        boolean isEqual = parseDate.isEqual(dateNow);
        System.out.println(isEqual);

       /* List <LocalDate> dates = dateNow.datesUntil(LocalDate.parse("2020-03-01")).collect(Collectors.toList());
        for (LocalDate date: dates){
            System.out.println(date);// работает с 9й версии
        }*/
       long between = ChronoUnit.YEARS.between(parseDate, dateNow); // стоят в годах
        System.out.println(between); //разница между двумя датами

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); //все то же самое

        LocalTime localTime1 = LocalTime.of(8, 20);
        LocalTime localTime2 = LocalTime.of(22, 20);

        long btn1 = ChronoUnit.HOURS.between(localTime1, localTime2);
        System.out.println(btn1);

        long btn2 = Duration.between(localTime1, localTime2).toMinutes();
        System.out.println(btn2);

        Set<String> allZone = ZoneId.getAvailableZoneIds();
        System.out.println(allZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMMM yyyy / HH:mm");
        LocalDateTime localDateTime = LocalDateTime.of(2019, 11, 12,5, 23);
        System.out.println(localDateTime);

        ZonedDateTime msk = localDateTime.atZone(ZoneId.of("Europe/Moscow"));
        System.out.println(msk);

        ZonedDateTime ny = msk.withZoneSameInstant(ZoneId.of("America/New_York")).plusHours(4);

        Date date = new Date();
        System.out.println(date);
        Date other = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy" + " HH:mm");
        System.out.println(sdf.format(date)); //сравниваем, выводим
        System.out.println(date.before(other));
        System.out.println(date.after(other));
        System.out.println(date.compareTo(other));

        Calendar calendar1 = new GregorianCalendar();
        Calendar calendar2 = new GregorianCalendar(2016, Calendar.OCTOBER, 12);
        calendar1.add(Calendar.DAY_OF_MONTH, 4);
        calendar1.add(Calendar.DAY_OF_MONTH, -90);
        System.out.println(calendar1.get(Calendar.MONTH));
        System.out.println(calendar1.getTime()); //return Date
        calendar1.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //TODO: обратно
    }
}
