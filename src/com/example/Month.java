package com.example;

/**
 * Create a Month enumeration
 * The enumeration should have a method:
 * numDaysIn (year){
 * return days;
 * }
 * Write a special case for february that checks isLeapYear..
 * if true, return ++days;
 * <p>
 * Write some test cases in the main method of Main.
 * --------------------------
 * public enum Category {
 * <p>
 * APPLE("3"),
 * ORANGE("1"),
 * GRAPE("GRAPE"),
 * BANANA("Banana");
 * <p>
 * private final String identifier;
 * <p>
 * private Category(String identifier) {
 * this.identifier = identifier;
 * }
 * <p>
 * <p>
 * public String toString() {
 * return identifier;
 * }
 * <p>
 * public static String getEnumNameForValue(Object value){
 * Category[] values = Category.values();
 * String enumValue = null;
 * for(Category eachValue : values) {
 * enumValue =eachValue.toString();
 * <p>
 * if (enumValue.equals(value)) {
 * return eachValue.name();
 * }
 * }
 * return enumValue;
 * }
 * <p>
 * ============================
 * public enum Month {
 * JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30),
 * JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30),
 * DECEMBER(31);
 * <p>
 * private final int daysIn;
 * <p>
 * private Month(int daysIn) {
 * this.daysIn = daysIn;
 * }
 * <p>
 * public String toString() {
 * return daysIn;
 * }
 * <p>
 * public static int getEnumNameForValue(Object value){
 * Month[] values = Month.values();
 * String enumValue = null;
 * for(Month eachValue : values) {
 * enumValue =eachValue.toString();
 * <p>
 * if (enumValue.equals(value)) {
 * return eachValue.name();
 * }
 * }
 * return enumValue;
 * }
 */
//public enum Month {
//    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30),
//    JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30),
//    DECEMBER(31);
//    private int daysIn;
//    //Constructor
//    Month(int daysIn) {
//        this.daysIn = daysIn;
//    }
//    //Methods
//    public int numDaysIn (int year) {
//        //if month !==February : return days IN
//        System.out.println();
//            return daysIn;
//        //else, check if its leap year.
//        //return 28;
//            //else return 29;
//    }
//    }
//}
public enum Month {
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30),
    JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30),
    DECEMBER(31);

    private int daysIn;

    Month(int daysIn) {
        this.daysIn = daysIn;
    }

    public int getDaysIn(int year) {
        if (this.name().equals("FEBRUARY")) {
            if (year % 4 == 0) {
                return daysIn + 1;
            } else {
                return daysIn;
            }
        } else {
            return daysIn;
        }
    }

    @Override
    public String toString() {
        return "Month{" +
                "daysIn=" + daysIn +
                '}';
    }


}


