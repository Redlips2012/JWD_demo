package training.util;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeUtils {

	public static LocalTime stringToLocalTime(String timeString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(GlobalTimeFormat.CURRENT_PATTERN.timePattern);

		LocalTime localTime = LocalTime.parse(timeString, formatter);
		return localTime;
	}

	public static Time stringToSqlTime(String timeString) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(GlobalTimeFormat.CURRENT_PATTERN.timePattern);
		Time sqlTime = null;
		try {
			java.util.Date utilDate = formatter.parse(timeString);
			 sqlTime = new Time(utilDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sqlTime;
	}

}
