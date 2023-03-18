
public class PrintStringValuesRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String longestDay = getLongestString(daysOfWeek);
		System.out.println("Longest day: " + longestDay);
		getReverseOfDays(daysOfWeek);

	}

	private static void getReverseOfDays(String[] daysOfWeek) {
		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}

	}

	private static String getLongestString(String[] daysOfWeek) {
		String longestDay = "";
		int longestDayLength = 0;
		for (String day : daysOfWeek) {
			if (longestDayLength < day.length()) {
				longestDayLength = day.length();
				longestDay = day;
			}
		}
		return longestDay;
	}

}
