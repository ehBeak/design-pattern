package factorymethod.example;

import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());
    }
}
