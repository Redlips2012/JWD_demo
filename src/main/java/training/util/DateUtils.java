package training.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateUtils {

	public static String convertDateToString(Date input, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String ouput = sdf.format(input);
		return ouput;
	}

	public static java.sql.Date sqlDateToString(String date) throws ParseException {

		return convertUtilToSqlDate(StringToDate(date));
	}

	public static java.sql.Date StringToSqlDate(String date) throws ParseException {

		return convertUtilToSqlDate(StringToDate(date));
	}

	public static java.sql.Date convertUtilToSqlDate(Date input) {

		return new java.sql.Date(input.getTime());

	}

	public static Date StringToDate(String date) throws ParseException {
		Date st = null;
		SimpleDateFormat sdf = new SimpleDateFormat(GlobalDateFormat.CURRENT_PATTERN.datePattern);
		sdf.setLenient(false);
		st = sdf.parse(date);
		return st;

	}

//    public static boolean isVaildDay(String TestDate) {
//	LocalDate now = LocalDate.now();
//	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
//	LocalDate TestLocalDate = LocalDate.parse(TestDate, dtf);
//	return TestLocalDate.isBefore(now);
//    }

	public static boolean isDateBeforeAchor(java.sql.Date inputDate, String achorDate, String format)
			throws IllegalArgumentException, NullPointerException, ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		simpleDateFormat.setLenient(false);
		Date achorDateSQL = DateUtils.StringToSqlDate(achorDate);
		if (inputDate.before(achorDateSQL))
			return true;
//	    Calendar calendarOfInput = new GregorianCalendar();
//	    Calendar calendarOfAchor = new GregorianCalendar();
//	    calendarOfInput.setTime(inputDate);calendarOfAchor.setTime(inputDate)
//	    int inputYear = calendar.get(Calendar.YEAR);
//	    int achorYear = calendar.get(Calendar.YEAR);
//	    if (inputYear <= 1900)
//		throw new DateException("Birthday must be after year 1900");	
		return false;

	}

	public static boolean isDateBeforeAchor(java.sql.Date inputDate, Date achorDateSQL) {
		if (inputDate.before(achorDateSQL))
			return true;
		return false;

	}

	public static boolean isDateAfterAchor(java.sql.Date inputDate, String achorDate, String format)
			throws IllegalArgumentException, NullPointerException, ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		simpleDateFormat.setLenient(false);
		Date achorDateSQL = DateUtils.StringToSqlDate(achorDate);
		if (inputDate.after(achorDateSQL))
			return true;
		return false;

	}

	public static boolean isDateAfterAchor(java.sql.Date inputDate, java.sql.Date achorDateSQL) {
		if (inputDate.after(achorDateSQL))
			return true;
		return false;

	}

	public static long dayDiff(java.sql.Date dateStart, java.sql.Date dateEnd) {
		LocalDate dateStartLocalDate = dateStart.toLocalDate();
		LocalDate dateEndLocalDate = dateEnd.toLocalDate();
		long daysDifference = ChronoUnit.DAYS.between(dateStartLocalDate, dateEndLocalDate);
		return daysDifference;
	}

	public static long dayDiff(String dateStart, String dateEnd) {
		LocalDate dateStartLocalDate;
		LocalDate dateEndLocalDate;
		long daysDifference = 0;
		try {
			dateEndLocalDate = StringToSqlDate(dateEnd).toLocalDate();
			dateStartLocalDate = StringToSqlDate(dateStart).toLocalDate();
			daysDifference = ChronoUnit.DAYS.between(dateStartLocalDate, dateEndLocalDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return daysDifference;
	}

	public static long dayDiff(java.sql.Date dateStart, String dateEnd) {
		LocalDate dateStartLocalDate;
		LocalDate dateEndLocalDate;
		long daysDifference = 0;
		try {
			dateEndLocalDate = StringToSqlDate(dateEnd).toLocalDate();
			dateStartLocalDate = dateStart.toLocalDate();
			daysDifference = ChronoUnit.DAYS.between(dateStartLocalDate, dateEndLocalDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return daysDifference;
	}

	public static long dayDiff(String dateStart, java.sql.Date dateEnd) {
		LocalDate dateStartLocalDate;
		LocalDate dateEndLocalDate;
		long daysDifference = 0;
		try {
			dateStartLocalDate = StringToSqlDate(dateStart).toLocalDate();
			dateEndLocalDate = dateEnd.toLocalDate();
			daysDifference = ChronoUnit.DAYS.between(dateStartLocalDate, dateEndLocalDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return daysDifference;
	}

	public static long monthDiff(java.sql.Date dateStart, java.sql.Date dateEnd) {
		LocalDate dateStartLocalDate = dateStart.toLocalDate();
		LocalDate dateEndLocalDate = dateEnd.toLocalDate();
		long daysDifference = ChronoUnit.MONTHS.between(dateStartLocalDate, dateEndLocalDate);
		return daysDifference;
	}

	public static long monthDiff(String dateStart, String dateEnd) {
		LocalDate dateStartLocalDate;
		LocalDate dateEndLocalDate;
		long daysDifference = 0;
		try {
			dateEndLocalDate = StringToSqlDate(dateEnd).toLocalDate();
			dateStartLocalDate = StringToSqlDate(dateStart).toLocalDate();
			daysDifference = ChronoUnit.MONTHS.between(dateStartLocalDate, dateEndLocalDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return daysDifference;
	}

	public static long monthDiff(java.sql.Date dateStart, String dateEnd) {
		LocalDate dateStartLocalDate;
		LocalDate dateEndLocalDate;
		long daysDifference = 0;
		try {
			dateEndLocalDate = StringToSqlDate(dateEnd).toLocalDate();
			dateStartLocalDate = dateStart.toLocalDate();
			daysDifference = ChronoUnit.MONTHS.between(dateStartLocalDate, dateEndLocalDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return daysDifference;
	}

	public static long monthDiff(String dateStart, java.sql.Date dateEnd) {
		LocalDate dateStartLocalDate;
		LocalDate dateEndLocalDate;
		long daysDifference = 0;
		try {
			dateStartLocalDate = StringToSqlDate(dateStart).toLocalDate();
			dateEndLocalDate = dateEnd.toLocalDate();
			daysDifference = ChronoUnit.MONTHS.between(dateStartLocalDate, dateEndLocalDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return daysDifference;
	}

	public static java.sql.Date plusDays(java.sql.Date targetDate, int numberOfDays) {
		LocalDate targetDateLocaldate = targetDate.toLocalDate();
		targetDateLocaldate = targetDateLocaldate.plusDays(numberOfDays);
		targetDate = java.sql.Date.valueOf(targetDateLocaldate);
		return targetDate;
	}

	public static java.sql.Date plusMonths(java.sql.Date targetDate, int numberOfDays) {
		LocalDate targetDateLocaldate = targetDate.toLocalDate();
		targetDateLocaldate = targetDateLocaldate.plusMonths(numberOfDays);
		targetDate = java.sql.Date.valueOf(targetDateLocaldate);
		return targetDate;
	}

	public static LocalDate stringToLocalDate(String stringDate) throws DateTimeParseException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(GlobalDateFormat.CURRENT_PATTERN.datePattern);
		LocalDate localDate = LocalDate.parse(stringDate, dtf);
		return localDate;

	}

	public static java.sql.Date localDateToSqlDate(LocalDate localDate) {
		return java.sql.Date.valueOf(localDate);
	}

	public static void sqlDateToLocalDate(java.sql.Date sqldate) {
		LocalDate ld = sqldate.toLocalDate();

	}
	public static LocalDate utilDateToLocalDate(Date utilDate) {
	        Instant instant = utilDate.toInstant();
	        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();		
	        return localDate;
	}
}
