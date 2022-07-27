package practice;

import java.time.LocalDate;
import java.time.Period;

public class Periods {
    public static String age;

    // реализуйте вывод разницы между датами, используя класс Period
    public static String getPeriodFromBirthday(LocalDate firstDate, LocalDate secondDate) {
        Period period = Period.between(firstDate,secondDate);
        age = "years:" + period.getYears() + "," +  " months:" + period.getMonths() + ","+ " days:" + period.getDays();
        return age;
    }

}
