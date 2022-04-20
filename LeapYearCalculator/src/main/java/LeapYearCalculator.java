public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;

        boolean isLeapYear;

        isLeapYear = (year % 4 == 0) && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);

        return isLeapYear;
    }
}
