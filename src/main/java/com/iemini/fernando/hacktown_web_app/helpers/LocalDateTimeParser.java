package com.iemini.fernando.hacktown_web_app.helpers;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateTimeParser {

    public static LocalDateTime parseDateTimeString(String formattedDateTimeString) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateTime;
        try {
            localDateTime = LocalDateTime.parse(formattedDateTimeString, dateTimeFormatter);
        } catch (DateTimeParseException dateTimeParseException) {
            throw new DateTimeException(dateTimeParseException.getParsedString() + "is not a valid 'yyyy-MM-dd HH:mm' DateTime string");
        }

        return localDateTime;
    }

    public static String parseLocalDateTime(LocalDateTime localDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return localDateTime.format(dateTimeFormatter);
    }
}
