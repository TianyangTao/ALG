package com.example.algorithm.casic.basic.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class DateCalculator {
    public static void main(String[] args) {
        String timeType = "month";
        String timeNumber = "12";
        System.out.println(calculateDays_jdk18(timeType, timeNumber));

        System.out.println(calculateDays_jdk17("year", timeNumber));
    }

    /**
     * 返回当前时间之后增加指定日、月、年后的天数
     * jdk1.8及之后可用
     * @param timeType
     * @param timeNumber
     * @return
     */
    public static int calculateDays_jdk18(String timeType, String timeNumber) {
        LocalDate today = LocalDate.now();
        LocalDate futureDate = null;
        int time = Integer.parseInt(timeNumber);
        if (timeType.equalsIgnoreCase("day")) {
            futureDate = today.plusDays(time);
        } else if (timeType.equalsIgnoreCase("month")) {
            futureDate = today.plusMonths(time);
        } else if (timeType.equalsIgnoreCase("year")) {
            futureDate = today.plusYears(time);
        }
        Period period = Period.between(today, futureDate);
        return period.getDays();
    }
    /**
     * 返回当前时间之后增加指定日、月、年后的天数
     * jdk1.7及之后可用
     * @param timeType
     * @param timeNumber
     * @return
     */
    public static int calculateDays_jdk17(String timeType, String timeNumber) {
        Calendar today = Calendar.getInstance();
        Calendar futureDate = Calendar.getInstance();
        int time = Integer.parseInt(timeNumber);
        if (timeType.equalsIgnoreCase("day")) {
            futureDate.add(Calendar.DAY_OF_MONTH, time);
        } else if (timeType.equalsIgnoreCase("month")) {
            futureDate.add(Calendar.MONTH, time);
        } else if (timeType.equalsIgnoreCase("year")) {
            futureDate.add(Calendar.YEAR, time);
        }
        long diff = futureDate.getTimeInMillis() - today.getTimeInMillis();
        return (int) (diff / (24 * 60 * 60 * 1000));
    }

}
