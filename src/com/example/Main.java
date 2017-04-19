package com.example;

public class Main {

    public static void main(String[] args) {

        int numDays = Month.JANUARY.getDaysIn(2014);
        System.out.println("JANUARY 2011 had " + numDays + " days");

        if (Month.JANUARY.getDaysIn(2010)==31){
            System.out.println("SUCCESS: January has " + numDays + " days");
        } else {
            System.out.println("FAIL: January SHOULD have 31 days");
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

        numDays = Month.MARCH.getDaysIn(2014);
        System.out.println("April 2011 had " + numDays + " days");

        if (Month.MARCH.getDaysIn(2010)==31){
            System.out.println("SUCCESS: MARCH has " + numDays + " days");
        } else {
            System.out.println("FAIL: MARCH SHOULD have 31 days");
        }

        numDays = Month.APRIL.getDaysIn(2014);
        System.out.println("April 2011 had " + numDays + " days");

        if (Month.APRIL.getDaysIn(2010)==30){
            System.out.println("SUCCESS: April has " + numDays + " days");
        } else {
            System.out.println("FAIL: April SHOULD have 30 days");
        }

        numDays = Month.MAY.getDaysIn(2014);
        System.out.println("MAY 2011 had " + numDays + " days");

        if (Month.MAY.getDaysIn(2010)==31){
            System.out.println("SUCCESS: MAY has " + numDays + " days");
        } else {
            System.out.println("FAIL: MAY SHOULD have 31 days");
        }

        numDays = Month.JUNE.getDaysIn(2014);
        System.out.println("JUNE 2011 had " + numDays + " days");

        if (Month.JUNE.getDaysIn(2010)==30){
            System.out.println("SUCCESS: JUNE has " + numDays + " days");
        } else {
            System.out.println("FAIL: JUNE SHOULD have 30 days");
        }

        numDays = Month.JULY.getDaysIn(2014);
        System.out.println("JULY 2011 had " + numDays + " days");

        if (Month.JULY.getDaysIn(2010)==31){
            System.out.println("SUCCESS: JULY has " + numDays + " days");
        } else {
            System.out.println("FAIL: JULY SHOULD have 31 days");
        }

        numDays = Month.AUGUST.getDaysIn(2014);
        System.out.println("AUGUST 2011 had " + numDays + " days");

        if (Month.AUGUST.getDaysIn(2010)==31){
            System.out.println("SUCCESS: AUGUST has " + numDays + " days");
        } else {
            System.out.println("FAIL: AUGUST SHOULD have 31 days");
        }

        numDays = Month.SEPTEMBER.getDaysIn(2014);
        System.out.println("SEPTEMBER 2011 had " + numDays + " days");

        if (Month.SEPTEMBER.getDaysIn(2010)==30){
            System.out.println("SUCCESS: SEPTEMBER has " + numDays + " days");
        } else {
            System.out.println("FAIL: SEPTEMBER SHOULD have 30 days");
        }

        numDays = Month.OCTOBER.getDaysIn(2014);
        System.out.println("OCTOBER 2011 had " + numDays + " days");

        if (Month.OCTOBER.getDaysIn(2010)==31){
            System.out.println("SUCCESS: OCTOBER has " + numDays + " days");
        } else {
            System.out.println("FAIL: OCTOBER SHOULD have 31 days");
        }

        numDays = Month.NOVEMBER.getDaysIn(2014);
        System.out.println("NOVEMBER 2011 had " + numDays + " days");

        if (Month.NOVEMBER.getDaysIn(2010)==30){
            System.out.println("SUCCESS: NOVEMBER has " + numDays + " days");
        } else {
            System.out.println("FAIL: NOVEMBER SHOULD have 30 days");
        }

        numDays = Month.DECEMBER.getDaysIn(2014);
        System.out.println("DECEMBER 2011 had " + numDays + " days");

        if (Month.DECEMBER.getDaysIn(2010)==31){
            System.out.println("SUCCESS: DECEMBER has " + numDays + " days");
        } else {
            System.out.println("FAIL: DECEMBER SHOULD have 31 days");
        }
    }
}
