package training.util;


public enum GlobalDateFormat {
    CURRENT_PATTERN("yyyy-M-d");
    String datePattern;

    GlobalDateFormat(String pattern) {
	this.datePattern = pattern;
    }
   
}
