package com.example;
/*
TODO
Implement a Switch statement, use it to check whether or not we can eat raw oysters.
if month has r -> oysters are safe.
practice using switches for this.  

       // if (Month == FEBRUARY)
//        switch (month) {
//            case JANUARY:
//            case FEBRUARY:
//            case MARCH:
//            case APRIL:
//            case SEPTEMBER:
//            case OCTOBER:
//            case NOVEMBER:
//            case DECEMBER:
//   System.out.println(month + " contains an 'R' Oysters are good!");
//                break;
//            case MAY:
//            case JUNE:
//            case JULY:
//            case AUGUST:
//  System.out.println(month + " does not contain an 'R' Oysters are a no-go!");
//
//        }

Add some strings to tell us if Oysters are ok to eat in that month.
        String Oygo = " Oysters are a go!";
        String Oyno = " Oysters are not good (right now)!";
 */

public class Main {

    public static void main(String[] args) {

        int numDays = Month.APRIL.getDaysIn(2014);
        System.out.println("April 2011 had " + numDays + " days");

        if (Month.APRIL.getDaysIn(2010)==30){
            System.out.println("SUCCESS: April has " + numDays + " days");
        } else {
            System.out.println("FAIL: April SHOULD have 30 days");
        }

        int numDaysInFeb = Month.FEBRUARY.getDaysIn(2000);
        if (numDaysInFeb == 29){
            System.out.println("SUCCESS: February 2000 has 29 days");
        } else {
            System.out.println("FAIL: February 2000 should have 29 days but was " + numDaysInFeb);
        }

         numDaysInFeb = Month.FEBRUARY.getDaysIn(2001);
        if (numDaysInFeb == 28){
            System.out.println("SUCCESS: February 2001 has 28 days");
        } else {
            System.out.println("FAIL: February 2001 should have 28 days but was " + numDaysInFeb);
        }
    }
}
