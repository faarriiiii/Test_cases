public class leapYear {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }




    public static int countSundaysfrom1901() {

        //how many Sundays fell on the first day of the month

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayOfWeek = 1; // 1 Jan 1900 was Monday → dayOfWeek = 1
        int sundayCount = 0;

        for (int year = 1900; year < 1901; year++) {
            for (int month = 0; month < 12; month++) {
                if (dayOfWeek == 0) {
                    sundayCount++;
                }

                int days = daysInMonth[month];
                if (month == 1 && isLeapYear(year)) {
                    days += 1;
                }

                dayOfWeek = (dayOfWeek + days) % 7;
            }
        }

        return sundayCount;

    }

    public static void main(String[] args) {
        if (!isLeapYear(2028)) {
            throw new AssertionError("Test 1 failed: 2028 should e a leap year");
        }

        if (isLeapYear(2025)) {
            throw new AssertionError("Test 2 failed: 2025 should not be a leap year");
        }

        if (isLeapYear(1900)) {
            throw new AssertionError("Test 3 failed: 1900 should not be a leap year");
        }

        if (!isLeapYear(2000)) {
            throw new AssertionError("Test 4 failed: 2000 should be a leap year");
        }

        // js checking for isleapyear func

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int febDays = isLeapYear(1996) ? 29 : 28;
        if (febDays != 29) {
            throw new AssertionError("Test 5 failed: Feb in 1996 should be 29 days");
        }
        // checking for the array daysinmonth

        int febDaysnonLeap = isLeapYear(1900) ? 29 : 28;
        if (febDaysnonLeap != 28) {
            throw new AssertionError("Test 6 failed: non leap year means feb should have 28 days only");
        }

        int janfirst1900 = 1;
        int janseventh1900 = (janfirst1900 + 6) % 7;
        if (janseventh1900 != 0) {
            throw new AssertionError("Test 8 failed: 7 Jan 1900 should be Sunday");
        }

        if (countSundaysfrom1901() != 2) {
            throw new AssertionError("Test 9 failed: Does not work for 1901");
        }

        int dayOfWeek = (1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31) % 7;
        if (dayOfWeek != 2) {
            throw new AssertionError("Test 10 failed: 1 Jan 1901 should be a Tuesday");
        }


        System.out.println("All tests passed");
    }
}
