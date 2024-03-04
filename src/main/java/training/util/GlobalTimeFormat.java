package training.util;

public enum GlobalTimeFormat {
    CURRENT_PATTERN("HH:mm:ss");
    String timePattern;

    GlobalTimeFormat(String pattern) {
	this.timePattern = pattern;
    }
   
}
