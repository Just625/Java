package com.codegym;

public class NextDayCalculator {

    public static String calculateNextDay(int day, int month, int year) {
        int MAX_DAY_OF_MONTH = 31;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                MAX_DAY_OF_MONTH = 30;
                break;
            case 2:
                boolean isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
                if (isLeapYear) {
                    MAX_DAY_OF_MONTH = 29;
                } else {
                    MAX_DAY_OF_MONTH = 28;
                }
                break;
        }
        if (day == MAX_DAY_OF_MONTH) {
            if (month == 12) {
                day = 1;
                month = 1;
                year++;
            } else {
                day = 1;
                month += 1;
            }
        } else {
            day++;
        }
        return day + "/" + month + "/" + year;
    }
}
